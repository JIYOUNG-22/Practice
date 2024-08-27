package com.dyong.chapter04.control_flow.section02.looping_and_branching.level02;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();

        for(int i=1;i<=num;i++) {
            System.out.print(i % 2 == 0 ? "박" : "수");
        }
    }
}
/* 정수를 입력받아 1부터 입력받은 정수까지
 * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
 *
 * -- 입력 예시 --
 * 정수를 입력하세요 : 5
 *
 * -- 출력 예시 --
 * 수박수박수
 * */