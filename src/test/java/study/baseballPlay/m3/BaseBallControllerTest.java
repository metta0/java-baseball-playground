package study.baseballPlay.m3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseballControllerTest {
    InputView inputView;
    ResultView resultView;
    BaseballController baseballContoller;
    
    @BeforeEach
    public void setUpTest(){
        baseballContoller = new BaseballController();
    }

    @Test
    public void inputViewTest(){
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
        
        String simulatedInput  = "123\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        inputView = new InputView();
        ArrayList<Integer> trialNumber = inputView.getNumbersFromUser();
        assertEquals(answer, trialNumber);
    }

    @Test
    public void resultViewTextOfScoreTest(){
        resultView = new ResultView();
        Count count = Balls.play(new Balls(Arrays.asList(1,2,3)),new Balls(Arrays.asList(1,3,4)));
        assertThat(resultView.getTextOfScore(count)).contains("1볼 1스트라이크");
    }
    
}
