package co.edu.utp.misiontic2022.c2;
/*Programa que calcula el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado */
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){

    
    Scanner sc= new Scanner(System.in);
    double precioUnidad, cantidadProducto,Iva,precioSinIva,totalIva,total;
    System.out.println("por favor introduzca el precio por unidad");
    precioUnidad = sc.nextDouble();
    System.out.println("por favor introduzca la cantidad de productos");
    cantidadProducto = sc.nextDouble();
    System.out.println("por favor introduzca el valor del Iva");
    Iva = sc.nextDouble();
    precioSinIva= precioUnidad*cantidadProducto;
    totalIva= precioSinIva*Iva/100;
    total= totalIva+precioSinIva;
    System.out.println("El precio de venta del producto es: " + total);

    }
    
}
