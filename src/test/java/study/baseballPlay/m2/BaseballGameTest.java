package study.baseballPlay.m2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class BaseballGameTest {
    ArrayList<Integer> answer;
    ArrayList<Integer> trialNumber;
    BaseballGameScore score;
    InputView inputView;
    ResultView resultView;

    BaseballGameTest(){
        score = new BaseballGameScore();
        inputView = new InputView();
        resultView = new ResultView();
    }

    @Test
    public void runGame(){
        setupGame();
        while(isGameOver() == false){
           gameRound(); 
        }
        endOrRestartGame();
    }

    private void setupGame(){
        setAnswer();
        initializeScore();
    }

    private void setAnswer(){
        answer = new ArrayList<Integer>();
        while(answer.size() != 3){
            setRandomNumber();
        }
    }
    
    private void setRandomNumber(){
        int randomNumber = (int)(Math.random()*10);
        if(!answer.contains(randomNumber) && randomNumber != 0){
            answer.add(randomNumber);
        }
    }

    private void initializeScore(){
        score.initialize();
    }

    private boolean isGameOver(){
        return score.strike == 3;
    }
    
    private void gameRound(){
        getTrialNumberFromUser();
        initializeScore();
        countScore();
        printScore();
    }

    private void getTrialNumberFromUser(){
        trialNumber = inputView.getTrialNumberFromUser(new ArrayList<Integer>());
    } 
    
    private void countScore(){
        for(int i =0; i<trialNumber.size(); i++){
            countStrike(i);
        }
        for(int i =0; i<trialNumber.size(); i++){
            countBall(i);
        }
        countNothing();
    }

    private void countStrike(int index){
        if(answer.get(index) == trialNumber.get(index)){
            score.strike += 1;
        }
    }

    private void countBall(int index){
        if(answer.contains(trialNumber.get(index)) && (answer.get(index) != trialNumber.get(index)) ){
            score.ball += 1;
        }
    }
    
    private void countNothing(){
        if(score.strike == 0 && score.ball == 0){
            score.nothing = true;
        }
    }

    private void printScore(){
        resultView.printScore(score);
    }

    private void endOrRestartGame(){
        resultView.askToContinue();

        if(inputView.isContinue()){
            runGame();
        }
    }
}
