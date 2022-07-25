package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
/*Programa que lea dos números por teclado y muestre el
resultado de la división del primer número por el segundo. Se
debe comprobar que el divisor no puede ser cero */

public class ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ingresa el primer número: ");
        float numero1= sc.nextFloat();
        System.out.println("ingresa el segundo número: ");
        float numero2= sc.nextFloat();
        float division= numero1/numero2;
        if(numero1==0)
            System.out.println("Operación no permitida, el divisor debe ser mayor a 0");
        else
            System.out.println("El resultado de la división entre el primer número y el segundo es: "+division);
        
    }
}
