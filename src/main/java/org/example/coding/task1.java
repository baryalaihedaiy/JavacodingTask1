package org.example.coding;

public class task1 {
    public static void main(String[] args) {
       /*	Create a program that uses an array to store a list of temperatures
        // for a week, and then uses a loop to find the highest and lowest temperature for the week.*/

        // Array to store temperatures for a week
        int[] temperatures = {23, 29, 31, 28, 26, 27, 25};  // Example temperatures in Celsius

        // Initialize highest and lowest temperatures
        int highestTemperature = temperatures[0];
        int lowestTemperature = temperatures[0];

        // Loop to find the highest and lowest temperature for the week
        for (int temperature : temperatures) {
            if (temperature > highestTemperature) {
                highestTemperature = temperature;
            }
            if (temperature < lowestTemperature) {
                lowestTemperature = temperature;
            }
        }

        // Output the highest and lowest temperatures
        System.out.println("Highest temperature: " + highestTemperature + "°C");
        System.out.println("Lowest temperature: " + lowestTemperature + "°C");
    }
}

