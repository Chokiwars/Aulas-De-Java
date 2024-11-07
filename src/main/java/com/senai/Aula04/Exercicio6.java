package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println(".....VERIFICAÇÃO DE NOTA.....");
        Scanner scan = new Scanner(System.in);

        int nota =7;
        if (nota >=7 && nota <=10){
            System.out.println("Parabéns! Você foi aprovado!");
        }
        else if (nota >= 5 && nota <= 6){
            System.out.println("Cuidado! Você está de recuperação!");
        }
        else if (nota < 5 && nota >=0){
            System.out.println("Que pena! Você foi reprovado!");
        }else{
            System.out.println("Opa! Número inválido!");
        }
    }
}
