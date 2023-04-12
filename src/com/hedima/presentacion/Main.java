package com.hedima.presentacion;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random r1 = new Random();
        int numeroAdivinar= r1.nextInt(20);
        int numero=-1, intentos=0;
        Scanner s1 = new Scanner(System.in);

        while (numero!=numeroAdivinar){
            intentos++;
            System.out.println("Introducir numero a adivinar ");
            numero=s1.nextInt();
            if (numero==numeroAdivinar){
                System.out.println(numero+" ¡¡ Has adivinado el numero en "+intentos+" intentos !! ");
            }else if (numero>numeroAdivinar){
                System.out.println("El numero es menor.Intentalo de nuevo!");
            }else{
                System.out.println("El numero es mayor.Intentalo de nuevo!");
            }
        }

    }
}