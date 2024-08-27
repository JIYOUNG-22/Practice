package com.dyong.chapter11.io;

import java.io.*;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] fileName = new String[num];

        for(int i=0; i<num; i++){
            System.out.print((i+1) + " 번째 파일 이름 입력 : ");
            fileName[i] = scanner.nextLine();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String targetFile = scanner.nextLine();

        String data;

        for(int i=0; i<num; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName[i]));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile, true))) {

                while((data = reader.readLine())!=null){
                    writer.write(data);
                    writer.newLine();  // 각 줄 끝에 개행 문자 추가
                }

                if(i==(num-1)) System.out.println("파일 병합이 완료 되었습니다.");

            } catch (FileNotFoundException e) {
                System.out.println("오류 : " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


/*
* 파일 병합
* 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성한다.
* 이 때 `BufferedReader`와 `BufferedWriter`를 사용하여 작성한다.
* */