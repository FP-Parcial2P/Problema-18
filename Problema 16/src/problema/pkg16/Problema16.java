/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg16;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema16 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Recibir 3 números y mostrar el mayor
        int a,b,c;            // variables de los numeros  
        a = solicitarDatos(); //Pimer numero
        b = solicitarDatos(); //Segundo numero
        c= solicitarDatos(); //Tercer numero
        mostrarMayor(a,b,c);
    }
    public static int solicitarDatos() { //Solicitar los 3 numeros
        int d;
        System.out.print("Introduce tres números diferentes: ");
        Scanner teclado = new Scanner(System.in);
        d = teclado.nextInt();
        return d;
    }
    public static void  mostrarMayor(int a, int b, int c){
        if ((a > b)&& (a > c)){
            aMayor(a);}
        else if ((b > a)&&(b > c)){
        bMayor(b);}
        else if  ((c > b)&& (c > b)){
        cMayor(c);}
        else { System.out.println("Uno mas números son iguales");
    }
            
        }

    public static void aMayor(int a){
        System.out.println("\n" + a + "  Es el numero mayor");
    }
    public static void bMayor(int b){
        System.out.println("\n" + b + " Es el numero mayor");
    }
    public static void cMayor(int c){
        System.out.println ("\n" + c + " Es el numero mayor");
    }
}
