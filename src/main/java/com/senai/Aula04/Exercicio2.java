package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println(".....DESCONTO EM COMPRA.....");
        Scanner scan = new Scanner(System.in);

        double valorCompra = 500.00;
        if (valorCompra > 100.00){
            double desconto = (valorCompra * 10) / 100;
            valorCompra = valorCompra - desconto;
            System.out.println("Você recebeu um desconto de R$" + desconto + " sua compra vai ficar no valor de R$" + valorCompra);
        }else{
            System.out.println("Você não possue desconto!");
        }
    }
}
