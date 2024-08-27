package com.dyong.chapter08.polymorphism.level01;

public class Circle extends Shape implements Resizable{

    /* (1) 필드 */
    double radius;  // 반지름

    /* (2) 생성자*/
    public Circle(double radius){
        this.radius = radius;
    }

    /* (3) 메소드 */
    @Override
    public void resize(double factor) {
        this.radius = factor * this.radius;
    }

    @Override
    double calculateArea() {
        // 넓이 계산 메소드
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double calculatePerimeter() {
        // 둘레 계산 메소드
        return 2 * Math.PI * this.radius;
    }
}
