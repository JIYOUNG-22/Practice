package com.dyong.chapter06.class_and_object.practice02;

public class StudentDTO {

    /* 1. 필드(전역변수) 선언 */
    private int grade;      // 학년
    private int classroom;  // 반
    private String name;    // 이름
    private int kor;        // 국어점수
    private int eng;        // 영어점수
    private int math;       // 수학점수

    /* 2. 생성자(Constructor) */
    // 1. 기본 생성자
    public StudentDTO() {}

    // 2. 매개변수 생성자
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    /* 3. 메소드 */
    // 1. String return 메소드
    public String getInformation() {
        return ("학년=" + this.grade + ", 반=" + this.classroom + ", 이름=" + this.name +
                ", 국어=" + this.kor + ", 영어=" + this.eng + ", 수학=" + this.math +
                ", 평균=" + (this.kor+this.eng+this.math)/3);
    }

    // 2. setter and getter method
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
