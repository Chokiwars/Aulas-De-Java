package com.senai.Aula07.Exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA CALCULAR O DOBRO DE UM NÚMERO.....");

        int dobro = dobrar(5) ;
        System.out.println("O valor dobrado é "+dobro);
    }
    static int dobrar (int n1){
    return n1+n1;
    }
}
