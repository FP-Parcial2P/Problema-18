/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg14;

/**
 *
 * @author Raziel 2
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]matriz = new int[7][7];
        crearTabla(matriz);
        mostrarTabla(matriz);
    }
    public static int[][] crearTabla(int[][]m){
        int i,j;
        for (i=0; i<m.length;i++){
            for(j=0;j<m.length;j++){
            if ((i==j)&&(j==1)){
                m[i][j] = 1;}
            else {m[i][j] = 0;}
        }          
        }
        return m;
}
    public static void mostrarTabla (int[][]m){
        for (int i=0; i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.print(m[i][j]);
                }
    }
}
}