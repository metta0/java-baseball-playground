package study.baseballPlay.m3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    Ball ball5;

    @BeforeEach
    public void makeBall(){
        ball1 = new Ball(1,1);
        ball2 = new Ball(1,2);
        ball3 = new Ball(1,1);
        ball4 = new Ball(0,1);
        ball5 = new Ball(2,4);
        
    }

    @Test
    public void isStirkeTest(){
        assertThat(ball1.play(ball3)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    public void isBallTest(){
        assertThat(ball1.play(ball4)).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void isNothingTest(){
        assertThat(ball1.play(ball5)).isEqualTo(BallStatus.NOTHING);
        
    }

    @Test
    public void notValidPositionOrValueTest(){

        assertThatThrownBy(() -> {
            ball1 = new Ball(3,4);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Position");

        assertThatThrownBy(() -> {
            ball1 = new Ball(2,10);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Value");
    }
        
}
