package org.example.coding;

public class task3 {
    public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.*/

        // Create a 2D array of integer values
        int[][] numbers = {
                {1, 2, 3, 4},  // First row
                {5, 6, 7, 8},  // Second row
                {9, 10, 11, 12}  // Third row
        };
        // Print the even numbers only
        System.out.println("Even numbers in the 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {  // Check if the number is even
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
