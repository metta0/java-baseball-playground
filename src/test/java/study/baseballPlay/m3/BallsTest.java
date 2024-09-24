package study.baseballPlay.m3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BallsTest {
    
    private Balls balls;
    private Count count;

    @BeforeAll
    public void setUpTest(){
        balls = new Balls(Arrays.asList(1,2,3));
        count = new Count();
    }
    @Test
    public void strike3Test(Balls opponentsBalls){
        balls.play(opponentsBalls);
        assertThat(count.getNumberOfStrikes()).isEqualTo(3);
        
    }
}
