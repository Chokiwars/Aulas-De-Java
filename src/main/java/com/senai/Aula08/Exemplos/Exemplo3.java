package com.senai.Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("src//arquivo.txt", true);
            fileWriter.write("\nTexto escrito com o modo append habilitado");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
