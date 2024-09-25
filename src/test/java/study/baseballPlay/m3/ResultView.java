package study.baseballPlay.m3;

public class ResultView {

    public String getTextOfScore(Count count){
        StringBuffer answer = new StringBuffer();
        
        if(count.isBallExists()){
            answer.append(count.getNumberOfBall());
            answer.append("볼 ");
        }else if(count.isStrikeExists()){
            answer.append(count.getNumberOfStrike());
            answer.append("스트라이크");
        }else if(count.isNothing()){
            answer.append("낫싱");
        }

        return answer.toString();
    }

    public void printScore(Count count){
        System.out.println(getTextOfScore(count));
    }

    public void askToContinue(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
