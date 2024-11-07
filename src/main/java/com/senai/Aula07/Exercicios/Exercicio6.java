package com.senai.Aula07.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println(".....FUNÇÃO PARA VERIFICAR SE UM NÚMERO É PAR.....");
        double num = 6;
        if (verificarPar(num)==true){
            System.out.println("O número é par! Retornou "+verificarPar(num));
        }else{
            System.out.println("O número é ímpar! Retornou "+verificarPar(num));

        }
    }
    static boolean verificarPar(double num){
        boolean imparOuPar;
        if (num %2 ==0){
            imparOuPar=true;
        }else{
            imparOuPar=false;
        }
        return imparOuPar;
    }
}
