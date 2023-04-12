package com.hedima.presentacion;
import java.lang.Character;
import java.util.Arrays;
public class EjercicioArrayChar {
    public static void main(String[] args){

        // Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres. El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.

        char[] lista = {'H','o','l','A','m','U','n','d','o'};

        for(int i=0; i<lista.length; i++){
            switch(Character.toUpperCase(lista[i])) {
                case 'A','E','I','O','U': System.out.println("Vocal "+lista[i]+" posicion "+i);
            };

        }
        System.out.println(Arrays.toString(lista));
    }


}
