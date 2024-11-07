package com.senai.Aula06.Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println(".....BUSCA DE CARACTERES EM UM VETOR.....");
    }
    String[] caracter = new String[5];
    Scanner scanner = new Scanner(System.in);

    public void caracterInserido() {
        for (int i = 0; i < caracter.length; i++) {
            caracter[i] = scanner.nextLine();
        }
    }
}
