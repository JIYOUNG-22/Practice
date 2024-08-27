package com.dyong.chapter10.exception.practice2;

import java.time.LocalDate;

public class ExceptionTest {

    public void checkAge(LocalDate birthdate) throws InvalidAgeException{
        LocalDate today = LocalDate.now();

        int age;
        if(today.getDayOfYear()>=(birthdate.getDayOfYear())){
            age = today.getYear() - birthdate.getYear();
        } else {
            age = today.getYear() - birthdate.getYear() -1;
        }

        /* 나이 계산 다른 방법
        int age = today.getYear() - birthdate.getYear();
        if(birthdate.plusYears(age).isAfter(today)) age--;
        */

        if(age < 20) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }


    }
}
