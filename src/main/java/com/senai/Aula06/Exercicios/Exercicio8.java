package com.senai.Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println(".....PREENCHENDO UMA MATRIZ.....");
    Scanner scanner = new Scanner(System.in);

    String valorUsuario = "matriz{\n";
    int[][] matriz = new int[2][2];

        for (int linha = 0; linha < matriz.length; linha++) {
        valorUsuario += "\t{";
        for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            System.out.println("Digite o valor da posição ["+linha+", "+coluna+"] =");
            matriz[linha][coluna] = scanner.nextInt();
            valorUsuario += matriz[linha][coluna];
            valorUsuario += coluna < (matriz[linha].length - 1) ? ", ": "}";
        }
        valorUsuario += linha < (matriz.length - 1) ? ",\n" : "\n}";
    }
        System.out.println(valorUsuario);
}
}
