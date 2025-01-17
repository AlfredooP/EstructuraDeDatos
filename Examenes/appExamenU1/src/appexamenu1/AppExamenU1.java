/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appexamenu1;

import java.text.DecimalFormat;

/**
 *
 * @author alfre
 */
public class AppExamenU1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat(".##");
        
        int[][] mat = {{75,82,86}, {91,95,100}, {65,70,68}, {59,80,99}, {75,76,74}};
        double[] vec = {0.3,0.3,0.4};
        double[][] prom = Matriz.matrizPorVector(mat, vec);
        
        System.out.println("Matriz de Promedios de Exámenes");
        
        for(int i = 0; i < prom.length; i++){
            for(int j = 0; j < prom[0].length; j++){
                System.out.print(df.format(prom[i][j]) + " | ");
            }
            System.out.println("Promedio del alumno " + (i+1) + " = " + df.format(prom[i][0]+prom[i][1]+prom[i][2]));
        }
    }
    
}


//ERRORES:
//vec es arreglo double
//se recorrio al reves la matriz en el metodo
//mal constructor de matriz
//redondear nums