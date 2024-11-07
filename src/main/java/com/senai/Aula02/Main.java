package com.senai.Aula02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numLong = 100;
        int numInt = 10;
        short numShort = 130;
        byte numByte = 120;

        //casting inplicito
        numLong = numInt;
        numInt = numShort;
        numShort = numByte;
        numLong = numByte;
        numLong = numShort;

        //casting explicito
        numByte = (byte) 150;
        numShort = (short) 150;

        System.out.println(numByte);
        System.out.println(numShort);

        numInt = (int) 32.45f;

        System.out.println(numInt);

        float numFloat = 150.01556f;
        double numDouble = 210.320;

        numDouble = numFloat;
        numFloat = (float) numDouble;

        System.out.println(numFloat);

        numFloat = (float) 100000000049005565.85;
        System.out.println(numFloat);
    }
}