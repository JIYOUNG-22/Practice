package com.dyong.chapter05.array.section01.level01;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        // 방법1
        int[] arr1;
        arr1 = new int[10];
        //int[] arr1 = new int[10];

        for(int i=0; i<arr1.length; i++){
            arr1[i] = i+1;
        }

        // 방법2
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
/* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
 * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
 * */