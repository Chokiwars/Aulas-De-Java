package com.senai.Aula06.Exercicios;

import java.util.Scanner;

public class DESAFIO {
    public static void main(String[] args) {
        System.out.println(".....DESAFIO 1: MATRIZES.....");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de usuários que deseja cadastrar:");
        int qtdUsuarios = scanner.nextInt();     // "qtd" = "quantidade"
        scanner.nextLine();

        String[]cabecalho = {"ID","Nome","E-mail", "Telefone"};
        String[][] matrizCadastro = new String[qtdUsuarios+1][4];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preencha os dados a seguir:");
        for (int linhas = 1; linhas < matrizCadastro.length; linhas++) {
            System.out.print("ID: ");
            matrizCadastro[linhas][0]=scanner.nextLine();
            System.out.print("Nome: ");
            matrizCadastro[linhas][1]=scanner.nextLine();
            System.out.print("E-mail: ");
            matrizCadastro[linhas][2]=scanner.nextLine();
            System.out.print("Telefone: ");
            matrizCadastro[linhas][3]=scanner.nextLine();
        }
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            System.out.println(matrizCadastro[linhas][0]+"\t"+matrizCadastro[linhas][1]+"\t\t\t"+ matrizCadastro[linhas][2]+"\t\t\t"+matrizCadastro[linhas][3]);

        }
    }
}
