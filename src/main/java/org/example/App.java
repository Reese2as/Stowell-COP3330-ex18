/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String input;
        double temperature, converted_temp;

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        input = user_input.next();
        System.out.print("Please enter the temperature: ");
        temperature = user_input.nextDouble();

        if(input.toLowerCase().equals("c"))
        {
            converted_temp = (temperature -32) * 5/9;
            System.out.println(String.format("The temperature in Celsius is %.1f",converted_temp));
        }
        if(input.toLowerCase().equals("f"))
        {
            converted_temp = (temperature * 9/5) + 32;
            System.out.println(String.format("The temperature in Fahrenheit is %.1f",converted_temp));
        }
    }
}
