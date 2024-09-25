package study.baseballPlay.m3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallsTest {
    
    private Balls myBalls;
    private Count count;

    @BeforeEach
    public void setUpTest(){
        myBalls = new Balls(Arrays.asList(1,2,3));
        count = new Count();
    }
    @Test
    public void strike3Test(){
        Balls opponentsBalls = new Balls(Arrays.asList(1,2,3));
        assertThat(Balls.play(myBalls,opponentsBalls).getNumberOfStrike()).isEqualTo(3);
    }
    @Test
    public void ball2strike1Test(){
        Balls opponentsBalls = new Balls(Arrays.asList(1,3,2));
        count = Balls.play(myBalls,opponentsBalls);
        assertThat(count.getNumberOfStrike()).isEqualTo(1);
        assertThat(count.getNumberOfBall()).isEqualTo(2);
    }
    @Test
    public void ball3Test(){
        Balls opponentsBalls = new Balls(Arrays.asList(3,1,2));
        count = Balls.play(myBalls,opponentsBalls);
        assertThat(count.getNumberOfStrike()).isEqualTo(0);
        assertThat(count.getNumberOfBall()).isEqualTo(3);
    }
    @Test
    public void nothingTest(){
        Balls opponentsBalls = new Balls(Arrays.asList(4,5,6));
        count = Balls.play(myBalls,opponentsBalls);
        assertThat(count.isNothing()).isEqualTo(true);
        
    }
    @Test
    public void isStrikeOrBallExistsTest(){

    }
}
