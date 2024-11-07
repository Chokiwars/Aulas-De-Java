package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
            System.out.println(".....CLASSIFICAÇÃO DE PRODUTO.....");
        Scanner scan = new Scanner(System.in);

            int codigoProduto = 4;
            switch (codigoProduto){
                case 1:
                    System.out.println("Você escolheu o número 1! Ele está na categoria Eletrônicos");
                    break;
                case 2:
                    System.out.println("Você escolheu o número 2! Ele está na categoria Alimentos");
                    break;
                case 3:
                    System.out.println("Você escolheu o número 3! Ele está na categoria Vestuário");
                    break;
                default:
                    System.out.println("Você escolheu um número indisponível! Tente novamente");
            }
    }
}
