/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg12;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema12 { //Calcular media de posiciones pares de un arreglo de 10 numeros

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Media de numeros en posiciones pares de un arreglo
    int []x= new int [10];
    x = crearArreglo(x);
    mostrarMedia(x);
    }  
    public static int[] crearArreglo(int[]x){ //Llenar Arreglo
    int i;
    Scanner teclado = new Scanner(System.in);
    for (i=0; i <10; i++){
    System.out.print("Ingrese 10 numeros para llenar el arreglo: [" + i + "]");
    x[i]=teclado.nextInt();
    }
    return x;
}
    public static void mostrarMedia(int x[]){ //Calcular la media de las posiciones pares
     double m = 0;               // variable para calcular media
     for (int i=0; i <10 ; i++){ //Hasta que i sea 10
        if (i % 2 == 0){         //Si i es divisible entre 2 para saber si es par 
             m = m + x[i];       
}
     }
        System.out.print("La media de numeros en posiciones pares es igual a: "+ (m/5));
     
}
}