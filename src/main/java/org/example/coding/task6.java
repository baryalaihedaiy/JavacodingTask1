package org.example.coding;

public class task6 {
    public static void main(String[] args) {
        /*Write a java program to check whether a given number is prime or not?*/
        // Define the number to be checked
        int number = 19; // You can change this value to test other numbers
        boolean isPrime = true; // Flag to indicate whether the number is prime

        // Check if number is less than 2 which is not prime
        if (number < 2) {
            isPrime = false;
        }

        // Check for factors from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If number is divisible by any number between 2 and its square root, it is not prime
            if (number % i == 0) {
                isPrime = false;
                break; // Break the loop if a factor is found
            }
        }

        // Output whether the number is prime
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

