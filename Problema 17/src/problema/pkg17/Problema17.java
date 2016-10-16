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
    public static void main(String[] args) { //Programa para obtener máximo compun divisor
        int a,b;
        a = solicitarDatos(); //Solicitamos el primero numero
        b = solicitarDatos(); //SOlicitamos el segundo numero en el mismo método
        calcularYMostrarMCD(a,b);
    }
    public static int solicitarDatos(){ //Solicitamos los dos numeros
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
      int x, div = 2, y=1;
      if (a>b) {
          x = a;}
      else { x = b;}
      while (x>=div){
      if((a%div==0) && (b%div==0)) {
          a = a/div;
          b = b/div;
          y = y*div;
      }
      else { y ++; }
      }
      System.out.print(y);   
}
}
