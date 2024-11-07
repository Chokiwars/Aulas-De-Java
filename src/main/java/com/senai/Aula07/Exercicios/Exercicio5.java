package com.senai.Aula07.Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA CALCULAR MÉDIA DE TRÊS NOTAS.....");

        double media = calcularMedia(7,5,9);
        System.out.println("A média das três notas é "+media);
    }
    static double calcularMedia(int nota1, int nota2, int nota3){
        int soma = nota1+nota2+nota3;
        return soma/3;
    }
}
