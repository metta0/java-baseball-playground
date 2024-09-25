package study.baseballPlay.m3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ResultViewTest {
    
    ResultView resultView;

    @Test
    public void resultViewTextOfScoreTest(){
        resultView = new ResultView();
        Count count = Balls.play(new Balls(Arrays.asList(1,2,3)),new Balls(Arrays.asList(1,3,4)));
        assertThat(resultView.getTextOfScore(count)).contains("1볼 1스트라이크");
    }
}
