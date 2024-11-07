package com.senai.Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println(".....VETOR DE STRINGS.....");
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        String procurarNome;

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("Digite um nome");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Procure seu nome");
        procurarNome = scanner.nextLine();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(procurarNome)){
                System.out.println("Nome encontrado no indice " +i);
                break;
            }else{
                System.out.println("Nome não encontrado!");
                break;
            }
        }
    }
}
