package org.example.coding;

public class task10 {
    public static void main(String[] args) {
       /*Write a program to print out duplicate elements from an Array of Strings?*/
        String[] name = {"Gurbaz", "Rashid", "Afridi", "Rashid", "Nabi", "Kohli","Ibrahim"};
        System.out.println("Duplicate strings:");

        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].equals(name[j])) {
                    System.out.println(name[i]);
                }
            }
        }
    }
}


