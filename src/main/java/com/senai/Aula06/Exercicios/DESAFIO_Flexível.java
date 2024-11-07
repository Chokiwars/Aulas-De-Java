package com.senai.Aula06.Exercicios;

import java.util.Scanner;

public class DESAFIO_Flexível {
    public static void main(String[] args) {
        System.out.println(".....DESAFIO 1: MATRIZES.....");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de usuários que deseja cadastrar:");
        int qtdUsuarios = scanner.nextInt();     // "qtd" = "quantidade"
        scanner.nextLine();

        String[]cabecalho = {"ID","Nome","E-mail","Telefone","RG"};
        String[][] matrizCadastro = new String[qtdUsuarios+1][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preencha os dados a seguir:");
        for (int linhas = 1; linhas < matrizCadastro.length; linhas++) {
        for (int colunas = 0; colunas < cabecalho.length; colunas++) {
            System.out.print(cabecalho[colunas]+": ");
            matrizCadastro[linhas][colunas]=scanner.nextLine();
        }
    }
        String tabela="";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas==0 ? "\t" : "\t\t\t" ;
            }
            tabela +="\n";
        }
        System.out.println(tabela);

    }
}
