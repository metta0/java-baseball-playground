package study.baseballPlay.m2;

import java.util.Scanner;

public class ResultView {

    public void printScore(BaseballGameScore score){
        if(score.ball != 0 && score.strike != 0){
            System.out.printf("%d볼 %d스트라이크\n", score.ball, score.strike);
        }
        else if(score.ball !=0){
            System.out.printf("%d볼\n", score.ball);
        }else if(score.strike !=0){
            System.out.printf("%d스트라이크\n", score.strike);
        }else if(score.nothing){
            System.out.printf("낫싱\n", score.strike);
        }
    }

    public void askToContinue(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
