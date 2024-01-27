package org.example.entity;

import java.util.Arrays;

public class Calculadora {
    public static int sum(int... values) {
        var hasNegativeNumber = Arrays.stream(values).anyMatch(value -> value < 0);
        if (hasNegativeNumber) {
            throw new IllegalArgumentException("Não é possivel passar valores negativos na soma");
        }
        return Arrays.stream(values).sum();
    }


    public static int subtract(int... values) {
        var hasNegativeNumber = Arrays.stream(values).anyMatch(value -> value < 0);
        if (hasNegativeNumber) {
            throw new IllegalArgumentException("Não será aceito numeros negativos para subtração");
        }
        return Arrays.stream(values).reduce((acc, value) -> acc - value).orElse(0);


    }

    public static Double division(double... values) {
        var hasValueZero = Arrays.stream(values).anyMatch(value -> value <= 0);
        if (hasValueZero) {
            throw new IllegalArgumentException("Não sera aceito divisão por 0");
        }

        if (values.length == 1) {
            return values[0];
        }

        return Arrays.stream(values).reduce((acc, value) -> acc / value).orElse(0.0);
    }


    public static int multiplication(int... values) {

        var hasValueZero = Arrays.stream(values).anyMatch(value -> value <= 0);
        if (hasValueZero) {
            throw new IllegalArgumentException("Não sera aceito multiplicação por 0");
        }
        return Arrays.stream(values).reduce(1, (acc, value) -> acc * value);
    }

}

