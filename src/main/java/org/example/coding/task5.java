package org.example.coding;

public class task5 {
    public static void main(String[] args) {
        /*Write a program to swap 2 numbers without a temporary variable?*/
        // Initialize two numbers
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap numbers without using a temporary variable
        a = a + b; // Now a is the sum of a and b
        b = a - b; // Subtract b from the new a (which is a + b) will give original a
        a = a - b; // Subtract the new b (which is original a) from the new a (which is a + b) will give original b

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

