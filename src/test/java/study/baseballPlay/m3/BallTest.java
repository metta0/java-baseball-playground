package study.baseballPlay.m3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        ball4 = new Ball(4,1);
        ball5 = new Ball(3,4);
        
    }

    @Test
    public void isStirkeTest(){
        assertFalse(ball1.isStrike(ball2));
        assertTrue(ball1.isStrike(ball3));
    }

    @Test
    public void isBallTest(){
        assertTrue(ball1.isBall(ball4));
        assertFalse(ball1.isBall(ball2));
        assertFalse(ball1.isBall(ball5));
    }

    @Test
    public void isNothingTest(){
        assertTrue(ball1.isNothing(ball5));
        assertFalse(ball1.isNothing(ball4));
    }
        
}
