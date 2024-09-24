package study.baseballPlay.m3;


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
