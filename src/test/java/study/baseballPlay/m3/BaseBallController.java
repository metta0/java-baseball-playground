package study.baseballPlay.m3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballController {
    InputView inputView;
    ResultView resultView;

    BaseballController(){
        inputView = new InputView();
        resultView = new ResultView();
    }

    public void startGame(){
        playBaseball();

        if(isGameContinue())
            startGame();
    }


    private void playBaseball(){
        Balls answer = new Balls(set3RandomNumbers());
        playRoundUntilIsOver(answer);
    }
    
    private List<Integer> set3RandomNumbers() {
        Set<Integer> set = new HashSet<>();
        while(set.size() != 3){
            set.add((int)(Math.random()*9)+1);
        }
        return new ArrayList<>(set);
    }

    private void playRoundUntilIsOver(Balls answerBalls){
        Count score = playAndGetScore(answerBalls);
        showScore(score);

        if(score.isRoundNotOver())
            playRoundUntilIsOver(answerBalls);
    }

    private Count playAndGetScore(Balls answerBalls){
        Balls userBalls;
        Count score;
        List<Integer> userNumbers = inputView.getNumbersFromUser();

        userBalls = new Balls(userNumbers);
        score = Balls.play(answerBalls, userBalls);
        
        return score;
    }

    private void showScore(Count score){
        resultView.printScore(score);
    }


    private boolean isGameContinue() {
        resultView.askToContinue();

        return inputView.isGameContinue();
    }
}
