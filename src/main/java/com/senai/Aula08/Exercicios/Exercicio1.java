package com.senai.Aula08.Exercicios;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println(".....CRIAR E ESCREVER EM UM ARQUIVO DE TEXTO..... ");

        try {
            Scanner scanner = new Scanner(System.in);
            File alunos = new File("src\\alunos.txt");
            String nome = "";
            if (!alunos.exists()) alunos.createNewFile();

            FileWriter nomeAlunos = new FileWriter(alunos, true);

            for (int i = 0; i < 5; i++) {
                System.out.println("Escreva um nome:");
                nome = scanner.nextLine();
                nomeAlunos.write(nome+"\n");
            }
            nomeAlunos.close();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
