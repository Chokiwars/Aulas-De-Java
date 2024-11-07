package com.senai.Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA CALCULAR O FATORIAL DE UM NÚMERO.....");
        Scanner scanner = new Scanner(System.in);

        int fatorial;
        System.out.println("Digite um número para fatorar");
        fatorial = scanner.nextInt();
        System.out.println("O resultado desse fatorial é "+calcularFatorial(fatorial));
    }
    static int calcularFatorial(int fatorial){
    int j = fatorial;
        for (int i = 1; i < j; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
