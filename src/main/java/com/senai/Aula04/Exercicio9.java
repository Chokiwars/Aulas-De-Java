package com.senai.Aula04;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println(".....DETERMINAÇÃO DE TURNO.....");
        Scanner scan = new Scanner(System.in);

        int hora = 4;

        if (hora >= 5 && hora <=12){
            System.out.println("São " + hora + "hs e está de manhã!");
            if (hora >12 && hora <=18) {
                System.out.println("São " + hora + "hs e está de tarde!");
                if (hora >18 && hora <=22){
                    System.out.println("São " + hora + "hs e está de noite!");
                    if (hora >22 && hora <5){
                        System.out.println("São " + hora + "hs e está de madrugada!");
                    }
                }
            }
        }
    }
}
