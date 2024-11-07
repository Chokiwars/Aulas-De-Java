package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println(".....CÁLCULO DE HORAS EXTRAS.....");
        Scanner scanner = new Scanner(System.in);

        double horasTrabalhadas = 40;
        double horasExtras = 2;
        double cauculo = horasTrabalhadas + horasExtras;
        double valorPago;

        if (cauculo > 40){
            valorPago = horasExtras * 30;
            System.out.println("O valor a ser pago pelas suas horas extras é de R$" + valorPago);
        }else{
            System.out.println("Você não fez horas extras e não receberá a mais!");
        }
    }
}
