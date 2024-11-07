package com.senai.Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println(".....SOMA DE ELEMENTOS INTEIROS EM UM VETOR.....");
    }

    int [] numeroMatriz = new int [5];
    int somaNumero = 0;
    Scanner scanner = new Scanner(System.in);
    boolean entrada = true;

    public void SomaEDataSalva(){
        for (int i = 0; i < numeroMatriz.length; i++) {
            do {
                System.out.println("Digite um número para guardar na Matriz");
                if (scanner.hasNextInt()){
                    numeroMatriz[i] = scanner.nextInt();
                    entrada = false;
                }else {
                    System.out.println("ERRO! Digite novamente");
                    entrada = true;
                    scanner.next();
                }
            }while (entrada);

            somaNumero += numeroMatriz[i];
        }
        System.out.println("");
    }
}
