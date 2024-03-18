package org.example.coding;

public class task2 {
    public static void main(String[] args) {

        /*	Create an array of integer values. After the array is created,
         calculate the sum of all stored elements in that array */
        // Create an array of integer values

        int[] numbers = {5, 7, 2, 9, 4, 1, 3};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}
