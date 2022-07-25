package co.edu.utp.misiontic2022.c2;
/*Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234 */
import java.util.Scanner;

public class ejercicio2 {
    /*Programa que lea dos variables enteras N y m y le quite a N sus m últimas
cifras. */
    public static void main(String[] args){
        
    int N,m;
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese el número al que desea quitar cifras: ");
    N = sc.nextInt();
    System.out.println("Ingrese la cantidad de cifras que desea quitar: ");
    m = sc.nextInt();

    N = N / (int)Math.pow(10, m);
    System.out.println("El numero N modificado es: "+N);

    }  
}
