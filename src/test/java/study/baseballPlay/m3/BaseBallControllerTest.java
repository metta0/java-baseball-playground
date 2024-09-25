package study.baseballPlay.m3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseBallControllerTest {
    InputView inputView;
    ResultView resultView;
    BaseBallController baseBallContoller;
    
    @BeforeEach
    public void setUpTest(){
        baseBallContoller = new BaseBallController();
    }

    @Test
    public void testUnique3RandomNumbers(){
        Balls balls= new Balls(baseBallContoller.set3RandomNumbers());
        assertEquals(balls, balls);
    }

    @Test
    public void inputViewTest(){
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
        
        String simulatedInput  = "123\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        inputView = new InputView();
        ArrayList<Integer> trialNumber = inputView.get3NumbersFromUser();
        assertEquals(answer, trialNumber);
    }

    @Test
    public void resultViewTextOfScoreTest(){
        resultView = new ResultView();
        Count count = Balls.play(new Balls(Arrays.asList(1,2,3)),new Balls(Arrays.asList(2,3,4)));
        assertThat(resultView.getTextOfScore(count)).contains("2볼");
    }
}
