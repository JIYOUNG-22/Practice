package com.dyong.chapter05.array.section02.dimensional_array.level01;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        // 방법1
        int[][] arr1;
        arr1 = new int[3][];
        arr1[0] = new int[4];
        arr1[1] = new int[4];
        arr1[2] = new int[4];

        // 방법2
        int[][] arr2 = new int[3][4];

        // 값 대입
        int value = 1;
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                arr1[i][j] = value++;
            }
        }

        // 출력
        for(int k=0; k<arr1.length; k++) {
            System.out.println(Arrays.toString(arr1[k]));
        }
    }
}

/* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
 * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
 * 그 값을 출력하는 코드를 작성하시오.
 *
 * -- 출력 예시 --
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 *
 * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
 * */