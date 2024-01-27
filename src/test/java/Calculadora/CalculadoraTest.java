package Calculadora;

import org.example.entity.Calculadora;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculadoraTest {

    @Test
    @DisplayName("GIVEN value less then zero WHEN call sum SHOULD Throws error")
    public void sumShouldThrowErrorWhenInvalidParams() {

        // arrange

        var expectedValue = "Não é possivel passar valores negativos na soma";
        var valuePositive = 30;
        var valueNegative = -10;

        //action
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.sum(valuePositive, valueNegative);
        });


        //assertion
        Assertions.assertEquals(exception.getMessage(), expectedValue);


    }


    @Test
    @DisplayName("GIVEN value equal or less then zero WHEN call sum SHOULD Throws error")
    public void subtractShouldThrowErrorWhenInvalidParams() {

        // arrange

        var expectedValue = "Não será aceito numeros negativos para subtração";
        var valuePositive = 30;
        var valueNegative = -10;

        //action
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.subtract(valuePositive, valueNegative);
        });


        //assertion
        Assertions.assertEquals(exception.getMessage(), expectedValue);


    }

    @Test
    @DisplayName("GIVEN value equal or less then zero WHEN call sum SHOULD Throws error")
    public void divisionShouldThrowErrorWhenInvalidParams() {

        // arrange

        var expectedValue = "Não sera aceito divisão por 0";
        var valuePositive = 30;
        var valueZero = 0;

        //action
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.division(valuePositive, valueZero);
        });


        //assertion
        Assertions.assertEquals(exception.getMessage(), expectedValue);


    }

    @Test
    @DisplayName("GIVEN value less or equal then zero WHEN call sum SHOULD Throws error")
    public void multiplicationShouldThrowErrorWhenInvalidParams() {

        // arrange

        var expectedValue = "Não sera aceito multiplicação por 0";
        var valuePositive = 30;
        var valueZero = -10;

        //action
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.multiplication(valuePositive, valueZero);
        });


        //assertion
        Assertions.assertEquals(exception.getMessage(), expectedValue);


    }


    @Test
    @DisplayName("GIVEN valid params WHEN calls sum SHOULD return sum all numbers")
    public void sumAllValues() {
        //arrange
        var expectedValue = 100;
        var value = 50;
        var value2 = 50;

        //action
        var result = Calculadora.sum(value, value2);

        //assert

        Assertions.assertEquals(expectedValue, result);
    }


    @Test
    @DisplayName("GIVEN valid params WHEN calls subtract SHOULD return subtract all numbers")
    public void subtractAllValues() {
        //arrange
        var expectedValue = 0;
        var value = 50;
        var value2 = 50;

        //action
        var result = Calculadora.subtract(value, value2);

        //assert

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("GIVEN valid params WHEN calls division SHOULD return division all numbers")
    public void divisionAllValues() {
        //arrange
        var expectedValue = 1;
        var value = 50;
        var value2 = 50;

        //action
        var result = Calculadora.division(value, value2);

        //assert

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("GIVEN valid params WHEN calls multiplication SHOULD return multiply all numbers")
    public void multiplyAllValues() {
        //arrange
        var expectedValue = 100;
        var value = 10;
        var value2 = 10;

        //action
        var result = Calculadora.multiplication(value, value2);

        //assert

        Assertions.assertEquals(expectedValue, result);
    }


}
