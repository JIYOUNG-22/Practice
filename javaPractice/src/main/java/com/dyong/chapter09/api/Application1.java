package com.dyong.chapter09.api;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");

        String str = scanner.nextLine();
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        int wordCount = 0;

        for(String word : words) {
            if(!word.isEmpty()){    // 빈 문자열이 아닌 경우에만 처리
                sb.append(word.substring(0,1).toUpperCase())
                  .append(word.substring(1).toLowerCase());
                sb.append(" ");
                wordCount++;
            }
        }

        System.out.println("변환된 문자열 : " + sb);
        System.out.println("총 단어 개수 : " + wordCount);

    }
}


/*
* 대문자 변환기
* 사용자로부터 입력받은 텍스트에서 공백 문자를 기준으로 앞 글자를 대문자로 만들어서 변환해서 출력하는 프로그램을
* `String`과 `StringBuilder`를 활용하여 구현한다. 전체 단어의 개수도 함께 출력한다.
* */