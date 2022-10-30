import java.util.Scanner;

public class Temperatura {


    public void getTemperaturaCelsius() {
        Scanner f = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Fahrenheit: ");
        double fahrenheit = f.nextDouble();
        System.out.println(fahrenheit);
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println( "Temperatura in Celsius este: " + celsius);
    }

    public void getTemperaturaFahrenheit() {
        Scanner f = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Celsius: ");
        double celsius = f.nextDouble();
        System.out.println(celsius);
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatura in fahrenheit:" + fahrenheit);
    }
}
