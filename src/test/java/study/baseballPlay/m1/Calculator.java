package study.baseballPlay.m1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Calculator {
    String[] expression;
    
    int result = 0;
    
    public void getAndParseExpression(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        expression = input.split(" ");
        scanner.close();
    }

    public void calculateExpression(){
        result = Integer.parseInt(expression[0]);

        for(int i=0 ; i < expression.length ; i++){
            if(isDigit(expression[i]) == false){ 
                arithmeticOperations(expression[i], Integer.parseInt(expression[i+1]));
            }
        }
    }

    private boolean isDigit(String value){
        try{
            Integer.parseInt(value);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    private void arithmeticOperations(String operator, int value){
        if(operator.equals("+")){
            result += value;
        }
        else if(operator.equals("-")){
            result -= value;
        }
        else if(operator.equals("*")){
            result *= value;
        }
        else if(operator.equals("/")){
            result /= value;
        }
    }

    @Test
    void arithmeticOperationsTest(){
        arithmeticOperations("+", 3);
        assertEquals(result, 3);
        
        result = 0;
        arithmeticOperations("-", 3);
        assertEquals(result, -3);
        
        result = 2;
        arithmeticOperations("*", 3);
        assertEquals(result, 6);
        
        result = 6;
        arithmeticOperations("/", 3);
        assertEquals(result, 2);        
        
    }
    
    public void printResult(){
        System.out.println(result);
    }
}
