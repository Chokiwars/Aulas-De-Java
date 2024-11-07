package com.senai.Aula02;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println(".....COMPARAÇÃO DE DOIS NÚMEROS.....");
        int valor1 = 5;
        int valor2 = 10;
        boolean condicao;

        condicao = valor1 > valor2;
        System.out.println(valor1 + " é maior que " + valor2 + "? " + condicao);
        condicao = valor1 < valor2;
        System.out.println(valor1 + " é menor que " + valor2 + "? " + condicao);
        condicao = valor1 >= valor2;
        System.out.println(valor1 + " é maior ou igual a " + valor2 + "? " + condicao);
        condicao = valor1 <= valor2;
        System.out.println(valor1 + " é menor ou igual a " + valor2 + "? " + condicao);
        condicao = valor1 == valor2;
        System.out.println(valor1 + " é igual a " + valor2 + "? " + condicao);
        condicao = valor1 != valor2;
        System.out.println(valor1 + " é diferente de " + valor2 + "? " + condicao);


    }
}
