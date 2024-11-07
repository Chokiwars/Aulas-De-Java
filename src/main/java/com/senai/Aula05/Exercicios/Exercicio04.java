package com.senai.Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println(">>>>>VERIFICAÇÂO DE NÚMERO PRIMO<<<<<");

        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro");
        numero = scanner.nextInt();

        for (int i = 0; numero % 2 != 0; i++){
            System.out.println("O número digitado é um número primo!");
            return;
        }

        System.out.println("O número digitado não é um número primo!");
    }
}
