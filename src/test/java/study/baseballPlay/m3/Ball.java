package study.baseballPlay.m3;

import java.util.function.BooleanSupplier;

public class Ball {
    private int position;
    private int value;

    Ball(int position, int value){
        this.position = position;
        this.value = value;
    }

    public Object getPosition() {
        return position;
    }

    public Object getValue() {
        return value;
    }

	public Boolean isStrike(Ball opponentsBall) {
        return this.getPosition() == opponentsBall.getPosition() 
        && this.getValue() == opponentsBall.getValue();
	}

	public Boolean isBall(Ball opponentsBall) {
		return this.getPosition() != opponentsBall.getPosition() 
        && this.getValue() == opponentsBall.getValue();
	}

	public Boolean isNothing(Ball opponentsBall) {
		return this.getPosition() != opponentsBall.getPosition() 
        && this.getValue() != opponentsBall.getValue();
	}

    public BallStatus play(Ball opponentsBall) {
        
        if(this.isStrike(opponentsBall)){
            return BallStatus.STRIKE;
        }
        else if(this.isBall(opponentsBall)){
            return BallStatus.BALL;
        }        
        
        return BallStatus.NOTHING;
    }


}
