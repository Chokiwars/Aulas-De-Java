package com.senai.Aula08.Exemplos;

public class Exemplo8 {
    public static void main(String[] args) {
        String Linha = "ID:1 ;Nome:Beatriz ;Idade:18 ";

        String[] tokens = Linha.split(";");
        for (String token : tokens){
            System.out.println(token);
        }
        String valores="";
        for (int i = 0; i < tokens.length; i++) {
            String[] chaveValor = tokens[i].split(":");
            valores += chaveValor[1]+",";
        }
        System.out.println(valores);

        String[] Idade = tokens[2].split(":");

        int valorIdade = Integer.parseInt(Idade[1]);

        System.out.println("A idade agora é:"+(valorIdade+1));
    }
}
