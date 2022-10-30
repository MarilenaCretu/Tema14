package Tema14;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void fahrenheitToCelsius() {
        //Given
        //double celsius = 21;
         double fahrenheit=50;
        FirstTest firstTest = new FirstTest();

        //When
        double celsius = firstTest.celsius((fahrenheit - 32) * 5 / 9);

        //Then
        Assertions.assertThat(celsius).isEqualTo(10);
    }
    @Test
    public void celsiusToFahrenheit() {
        //Given
        double celsius = 10;
        // double fahrenheit;
        FirstTest firstTest = new FirstTest();

        //When
        double fahrenheit = Tema14.FirstTest.fahrenheit((celsius * 1.8) + 32);

        //Then
        Assertions.assertThat(fahrenheit).isEqualTo(50);
    }

}
