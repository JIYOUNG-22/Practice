package com.dyong.chapter03.method_and_api.level01;

public class Application1 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.checkMethod();
        System.out.println("1부터 10까지의 함 : " + calculator.sum1to10());
        calculator.checkMaxNumber(10, 20);
        System.out.println("10과 20의 합은 " + calculator.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차는 : " + calculator.minusTwoNumber(10,5));
    }
}


