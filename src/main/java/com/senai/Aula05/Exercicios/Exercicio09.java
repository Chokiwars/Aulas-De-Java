package com.senai.Aula05.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println(">>>>>JOGO DE ADIVINHAÇÃO<<<<<");
        Random random = new Random();
        int numumeroAleatorio = random.nextInt(100);
        int chute =0 , tentativas =1;
        boolean saida = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número que eu escolher!");

        do {
            System.out.println("Digite um número!");
            if (scanner.hasNextInt()) {
                chute = scanner.nextInt();
                if (chute < numumeroAleatorio) {
                    System.out.println("Errado! O número certo é maior que esse");
                    tentativas++;
                } else if (chute > numumeroAleatorio) {
                    System.out.println("Errado! O número certo é menor que esse");
                    tentativas++;
                } else if (chute == numumeroAleatorio) {
                    System.out.println("Parabéns! Você acertou!");
                    saida = false;
                } else {
                    System.out.println("Erro! Número inválido!");
                    scanner.next();
                }
            }else {
                System.out.println("Erro! Número inválido!");
                scanner.next();
            }
            }while (saida);
        System.out.println("Antes de acertar você tentou " +tentativas+ " vezes");
    }
}
