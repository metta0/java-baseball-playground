package study.baseballPlay.m3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {
    private ArrayList<Ball> balls;
    static private Count count;

    Balls(List<Integer> values){
        Set<Integer> valuesSet = new HashSet<>(values);
        if(values.size() != valuesSet.size()){
            throw new IllegalArgumentException("Duplicate values exist");
        }

        balls = new ArrayList<Ball>();
        count = new Count();

        for(int i=0; i< values.size(); i++){
            balls.add(new Ball(i, values.get(i)));
        }


    }

    private ArrayList<Ball> getBalls(){
        return balls;
    }

    public static Count play(Balls balls1, Balls balls2){
        ArrayList<Ball> myBalls = balls1.getBalls();
        ArrayList<Ball> opponentBalls = balls2.getBalls();
        
        for(Ball ball : myBalls){
            for(Ball oppenentsBall : opponentBalls){
                if(ball.play(oppenentsBall) == BallStatus.STRIKE){
                    count.hitStrike();
                }
                else if(ball.play(oppenentsBall) == BallStatus.BALL){
                    count.hitBall();
                }
            }
        }
        if(noStrikesOrBalls()){
            count.hitNothing();
        }

        return count;
    }

    private static boolean noStrikesOrBalls(){
        return count.getNumberOfStrikes() == 0 
               && count.getNumberOfBalls() ==0;
    }
    
}
