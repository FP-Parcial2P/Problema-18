/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema18 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  //Programa para calcular el mínimo común múltiplo 
        int a,b,c,max;
        a = solicitarDatos(); //Solicitamos el primero numero
        b = solicitarDatos(); //SOlicitamos el segundo numero en el mismo método
        c = solicitarDatos(); //Solicitamos el tercer numero
        max = calcularMinimo(a,b,c); // Calculamos el numero minimo
        calcularYMostrarMCM(a,b,c,max); //calculamos y mostramos el resultado 
    }
    public static int solicitarDatos(){ //Solicitamos los tres numeros en un método
    int d;
    System.out.print("A continuación ingresa tres numeros \n");
    System.out.print("Numero: "); 
    Scanner teclado = new Scanner(System.in);
    d = teclado.nextInt();
    while (d<0){ 
        System.out.println("El numero tiene que ser positivo, vuelve a introducirlo"); 
        d = teclado.nextInt();
    }
    return d;
}
    public static int calcularMinimo(int a, int b, int c){
       int max;
       max =  Math.max(Math.max(a,b),c);
       return max;
    }
    public static void calcularYMostrarMCM(int a, int b, int c,int max){ // Calcular mínimo común múltiplo
     int mcm = 1;
     for (int i = 2; i<=max; i++){   
         while (a%i==0 || b%i==0 || c%i==0){ //Si el residuo a b o c entre i es igual a 0
             mcm = mcm*i;
             if(a%i==0) 
             a=a/i; 
             if(b%i==0)
             b=b/i; 
             if(c%i==0) 
             c=c/i; 
         }
     }
     System.out.print("El minimo comun múltiplo de a b y c es igual a: " + mcm); //Mostrar mcm
}
}