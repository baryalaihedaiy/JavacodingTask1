package org.example.coding;

public class task7 {
    public static void main(String[] args) {
        /*Write a Java Program to print the first 10 numbers of Fibonacci series.*/
        int n = 10; // Number of elements in Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("First " + n + " terms of Fibonacci series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
