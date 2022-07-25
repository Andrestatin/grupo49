package co.edu.utp.misiontic2022.c2;
/*Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
teclado */

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        double velocidad;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la velocidad en Km/h: ");
        velocidad=sc.nextDouble();
        velocidad=velocidad*1000/3600;
        System.out.println("la velocidad en m/s corresponde a: "+velocidad);

    }
    
}
