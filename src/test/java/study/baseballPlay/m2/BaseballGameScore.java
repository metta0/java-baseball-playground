package study.baseballPlay.m2;

import java.util.ArrayList;

public class BaseballGameScore {
    int strike;
    int ball;
    boolean nothing;
    ArrayList<Integer> trialNumber;
    ArrayList<Integer> answer;

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
}
