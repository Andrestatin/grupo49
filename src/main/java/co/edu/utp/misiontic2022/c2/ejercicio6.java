package co.edu.utp.misiontic2022.c2;
/*Programa que lea un número entero y muestre si el número es
múltiplo de 10. */
import java.util.Scanner;
public class ejercicio6 {
   public static void main(String[] args) {
       Scanner numero= new Scanner(System.in);
       System.out.println("Ingrese un número: ");
       int parimpar= numero.nextInt();
       if(parimpar%10==0)
            System.out.println("El número que acaba de ingresar es multiplo de 10");
        else
           System.out.println("El número que acaba de ingresar no es multiplo de 10");
   }
}
