package com.Inner9;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        Bank.Account a = b.new Account();
        a.showBalance();
    }
}
