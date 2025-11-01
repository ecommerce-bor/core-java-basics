package com.product.java.eight.functional.Interface;

public class StudentLambdaTest {

    public static void main(String[] args) {
        Student student=()->{
            System.out.println("1");
        };

        student.getStudentId();
    }
}
