package study.baseballPlay.m2;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseballGame {
    ArrayList<Integer> answer;
    ArrayList<Integer> trial;
    int strike, ball = 0;
    boolean nothing = false;

    public void runGame(){
        setupGame();
        while(isGameOver() == false){
           gameRound(); 
        }
        endOrRestartGame();
    }

    private void setupGame(){
        setAnswer();
        resetStrikeBallNothing();
    }

    private void gameRound(){
        resetStrikeBallNothing();
        getTrialNumberFromUser();
        countStrikeBallNothing();
        printStrikeBallNothing();
    }

    private boolean isGameOver(){
        return strike == 3;
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

    private void resetStrikeBallNothing(){
        strike = 0;
        ball = 0;
        nothing = false;
    }

    private void getTrialNumberFromUser(){
        trial = new ArrayList<Integer>();
        System.out.printf("숫자를 입력해 주세요 : ");
        Scanner scan = new Scanner(System.in);
        String[] number = scan.next().split("");
        
        for(String num : number){
        trial.add(Integer.parseInt(num));
        }
    } 
    
    private void countStrikeBallNothing(){
        for(int i =0; i<trial.size(); i++){
            countStrike(i);
        }
        for(int i =0; i<trial.size(); i++){
            countBall(i);
        }
        countNothing();
    }

    private void countStrike(int index){
        if(answer.get(index) == trial.get(index)){
            strike += 1;
        }
    }

    private void countBall(int index){
        if(answer.contains(trial.get(index)) && (answer.get(index) != trial.get(index)) ){
            ball+=1;
        }
    }
    
    private void countNothing(){
        if(strike == 0 && ball == 0){
            nothing = true;
        }
    }

    private void printStrikeBallNothing(){
        if(ball != 0 && strike != 0){
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
        }
        else if(ball !=0){
            System.out.printf("%d볼\n", ball);
        }else if(strike !=0){
            System.out.printf("%d스트라이크\n", strike);
        }else if(nothing){
            System.out.printf("낫싱\n", strike);
        }
    }

    private void endOrRestartGame(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == 1){
            runGame();
        }
    }
}
