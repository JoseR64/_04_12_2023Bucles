package com.hedima.presentacion;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
//
        int suma=0, numero=0;

        Scanner s1 = new Scanner(System.in);
        do {
            System.out.print("Introducir numero ");
            numero=s1.nextInt();
            suma+=numero;
        }while(numero!=0);
            System.out.println("Se acabo el bucle. La suma de los numero es "+suma);
    }


}
