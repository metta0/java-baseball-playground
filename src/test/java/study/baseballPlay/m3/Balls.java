package study.baseballPlay.m3;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private ArrayList<Ball> balls;
    private Count count;

    Balls(List<Integer> values){
        balls = new ArrayList<Ball>();
        for(int i=0; i< values.size(); i++){
            balls.add(new Ball(i, values.get(i)));
        }
    }

    public void play(ArrayList<Ball> opponentsBalls){
        return balls.stream()
        .map(answer -> answer.play(opponentsBalls))
        .filter(status -> status != BallStatus.NOTHING)
        .findFirst()
        .orElse(BallStatus.NOTHING);

    }
    
}
