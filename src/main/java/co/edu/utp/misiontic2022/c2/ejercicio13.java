package co.edu.utp.misiontic2022.c2;
/*Realizar programa que muestre los números del 1 al 100 que no
sean múltiplos de 3, utilizando cada una las instrucciones
repetitivas (while, do while, for) */
public class ejercicio13 {
    public static void main(String[] args) {
        int num= 0;
        do{
            if(num%3!=0)
            System.out.println(num);
                num++;
        }
        while (num<=100);
        
    }
}
                       
        

