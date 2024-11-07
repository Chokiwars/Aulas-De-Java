package com.senai.Aula08.Exemplos;

import java.io.*;

public class Exemplo7 {
    public static void main(String[] args) {
        File arquivo = new File("src\\arquivo.txt");
        if (arquivo.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
                String Linha;
                while ((Linha = bufferedReader.readLine())!= null) {
                    System.out.println(Linha);
                }
                bufferedReader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
