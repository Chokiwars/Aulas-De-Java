package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println(".....ESCOLHA DE OPERAÇÃO.....");
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;
        int operacao;

        System.out.println("Digite um número");
        n1 = scan. nextInt();
        System.out.println("Digite outro número");
        n2 = scan. nextInt();
        System.out.println("Escolha um número de 1 a 4 dependendo de qual operação você deseja fazer!");
        operacao = scan. nextInt();
       switch (operacao){
           case 1:
               System.out.println("Você escolheu Soma!");
               int soma = n1 + n2;
               System.out.println("O resultado da soma dos números " + n1 + " mais " + n2 + " é : " + soma);
               break;
           case 2:
               System.out.println("Você escolheu Subtração!");
               int sub = n1 - n2;
               System.out.println("O resultado da subtração dos números " + n1 + " menos " + n2 + " é : " + sub);
               break;
           case 3:
               System.out.println("Você escolheu Multiplicação!");
               int multi = n1 * n2;
               System.out.println("O resultado da multiplicação dos números " + n1 + " vezes " + n2 + " é : " + multi);
               break;
           case 4:
               System.out.println("Você escolheu Divisão!");
               int divi = n1 / n2;
               System.out.println("O resultado da divisão dos números " + n1 + " dividido por " + n2 + " é : " + divi);
           default:
        }
    }
}
