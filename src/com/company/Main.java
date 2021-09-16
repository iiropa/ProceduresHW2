package com.company;

public class Main {

    public static void main(String[] args) {

        for (int x = 1; x <= 20; x++) { //loop goes through values 1-20
            System.out.print(sumUpTo(x) + " ");
        }

    }
    static int sumUpTo (int n) { //the core function
        return n * ( n + 1 )/2;
    }

}
