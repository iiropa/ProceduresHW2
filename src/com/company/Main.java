package com.company;

public class Main {

    public static void main(String[] args) {

        for (int x = 1; x <= 20; x++) {
            System.out.print(sumUpTo(x) + " ");
        }

    }
    static int sumUpTo (int n) {
        return n * ( n + 1 )/2;
    }

}
