/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appexamenu1;

/**
 *
 * @author alfre
 */
public class Matriz {
    
    public static double[][] matrizPorVector(int[][] mat, double[] vec){
        double[][] prom = new double[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                prom[i][j] = mat[i][j]*vec[j];
            }
        }
        return prom;
    }
}
