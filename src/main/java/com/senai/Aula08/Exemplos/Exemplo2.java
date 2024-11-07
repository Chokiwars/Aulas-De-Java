package Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        String nome = "Beatriz", nomeDigitado;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome:");
            nomeDigitado = scanner.nextLine();
        } while (!nome.equals(nomeDigitado));
        System.out.println("Parabéns, esse é seu nome!!!");
        sc