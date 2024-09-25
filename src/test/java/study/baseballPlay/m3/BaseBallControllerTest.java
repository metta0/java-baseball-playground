package study.baseballPlay.m3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BaseBallControllerTest {
    //InputView inputView;
    //ResultView resultView;
    static BaseBallController baseBallContoller;
    
    @BeforeAll
    public static void setUpTest(){
        baseBallContoller = new BaseBallController();
    }
    @Test
    public void set3RandomNumbersTest(){
        Balls balls= new Balls(baseBallContoller.set3RandomNumbers());
        assertEquals(balls, balls);
    }
    
}
