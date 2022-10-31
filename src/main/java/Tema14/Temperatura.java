package Tema14;

import java.util.Scanner;

public class Temperatura {


    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Tema 14: Pentru temperatura de \""+fahrenheit+ "\" grade Fahrenheit, temperatura in grade Celsius este: "+celsius);
    return celsius;
    }



    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Tema 14: Pentru temperatura de \""+celsius+ "\" grade Celsius, temperatura in grade Fahrenheit este: "+fahrenheit);
        return fahrenheit;
    }
}
