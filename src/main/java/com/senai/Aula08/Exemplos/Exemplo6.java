package com.senai.Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6 {
    public static void main(String[] args) {
            try {
                FileWriter fileWriter = new FileWriter("src\\arquivo.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write("\nTexto escrito no arquivo com buffer com modo append");
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
