package com.Static9;

class University {
    static class Student {
        String name;

        Student(String name){
            this.name = name;
        }
        void enroll() {
            System.out.println("Name : "+name + "study in Oriental University");
        }
    }
}
