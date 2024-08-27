package com.dyong.chapter09.api;

/* 텍스트 분석기
 * 사용자로부터 입력받은 텍스트에서 단어의 빈도를 계산하고,
 * 가장 자주 등장하는 단어를 출력하는 프로그램을 `String`과 `StringBuilder`를 활용하여 구현한다.
 * 단, 영문자만 대소문자 구분 없이 취급한다.
 * */

import java.util.*;

public class Application2 {
    public static void main(String[] args) {

        // 사용자로부터 텍스트 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");

        // 정규표현식 사용하여 입력받은 텍스트를 영문자가 아닌 문자열을 제외하고 단어 단위로 배열에 넣기
        String[] stringList = scanner.nextLine().split("[^a-z|A-Z]");
        String[] words = new String[stringList.length];
        int[] counts = new int[stringList.length];
        int index = 0;

        // 단어 중복 제거, 단어의 빈도 카운트
       for(int i = 0; i < stringList.length; i++) {
           boolean isFirst = true;

           for(int j = 0; j < words.length; j++) {
               if(stringList[i].toLowerCase().equals(words[j])) {
                   counts[j]++;
                   isFirst = false;
               }
           }

           if (isFirst) {
               words[index] = stringList[i].toLowerCase();
               counts[index]++;
               index++;
           }
       }

        // 가장 자주 등장하는 단어 찾기
        StringBuilder result = new StringBuilder();
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            if (counts[max] < counts[i]) max = i;
            if (counts[i] > 0) result.append(words[i]).append(" : ").append(counts[i]).append("\n");
        }

        // 결과 출력
        System.out.println("===== 단어 빈도 =====");
        System.out.println(result);
        System.out.println("가장 빈도 높은 단어 : " + words[max] + "(" + counts[max] + "번)");
    }

}
