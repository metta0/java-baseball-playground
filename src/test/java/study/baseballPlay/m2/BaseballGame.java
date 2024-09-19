package study.baseballPlay.m2;

import java.util.ArrayList;

public class BaseballGame {
    ArrayList<Integer> answer;
    int strike, ball = 0;
    boolean nothing = false;

    public void playGame(){
        setAnswer();
    }

    private void setAnswer(){
        answer = new ArrayList<Integer>();
        answer.add((int)(Math.random()*10));
        answer.add((int)(Math.random()*10));
        answer.add((int)(Math.random()*10));
    }
    
}
