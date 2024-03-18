package org.example.coding;

public class task8 {
    public static void main(String[] args) {
        /*	Maximum and minimum number in the array?*/

        int[] numbers = {3, 5, 7, 2, 8, 10, 1, 6};

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            // Check for new maximum
            if (numbers[i] > max) {
                max = numbers[i];
            }
            // Check for new minimum
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print out the results
        System.out.println("Maximum number in the array is: " + max);
        System.out.println("Minimum number in the array is: " + min);
    }
}

