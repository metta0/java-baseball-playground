package study.baseballPlay.m2;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BaseballGameTest {
    private BaseballGame game;

    
    @BeforeEach
    void setUpTest(){
        game = new BaseballGame();
        game.runGame();
    }
    
    // @Test
    // public void setUpSizeOfAnswerTest() {
    //     assertEquals(game.answer.size(), CALLS_REAL_METHODS);
    // }

}
