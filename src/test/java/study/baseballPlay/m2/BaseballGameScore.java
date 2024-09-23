package study.baseballPlay.m2;

public class BaseballGameScore {
    private int strike;
    private int ball;
    private boolean nothing;

    BaseballGameScore(){
        strike = 0 ;
        ball = 0;
        nothing = false;
    }

    public void initialize(){
        strike = 0;
        ball = 0;
        nothing = false;
    }

    public void strike(){
        strike +=1;
    }
    
    public void ball(){
        ball += 1;
    }

    public void nothing(){
        nothing = true;
    }

    public int getStrikeCount(){
        return strike;
    }
    
    public int getBallCount(){
        return ball;
    }

    public boolean getIsNothing(){
        return nothing;
    }

    public boolean isZeroStrike(){
        return strike == 0;
    }

    public boolean isZeroBall(){
        return ball == 0;
    }

    public boolean isThreeStrike(){
        return strike == 3;
    }

    public void countIsNothing(){
        if(strike == 0 && ball == 0){
            nothing = true;
        }
    }

    public boolean isBallAndStrikeExists(){
        return ball !=0 && strike != 0;
    }

    public boolean isBallExists(){
        return ball !=0 ;
    }

    public boolean isStikeExists(){
        return strike !=0 ;
    }

    public boolean isNothing(){
        return nothing;
    }
}
