package com.dyong.chapter11.io;

import java.io.*;
import java.util.Scanner;


public class Application2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String originFile = scanner.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copyFile = scanner.nextLine();

        try (BufferedReader in = new BufferedReader(new FileReader(originFile));
             BufferedWriter out = new BufferedWriter(new FileWriter(copyFile))){

                String data;
                while((data = in.readLine()) != null){
                    out.write(data);
                    out.newLine();  // 각 줄 끝에 개행 문자 추가
                }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            //System.out.println("오류 : " + originFile + " (지정된 파일을 찾을 수 없습니다.)");
            System.out.println("오류 : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("오류 : 예기치 못한 오류가 발생하였습니다.");
        }

   }
}


/*
* 파일 내용 복사
* 사용자로부터 입력받은 파일의 내용을 읽어 새로운 파일에 복사하는 프로그램을 작성한다.
* 원본 파일이 존재하지 않을 경우에 대한 예외를 처리한다.
*/
