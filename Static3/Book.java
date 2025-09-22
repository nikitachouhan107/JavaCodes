package com.Static3;

public class Book{
    static class Hindi{
        String name;
        int price;

        Hindi(String name, int price) {
            this.name = name;
            this.price = price;
        }

            void show(){
                System.out.println("Name :" +name+"Price"+price);
            }
        }
    }
