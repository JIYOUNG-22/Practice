package com.dyong.chapter04.control_flow.section02.looping_and_branching.level02;

public class Application2 {
    public static void main(String[] args) {

        for(int i=97; i<=122; i++){
            char ch = (char) i;
            System.out.print(ch);
        }
    }
}

/* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
 *
 * -- 출력 예시 --
 * abcdefghijklmnopqrstuvwxyz
 * */