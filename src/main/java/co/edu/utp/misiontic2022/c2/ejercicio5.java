package co.edu.utp.misiontic2022.c2;
/*Programa que lea un carácter por teclado y compruebe si es
una letra mayúscula */
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner mayus= new Scanner(System.in);
        System.out.println("Introduzca una letra: ");
        char letra= mayus.next().charAt(0);
        //if(letra.compareTo("A")>=0 && letra.compareTo("Z")<= 0 && letra=="Ñ") {
        if(Character.isUpperCase(letra)){
            System.out.println("La letra "+letra+" es mayúscula");
    }
        else
            System.out.println("La letra "+letra+" no es mayúscula");
    
    }
}