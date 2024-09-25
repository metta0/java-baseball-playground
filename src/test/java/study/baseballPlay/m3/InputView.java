package study.baseballPlay.m3;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    Scanner scanner;

    InputView(){
        scanner = new Scanner(System.in);
    }

    public ArrayList<Integer> getNumbersFromUser(){
        ArrayList<Integer> trialNumber = new ArrayList<>();

        System.out.printf("숫자를 입력해 주세요 : ");
        
        String[] number = scanner.nextLine().split("");

        for(String num : number){
            trialNumber.add(Integer.parseInt(num));
        }
        return trialNumber;
    }

    public boolean isGameContinue(){
        int input = Integer.parseInt(scanner.nextLine());
        
        if(input == 1)
            return true;
        return false;
    }

}
