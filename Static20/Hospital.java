package com.Static20;

class Hospital {
    static class Doctor {
        private String name;

        Doctor(String name) {
            this.name = name;
        }

        void info() {
            System.out.println("Dr. " + name);
        }
    }
}