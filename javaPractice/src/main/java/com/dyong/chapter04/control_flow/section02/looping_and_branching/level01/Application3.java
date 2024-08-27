package com.dyong.chapter04.control_flow.section02.looping_and_branching.level01;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int num = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            if(i % 2 == 1) continue;
            sum += i;
        }

        System.out.println("1부터 "+ num + "까지 짝수의 합 : " + sum);
    }
}
/* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
 *
 * -- 입력 예시 --
 * 정수를 입력하세요 : 10
 *
 * -- 출력 예시 --
 * 1부터 10까지 짝수의 합 : 30
 * */