package org.example.desafiojeejavaserverpages.util;

public class GeneralUtilities {

    public int factFibonacci(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factFibonacci(n - 1);
        }
    }

    public String esParOImpar(int num) {
        if (num % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}