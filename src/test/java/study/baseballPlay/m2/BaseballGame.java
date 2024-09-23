package study.baseballPlay.m2;

import java.util.ArrayList;

public class BaseballGame {
    private ArrayList<Integer> answer;
    private ArrayList<Integer> trialNumber;
    private BaseballGameScore score;
    private InputView inputView;
    private ResultView resultView;

    BaseballGame(){
        score = new BaseballGameScore();
        inputView = new InputView();
        resultView = new ResultView();
    }

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
        int randomNumber = (int)(Math.random()*9)+1;
        if(!answer.contains(randomNumber)){
            answer.add(randomNumber);
        }
    }

    private void initializeScore(){
        score.initialize();
    }

    private boolean isGameOver(){
        return score.isThreeStrike();
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
            score.strike();
        }
    }

    private void countBall(int index){
        if(answer.contains(trialNumber.get(index)) && (answer.get(index) != trialNumber.get(index)) ){
            score.ball();
        }
    }
    
    private void countNothing(){
        score.countIsNothing();
    }

    private void printScore(){
        resultView.printScore(score);
    }

    private void endOrRestartGame(){
        resultView.askToContinue();

        if(inputView.isGameContinue()){
            runGame();
        }
    }
}
