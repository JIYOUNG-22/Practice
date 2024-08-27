package com.dyong.chapter05.array.section01.level01;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = scanner.nextInt();

        if(num<0 || num>4){
            System.out.println("준비된 과일이 없습니다.");
        } else {
            System.out.println(num == 0 ? fruit[0] : num == 1 ? fruit[1] : num == 2 ? fruit[2] : num == 3 ? fruit[3] : fruit[4]);
        }

    }
}

/* 길이가 5인 String 배열을 선언하고
 * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
 * 스캐너로 0부터 4까지의 정수를 입력 받아
 * 해당 정수의 인덱스에 있는 과일을 출력하세요
 *
 * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
 *
 * -- 입력 예시 --
 * 0부터 4까지의 정수를 입력하세요 : 2
 *
 * -- 출력 예시 --
 * 복숭아
 *
 * -- 입력 예시 --
 * 0부터 4까지의 정수를 입력하세요 : 5
 *
 * -- 출력 예시 --
 * 준비된 과일이 없습니다.
 * */