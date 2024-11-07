package com.senai.Aula02;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println(".....OPERADORES LÓGICOS BÁSICOS.....");

        boolean cond1 = 7 < 10;
        boolean cond2 = 14 == 53;
        boolean cond3 = 21 <= 72;
        boolean operadores;

        operadores = cond1 && cond2;
        System.out.println("A primeira condição e a segunda condição são verdadeiras? " + operadores);
        operadores = cond1 || cond2;
        System.out.println("A primeira condição e a segunda condição são verdadeiras? " + operadores);
        operadores = cond1 && cond3;
        System.out.println("A primeira condição e a terceira condição são verdadeiras? " + operadores);
        operadores = cond1 || cond3;
        System.out.println("A primeira condição e a terceira condição são verdadeiras? " + operadores);
        operadores = cond2 && cond3;
        System.out.println("A segunda condição e a terceira condição são verdadeiras? " + operadores);
        operadores = cond2 || cond3;
        System.out.println("A segunda condição e a terceira condição são verdadeiras? " + operadores);

    }
}
