package com.senai.Aula07.Exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        funcaoSemParametroComRetorno(2,"teste");
    }

    static void funcaoSemParametroComRetorno (int parametro1, String parametro2){
        System.out.println("parametro1 = "+parametro1);
        System.out.println("paramero2 = "+parametro2);
    }
}
