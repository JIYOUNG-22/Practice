package com.dyong.chapter03.method_and_api.level01;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int answer = 0;
        for(int i = 1; i<= 10; i++){
            answer = answer + i;
        }
        return answer;
    }

    public void checkMaxNumber(int a, int b){
        System.out.println("두 수 중 큰 수는 " + ((a < b) ? b : a) + "이다.");

    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }

    public int minusTwoNumber(int a, int b){
        int answer = 0;

        if (a>=b){
            answer = a - b;
        } else {
            answer = b - a;
        }
        return answer;
    }

}
