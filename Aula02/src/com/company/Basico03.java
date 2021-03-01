package com.company;

import java.util.Random;

public class Basico03 {
    //Estruturas de repetição
    public static void main(String[] args) {
        int limite =10;
        int contador;
        for(contador = 0; contador < limite; contador++){
            System.out.println("Contador:" + contador);
        }
        int senha = 123456;
        //objeto que possibilita pegar numeros aleatorios
        Random sorteador = new Random();
        int chute = sorteador.nextInt(999999);
        int tentativas =0;
        while (chute != senha) {
            System.out.println("Tentativas:" + tentativas);
            System.out.println("Chute:" + chute);
            chute = sorteador.nextInt(999999);
            tentativas++;
        }
        System.out.println("Parabens!");

        }
    }
