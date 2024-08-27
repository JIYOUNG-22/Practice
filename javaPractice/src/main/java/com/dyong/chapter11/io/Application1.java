package com.dyong.chapter11.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String filename = scanner.nextLine();

        try (FileReader fileReader = new FileReader(filename);) {

            System.out.println("===== 파일 내용 출력 =====");
            int data;
            while((data=fileReader.read()) != -1) {
                System.out.print((char) data);
            }

            /*
            while(true) {
                int data = fileReader.read();
                if(data==-1) break;
                System.out.print((char)data);
            }
            */

        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("오류 : 예기치 못한 오류가 발생하였습니다.");
        }

    }
}

/*
 * 파일 읽기 예외 처리
 * 사용자로부터 파일 이름을 입력받아 해당 파일을 읽고 내용을 출력하는 프로그램을 작성한다.
 * 파일이 존재하지 않을 경우에 대해 예외를 처리한다.
 */
