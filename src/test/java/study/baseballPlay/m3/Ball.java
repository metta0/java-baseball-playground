package study.baseballPlay.m3;

public class Ball {
    private int position;
    private int value;

    Ball(int position, int value){
        if(position > 2){
            throw new IllegalArgumentException("Position" + value +"must be < 3");
        }
        if(value<1 || value>9){
            throw new IllegalArgumentException("Value" + value +"must be between 1 and 9");
        }
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public int getValue() {
        return value;
    }

	public Boolean isStrike(Ball opponentsBall) {
        return matchesExactly(opponentsBall);
	}

	public Boolean isBall(Ball opponentsBall) {
		return matchesValueOnly(opponentsBall);
	}

	public Boolean isNothing(Ball opponentsBall) {
		return matchesNothing(opponentsBall);
    }

    private Boolean matchesExactly(Ball opponentsBall){
        return this.getPosition() == opponentsBall.getPosition() 
        && this.getValue() == opponentsBall.getValue();
    }

    private Boolean matchesValueOnly(Ball opponentsBall){
        return this.getPosition() != opponentsBall.getPosition() 
        && this.getValue() == opponentsBall.getValue();
    }

    private Boolean matchesNothing(Ball opponentsBall){
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
