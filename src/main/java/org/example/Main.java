package org.example;


import org.example.entity.Calculadora;

public class Main {
    public static void main(String[] args) {

        int result = Calculadora.sum(16, 15, 14, 14);
        int result2 = Calculadora.subtract(15, 15, 15);
        int result3 = Calculadora.multiplication(5, 5);
        Double result4 = Calculadora.division(10, 10, 10);


        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}