package co.edu.utp.misiontic2022.c2;
/*El programa lee por teclado tres números enteros y calcula y
muestra el mayor de los tres. */
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite un numero: ");
        float num1=sc.nextFloat();
        System.out.println("Digite un segundo numero: ");
        float num2=sc.nextFloat();
        System.out.println("Digite un tercer numero: ");
        float num3=sc.nextFloat();
        if(num1>num2&&num1>num3){
            System.out.println("El número de mayor denominación es: "+num1);
        }
        else if(num2>num3&&num2>num1){
            System.out.println("El número de mayor denominación es: "+num2);  
        }
        else{
            System.out.println("El número de mayor denominación es: "+num3); 
        }
    }
}

