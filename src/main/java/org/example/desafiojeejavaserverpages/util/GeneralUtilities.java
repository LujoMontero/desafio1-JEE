package org.example.desafiojeejavaserverpages.util;

public class GeneralUtilities {

    public int factFibonacci(int n) {

        int num1 = 0, num2 = 1;
        for (int i = 2; i <= n; i++) {
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        return num2;
    }

    public String esParOImpar(int num) {
        if (num % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}