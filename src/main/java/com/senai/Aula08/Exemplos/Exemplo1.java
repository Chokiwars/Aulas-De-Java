package com.senai.Aula08.Exemplos;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("G:\\LOPAL - Rafael\\Bia - IntelliJ\\src\\arquivo.txt");
        if (arquivo.exists()){
            System.out.println("arquivo existe");
        }else{
            System.out.println("arquivo não existe");
            try {
                if (arquivo.createNewFile()){
                    System.out.println(arquivo.getName()+" criado com sucesso!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
