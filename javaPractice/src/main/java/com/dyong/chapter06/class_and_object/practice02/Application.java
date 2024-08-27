package com.dyong.chapter06.class_and_object.practice02;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indexNum = 0;

        // class 배열 선언
        StudentDTO[] studentDTOs = new StudentDTO[10];

        while(true){
            System.out.print("학년 : ");
            int grade = scanner.nextInt();
            System.out.print("반 : ");
            int classroom = scanner.nextInt();
            scanner.nextLine();
            System.out.print("이름 : ");
            String name = scanner.nextLine();
            System.out.print("국어점수 : ");
            int kor = scanner.nextInt();
            System.out.print("영어점수 : ");
            int eng = scanner.nextInt();
            System.out.print("수학점수 : ");
            int math = scanner.nextInt();
            studentDTOs[indexNum] = new StudentDTO(grade, classroom, name, kor, eng, math);

            scanner.nextLine();
            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            char ch = scanner.nextLine().charAt(0);
            if (ch == 'n') break;

            indexNum++;
        }

        for(int i=0; i<=indexNum; i++) {
            System.out.println(studentDTOs[i].getInformation());
        }

    }
}
