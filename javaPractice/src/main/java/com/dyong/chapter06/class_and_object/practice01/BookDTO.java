package com.dyong.chapter06.class_and_object.practice01;

public class BookDTO {

    /* 1) field(전역변수) 선언 */
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    /* 2) 생성자 */
    // 1. 기본 생성자
    public BookDTO(){}

    // 2. 필드 3가지를 초기화하는 생성자
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    // 3. 모든 필드를 초기화 하는 생성자
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;
    }


    /* 3) method */
    // 1. 필드값 출력용 메소드
    public void printInformation(){
        System.out.println(this.title + " " + this.publisher + " " + this.author + " " + this.price + " " + this.discountRate);
    }

    // 2. getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
