package org.example.coding;

public class task9 {
    public static void main(String[] args) {

        /*Write a java program to find the second largest number in the array?*/

        int[] numbers = {12, 35, 1, 10, 34, 1};

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }
        int firstLargest, secondLargest;

        // Setting starting values
        if (numbers[0] > numbers[1]) {
            firstLargest = numbers[0];
            secondLargest = numbers[1];
        } else {
            firstLargest = numbers[1];
            secondLargest = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != firstLargest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}

