package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
/*Programa que lea una variable entera num y compruebe si el
valor corresponde a un num de 30 días, de 31 o de 28.
Supondremos que febrero tiene 28 días. Se mostrará además el
nombre del num. Se debe comprobar que el valor introducido esté
comprendido entre 1 y 12 */

public class ejercicio10 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        int i=1;
        
                System.out.println("Introduzca un número de mes: ");
                while (i<12) {
                int num =  sc.nextInt();
                if (num>12||num<=0) {
                System.out.println("El número no corresponde a un mes, digite un número válido: ");
                       
                }
                else {
                        
                        switch (num) {
                                case 1: System.out.print("Enero"); break;
                                case 2: System.out.print("Febrero"); break;
                                case 3: System.out.print("Marzo"); break;
                                case 4: System.out.print("Abril"); break;
                                case 5: System.out.print("Mayo"); break;
                                case 6: System.out.print("Junio"); break;
                                case 7: System.out.print("Julio"); break;
                                case 8: System.out.print("Agosto"); break;
                                case 9: System.out.print("Septiembre"); break;
                                case 10: System.out.print("Octubre"); break;
                                case 11: System.out.print("Noviembre"); break;
                                case 12: System.out.print("Diciembre"); break;
                        
                                }
                                
                                if (num==2) {
                                        System.out.println(" tiene 28 días");
                                        i=13;
                                        }
                                
                                else if(num==4||num==6||num==9||num==11){
                                        System.out.println(" tiene 30 días");
                                        i=13;
                                        }
                                else{
                                        System.out.println(" tiene 31 días");
                                        i=13;
                                        }
                        
                        }
                        
                }
                
        }

 } 
                

        
    