package com.senai.Aula08.Exercicios;

import java.io.*;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(".....COPIAR CONTEÚDO DE UM ARQUIVO PARA OUTRO.....");

        try {
            FileReader lerArquivo = new FileReader("src\\alunos.txt");
            BufferedReader bufferedReader = new BufferedReader(lerArquivo);
            FileWriter escreverUmArquivo = new FileWriter("src//backup_alunos.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(escreverUmArquivo);
            int caracter;
            String nomes = "";
            while ((caracter = bufferedReader.read()) != -1){
                nomes += (char) caracter;
           }
            System.out.print(nomes);
            bufferedReader.close();
            lerArquivo.close();

            bufferedWriter.write(nomes);

            bufferedWriter.close();
            escreverUmArquivo.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
