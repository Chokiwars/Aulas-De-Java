package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println(".....CÁLCULO DE COMISSÃO.....");
        Scanner scan = new Scanner(System.in);

        float valorVenda = 10000;
        float comissao;
         if (valorVenda < 1000){
             comissao = 0.05f;
             comissao = valorVenda * comissao;
             System.out.println("Sua venda rendeu menos de R$1000! Você receberá comissão de 5%!");
             System.out.println("Sua comissão é de R$" + comissao);
         }
         else if(valorVenda >= 1000 && valorVenda <= 5000){
             comissao = 0.1f;
             comissao = valorVenda * comissao;
            System.out.println("Sua venda rendeu entre R$1000 e R$5000! Você receberá comissão de 10%!");
             System.out.println("Sua comissão é de R$" + comissao);
         }
             else if (valorVenda > 5000){
                 comissao = 0.15f;
                 comissao = valorVenda * comissao;
                 System.out.println("Sua venda rendeu mais de R$5000! Você receberá comissão de 15%!");
             System.out.println("Sua comissão é de R$" + comissao);
         }
    }
}
