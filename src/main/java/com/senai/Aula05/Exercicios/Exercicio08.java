package com.senai.Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println(">>>>>CONTAGEM DE NÚMEROS PARES E ÍMPARES<<<<<");
        Scanner scanner= new Scanner(System.in);

        int impar =0, par =0, numero;
        for (int i= 0; i<10 ; i++) {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            if (numero %2==0){
                par++;
            }else{
                impar++;
            }

        }
        System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpares");
        scanner.close();
    }
}
