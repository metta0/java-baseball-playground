package study.baseballPlay.m2;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    ArrayList<Integer> trialNumber;

    public ArrayList<Integer> getTrialNumberFromUser(ArrayList<Integer> trialNumber){
        System.out.printf("숫자를 입력해 주세요 : ");
        
        Scanner scan = new Scanner(System.in);
        String[] number = scan.next().split("");
        
        for(String num : number){
        trialNumber.add(Integer.parseInt(num));
        }

        return trialNumber;
    }

    public boolean isGameContinue(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        if(input == 1){
            return true;
        }
        return false;
    }
    
}
