package com.dyong.chapter06.class_and_object.practice01;

public class Application {
    public static void main(String[] args) {

        // 기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookdto1 = new BookDTO();
        bookdto1.printInformation();

        // 필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookdto2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookdto2.printInformation();

        // 모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookdto3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookdto3.printInformation();
    }

}
