package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println(".....AVALIAÇÃO DE DESEMPENHO.....");
        Scanner scan = new Scanner(System.in);

        int avaliacao = 1;
        switch (avaliacao) {
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Excelente");
            default:
                System.out.println("Número incorreto!");
        }
    }
}
