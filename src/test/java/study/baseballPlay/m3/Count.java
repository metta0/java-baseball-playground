package study.baseballPlay.m3;

public class Count {
    private int strike;
    private int ball;
    private boolean nothing;

    Count(){
        strike =0;
        ball =0;
        nothing = false;
    }
    public void setCount(int numberOfStrikes, int numberOfBalls){
        strike = numberOfStrikes;
        ball = numberOfBalls;
        if(strike ==0 && ball == 0){
            nothing = true;
        }
    }
    
    public boolean isStrikeExists(){
        return strike != 0;
    }
    
    public boolean isBallExists(){
        return ball != 0;
    }

    public void hitStrike(){
        strike+=1;
    }

    public void hitBall(){
        ball+=1;
    }

    public void hitNothing(){
        nothing = true;
    }

    public int getNumberOfStrike(){
        return strike;
    }
    
    public int getNumberOfBall(){
        return ball;
    }

    public boolean isNothing(){
        return nothing;
    }

    public boolean isRoundNotOver(){
        return !isRoundOver();
    }
    public boolean isRoundOver(){
        return strike == 3;
    }
}
