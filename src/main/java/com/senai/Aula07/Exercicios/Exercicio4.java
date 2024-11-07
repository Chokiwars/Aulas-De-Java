package com.senai.Aula07.Exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA CONVERTER GRAUS CELSIUS PARA FAHRENHEIT.....");

        double converter = converterCelsiusEmFahrenheit(25);
        System.out.println("São "+converter+" graus em fahrenheit");
    }
    static double converterCelsiusEmFahrenheit (int celsius) {
        return celsius * 1.8 + 32;
    }
}
