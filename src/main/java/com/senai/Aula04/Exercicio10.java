package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(".....CONVERSÃO DE MOEDAS.....");
        Scanner scanner = new Scanner(System.in);

        double operacao=0;
        int valorMoeda = 0, codigoMoeda =0;
        double reais=0, dolar=0.18, euro=0.16, libra=0.14;

        System.out.println("Digite abaixo qual valor em reais você deseja converter!");
        valorMoeda = scanner.nextInt();
        System.out.println("Escolha abaixo qual tipo de moeda você deseja converter!");
        System.out.println("Sendo: 1- Dólar, 2- Euro, 3- Libra");
        codigoMoeda = scanner.nextInt();


        switch (codigoMoeda) {
            case 1:
                double converterDolar = valorMoeda * dolar;
                System.out.println("Seus " + valorMoeda + " reais convertidos em dólares valem $"+converterDolar+" dólares!");
                break;
            case 2:
                double converterEuro = valorMoeda * euro;
                System.out.println("Seus "+valorMoeda+" reais convertidos em euros valem $"+converterEuro+" euros!");
                break;
            case 3:
                double converterLibras = valorMoeda * libra;
                System.out.println("Seus "+valorMoeda+" reais convertidos em libras valem $"+converterLibras+" libras!");
            default:
                System.out.println("Número inválido! Tente novamente.");
        }

    }
}
