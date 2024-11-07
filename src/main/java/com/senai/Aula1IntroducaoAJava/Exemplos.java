package com.senai.Aula1IntroducaoAJava;
import java.util.Scanner;
public class Exemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome:");

        String nome = scanner.nextLine();

        System.out.print("Digite sua idade:");

        int idade = scanner.nextInt();


        System.out.print("Digite sua altura:");

        double altura = scanner.nextDouble();


        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua altura é " + altura);
    scanner.close();
    }
}
