/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg17;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Programa para obtener máximo común divisor
        int a,b;
        a = solicitarDatos(); //Solicitamos el primero numero
        b = solicitarDatos(); //SOlicitamos el segundo numero en el mismo método
        calcularYMostrarMCD(a,b); //calculamos y mostramos el resultado 
    }
    public static int solicitarDatos(){ //Solicitamos los dos numeros en un método
    int d;
    System.out.print("A continuación ingresa dos numeros \n");
    System.out.print("Numero: "); 
    Scanner teclado = new Scanner(System.in);
    d = teclado.nextInt();
    while (d<0){ 
        System.out.println("Los numero tiene que ser positivo, vuelve a introducirlo"); 
        d = teclado.nextInt();
    }
    return d;
}
    public static void calcularYMostrarMCD(int a, int b){ // Calcular máximo común dvisor
     int x;
     if (a>b) {   // Cuando a sea mayor que b, hacer que a sea el menor:
         x = b;   // Guardamos b en la variable x
         b = a;   // convertimos "b" a "a"
         a = x;   // convertimos "a" a "b" de manera que "a" siempre sea el menor
      } 
     int y = 1;
     while (y !=0){ // Hasta que y sea igual a 
         y = b % a; // y es igual al resiudo de b entre a
     
         if (y!= 0){ // si y no es igual a 0
             b = a;  // convertir b al valor de a
             a = y;  // a será igual al residuo
     }  
     }
      System.out.print("El máximo comun divisor de a + b es igual a: " + a);  // mostrar a 

}
}
