package co.edu.utp.misiontic2022.c2;
    /*Programa que pida por teclado la fecha de nacimiento de una persona
(día, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha
de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
28
Número de la suerte: 28 */
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        
    Scanner fechas = new Scanner(System.in);
        System.out.println("Ingrese la fecha de su nacimiento");
        System.out.println("Ingrese el año: ");
        int año= fechas.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes= fechas.nextInt();
        System.out.println("Ingrese el día: ");
        int dia= fechas.nextInt();
        int suma= año+mes+dia;
        int num1= suma/1000;
        int num2= suma/100%10;
        int num3= suma/10%10;
        int num4= suma%10;
        int numSuert= num1+num2+num3+num4;
        System.out.println("su numero de la suerte es: "+ numSuert);
    }
}
