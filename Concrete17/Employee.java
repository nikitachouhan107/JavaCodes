package com.Concrete17;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
