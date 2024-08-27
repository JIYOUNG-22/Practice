package com.dyong.chapter08.polymorphism.level01;

public class Triangle extends Shape implements Resizable {

    /* (1) 필드*/
    double base;    // 밑변
    double height;  // 높이
    double side1;   // 첫 번째 변
    double side2;   // 두 번째 변
    double side3;   // 세 번째 변

    /* (2) 생성자 */
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /* (3) 메소드 */
    @Override
    public void resize(double factor) {
        this.base = factor * this.base;
        this.height = factor * this.height;
        this.side1 = factor * this.side1;
        this.side2 = factor * this.side2;
        this.side3 = factor * this.side3;
    }

    @Override
    double calculateArea() {
        return base * height / 2;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
