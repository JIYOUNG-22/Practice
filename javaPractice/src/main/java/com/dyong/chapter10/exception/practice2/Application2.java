package com.dyong.chapter10.exception.practice2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
//import com.dyong.chapter10.exception.practice2.ExceptionTest;

public class Application2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String birthdateInput = scanner.nextLine();

        ExceptionTest test = new ExceptionTest();
//        LocalDate birthdate = LocalDate.parse(birthdateInput);    // 예외 종류 확인

        try {
            LocalDate birthdate = LocalDate.parse(birthdateInput);
            test.checkAge(birthdate);
            System.out.println("입장하셔도 됩니다.");
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch(DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } finally {
            scanner.close();
        }

    }

}

/*
* 사용자 정의 예외
* 생년월일을 입력 받아 만 20세 미만일 경우
* `InvalidAgeException`이라는 사용자 정의 예외를 발생시키는 프로그램을 작성한다.
*/
