package org.example;

public class Complexo {
    public static double somaN(double num1N, double num2N){
        double result1;
        result1 = num1N + num2N;
        return (result1);
    }
    public static double somaC(double num1C, double num2C){
        double result2;
        result2 = num1C + num2C;
        return (result2);
    }
    public static double subtracaoN(double num1N, double num2N){
        double result1;
        result1 = num1N - num2N;
        return (result1);
    }
    public static double subtracaoC(double num1C, double num2C){
        double result2;
        result2 = num1C - num2C;
        return (result2);
    }

    public static double modulo(double num1N, double num1C){
        double result1;
        result1 = (Math.sqrt(Math.pow(num1N,2)) + (Math.pow(num1C,2)));
        result1 = (Math.sqrt(result1));
        return (result1);
    }
}
