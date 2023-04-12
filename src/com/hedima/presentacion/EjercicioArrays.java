package com.hedima.presentacion;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class EjercicioArrays {
    public static void main(String[] args){
//        int[] numeros = new int[4];
//        numeros[0]=5;
//        numeros[1]=4;
//        numeros[2]=3;
//        numeros[3]=2;
//        for(int i=0; i<numeros.length; i++){
//            System.out.println("El valor del elemento "+i+" es "+numeros[i]);
//        }
//    }
//        String[] lista = new String[5];
//        String texto;
//
//        Scanner s1 = new Scanner(System.in);
//        for(int i=0; i<lista.length; i++){
//            System.out.print(i+".-Introduzca un texto ");
//            lista[i]=s1.nextLine();
//            System.out.println(lista[i]);
//        }
//
//        System.out.println(Arrays.toString(lista)   );
//
//
//
//    }
//        int[] numeros = new int[5];
//        Random r1 = new Random();
//        int valorMayor=Integer.MIN_VALUE;
//        System.out.println(valorMayor);
//        // asignar valores aleatorios
//        for(int i=0; i<numeros.length; i++){
//            numeros[i]= r1.nextInt(100);
//        }
//        for(int i=0; i<numeros.length; i++){
//            if (valorMayor<=numeros[i]){
//                valorMayor=numeros[i];
//            }
//        }
//        System.out.println("Lista de valores del Array "+Arrays.toString(numeros));
//        System.out.println("El valor mayor es "+valorMayor);
//    }
//        float[] numeros = {12.5f,15f,10.8f,100f,25.3f};
//        float suma=0;
//
//        for(int i=0; i<numeros.length; i++){
//            suma+=numeros[i];
//        }
//        System.out.println("La suma es "+suma);
//    }
        int[] numeros = {10,20,5,4,99,45};

        for(int i=numeros.length-1; i>=0; i--){
            System.out.println("El valor del elemento "+i+" es "+numeros[i]);
        }
    }

}
