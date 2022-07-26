package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
/*Programa que lea por teclado tres números enteros H, M, S
correspondientes a hora, minutos y segundos respectivamente, y
comprueba si la hora que indican es una hora válida */

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        int H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        int M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        int S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)                                                          
           System.out.println("Hora válida");
        else
            System.out.println("No es una hora válida");
    }
}
