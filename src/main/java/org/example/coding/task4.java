package org.example.coding;

public class task4 {
    public static void main(String[] args) {
        /*4.	Create a 2D array of integers. 
        Develop a program which will calculate the sum of  even and odd numbers for that array.*/

        // Define the 2D array
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Initialize sums of even and odd numbers
        int sumEven = 0;
        int sumOdd = 0;

        // Loop through the array to compute the sums
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) { // Check if the number is even
                    sumEven += numbers[i][j];
                } else { // The number is odd
                    sumOdd += numbers[i][j];
                }
            }
        }

        // Print out the results
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}

