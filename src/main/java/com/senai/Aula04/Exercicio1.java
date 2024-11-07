package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println(".....VERIFICAÇÂO DE ACESSO À SISTEMA.....");
        Scanner scan = new Scanner(System.in);

        int idade = 17;
        if (idade < 18){
            System.out.println("Você é de menor e não pode acessar o sistema!");
        }else{
            System.out.println("Você é de maior e pode acessar o sisema!");
        }
    }
}