package com.dyong.chapter05.array.section01.level02;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String str = scanner.nextLine();

        char[] carr = str.toCharArray();
        //System.out.println(Arrays.toString(carr));

        for(int i=0; i<8; i++) {
            System.out.print(carr[i]);
        }
        System.out.print("******");
    }
}


/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
 * 성별 자리 이후부터 *로 가려서 출력하세요
 *
 * -- 입력 예시 --
 * 주민등록번호를 입력하세요 : 990101-1234567
 *
 * -- 출력 예시 --
 * 990101-1******
 */
