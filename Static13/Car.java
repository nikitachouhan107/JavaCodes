package com.Static13;

class Car {
    static class Engine {
        private int horsepower;

        Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        void start() {
            System.out.println("Engine started with " + horsepower + " HP.");
        }
    }
}
