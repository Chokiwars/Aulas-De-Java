package com.senai.Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA CALCULAR A POTÊNCIA DE UM NÚMERO.....");
        Scanner scanner = new Scanner(System.in);

        int base=0, expoente=0;
        System.out.println("Digite um número para a base");
        base = scanner.nextInt();
        System.out.println("Digite um expoente dessa base");
        expoente = scanner.nextInt();
        System.out.println("O resultado desse cálculo é "+calcularPotencia(base, expoente));
    }
    static int calcularPotencia(int base, int expoente){
        int resultado= 1;
        if (expoente==1){
            resultado=base;
        }else {
        for (int i = 1; i < expoente; i++) {
            if (i == 1) {
                resultado *= base * base;
            } else {
                resultado *= base;
            }
          }
        }
        return  resultado;
    }
}
