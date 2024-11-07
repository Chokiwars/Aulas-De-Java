package com.senai.Aula07.Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA DETERMINAR O MAIOR DE TRÊS NÚMEROS.....");
        int numero = maiorNumero(6,54,6);
    }
        static int maiorNumero(int num1, int num2, int num3) {
            if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2);
            } else if (num3 >= num1 && num3 >= num2) {
                System.out.println(num3);
            }
            return num1;
        }
}
