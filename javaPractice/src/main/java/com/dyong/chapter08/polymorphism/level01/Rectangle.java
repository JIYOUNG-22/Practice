package com.dyong.chapter08.polymorphism.level01;

public class Rectangle extends Shape implements Resizable{

    /* (1) field */
    double width;   // 너비
    double height;  // 높이

    /* (2) constructor*/
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /* (3) method */
    @Override
    public void resize(double factor) {
        this.width = factor * this.width;
        this.height = factor * this.height;
    }

    @Override
    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(this.width + this.height);
    }
}
