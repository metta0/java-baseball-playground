package study.baseballPlay.m2;

public class ResultView {

    public void printScore(BaseballGameScore score){
        if(score.isBallAndStrikeExists()){
            System.out.printf("%d볼 %d스트라이크\n", score.getBallCount(), score.getStrikeCount());
        }
        else if(score.isBallExists()){
            System.out.printf("%d볼\n", score.getBallCount());
        }else if(score.isStikeExists()){
            System.out.printf("%d스트라이크\n", score.getStrikeCount());
        }else if(score.isNothing()){
            System.out.printf("낫싱\n", score.getStrikeCount());
        }
    }

    public void askToContinue(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
