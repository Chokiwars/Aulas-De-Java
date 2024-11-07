package com.senai.Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println(">>>>>VALIDAÇÃO DE ENTRADA<<<<<");
        Scanner scanner = new Scanner(System.in);

        double nota=0;
        boolean verdadeiro= true;
        System.out.println("Digite sua nota");

        do {
            nota = scanner.nextDouble();
            if (nota >=0 && nota <= 10){
                System.out.println("A nota informada está dentro da validação!");
                verdadeiro = false;
            }else{
                System.out.println("A nota informada não está dentro da validação. Tente novamente!");
//                scanner.next();
                verdadeiro = true;
            }
        }while (verdadeiro);
    }
}
