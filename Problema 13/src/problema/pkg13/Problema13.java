/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg13;
import java.util.*;

/**
 *
 * @author Raziel 2
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Prograama que calcula el promedio de 30 numeros y revisar si estan por debajo o encima del promedio
    int []x= new int [30];
    double m;
    x = crearArreglo(x);
    m = obtenerMedia(x);
    mostrarEncimaYDebajoPromedio(x,m);
    
    }  
    public static int[] crearArreglo(int[]x){ //Llenar Arreglo
    int i;
    Scanner teclado = new Scanner(System.in);
    for (i=0; i <30; i++){
    System.out.print("Ingrese 30 numeros para llenar el arreglo: [" + i + "]");
    x[i]=teclado.nextInt();
    }
    return x;
}
    public static double obtenerMedia(int x[]){ //obtener promedio 
     int a = 0; double m;               
     for (int i=0; i <30 ; i++){           
             a = a + x[i];       
}
     m = a/30; 
     return m;
            
    }
    public static void mostrarEncimaYDebajoPromedio(int[]x,double m){ //Mostrar cantidad por debajo y por encima del promedio
        int e=0; int d=0;
        for (int i= 0; i<30 ; i++ ){
        if (x[i] > m){ 
     e++;                           //Aumentar cantidad numeros por encima del promedio
    } else {d++;}                   //Aumnetar cantidad de numeros por debajo del promedio
    }
        System.out.println("La cantidad de numeros por encima del promedio son: " + e);
        System.out.println("La cantidad de numeros por debajo del promedio son: " + d);
}
    
}