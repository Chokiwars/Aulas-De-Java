package com.senai.Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA CALCULAR O IMC.....");
        Scanner scanner = new Scanner(System.in);

        double peso, altura;
        System.out.println("Digite seu peso");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        altura = scanner.nextDouble();
        System.out.println("O valor do seu IMC é "+calcularIMC(peso, altura));
    }
    static double calcularIMC(double peso, double altura){
        return peso/(altura*altura);
    }
}
