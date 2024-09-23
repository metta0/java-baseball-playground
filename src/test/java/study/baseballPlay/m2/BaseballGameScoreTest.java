package study.baseballPlay.m2;

import org.junit.jupiter.api.Test;

public class BaseballGameScoreTest {
    BaseballGameScore baseballGameScore;
    @Test
    public void testScoreInitialization(){
        baseballGameScore = new BaseballGameScore();
        baseballGameScore.initialize();
    }
}
