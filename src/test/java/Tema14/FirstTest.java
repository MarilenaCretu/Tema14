package Tema14;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class FirstTest {

    @Test
    public void instantiateClass() {
        Temperatura temperatura = new Temperatura();
    }

    @Test
    public void callMethodToCelsius() {
        Temperatura temperatura = new Temperatura();
        temperatura.fahrenheitToCelsius(100);
    }
    @Test
    public void callMethodToFahrenheit() {
        Temperatura temperatura = new Temperatura();
        temperatura.celsiusToFahrenheit(22);
    }

    @Test
    public void fahrenheitToCelsius() {
        //Given
         double fahrenheit=0;
        Temperatura temperatura = new Temperatura();

        //When
        double celsius = temperatura.fahrenheitToCelsius(0);

        //Then
        Assertions.assertThat(celsius).isEqualTo(-17.77777777777778);
    }
    @Test
    public void celsiusToFahrenheit() {
        //Given
        double celsius = 10;
        Temperatura temperatura = new Temperatura();

        //When
        double fahrenheit = temperatura.celsiusToFahrenheit(10);

        //Then
        Assertions.assertThat(fahrenheit).isEqualTo(50);
    }

}
