/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void vec_Nones(int [][] mat, int [] vecNones){
        for(int r = 0; r < mat.length; r++)
            for(int c = 0; c < mat[0].length; c++)
                if((mat[r][c] % 2) != 0)
                    vecNones[r]++;
    }
    
    public static double promDiagPrincipal(int [][] mat){
        double prom = 0.0;
        if(mat.length == mat[0].length){
            for(int i = 0; i < mat.length; i++){
                prom += mat [i][i];
            }
        }
        return prom/mat[0].length;
    }
    
    public static double promDiagInversa(int [][] mat){
        double prom = 0.0;
        if(mat.length == mat[0].length){
            for(int i = 0, j = mat.length-1; j > 0; i++, j--){
                prom += mat[i][j];
            }
        }
        return prom/mat[0].length;
    }
    
    public static int [][] multipMat(int [][] matA, int [][] matB){
        int [][] matC = new int [matA[0].length][matB[0].length];
        int mult = 0; int mult2 = 0; int mult3 = 0;
        for(int i = 0; i < matC.length; i++){
            for(int j = 0; j < matC[0].length; j++){
                mult = matA[i][j] * matB[j][i];
                mult2 = matA[i+1][j+1] * matB[j+1][i+1];
                mult3 = matA[i+2][j+2] * matB[j+2][i+2];
                
                matC[i][j] = mult + mult2 + mult3;
            }
        }
        return matC;
    }
    
    public static int [][] multiplica(int [][] matA, int [][] matB){
        int [][] matC = new int [matA.length][matB[0].length];
        if(matA[0].length == matB.length){
            for(int i = 0; i < matA.length; i++){
                for(int j = 0; j < matB[0].length; j++){
                    matC[i][j] = 0;
                    for(int k = 0; k < matB[0].length; k++)
                        matC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        return matC;
    }
        
    
    public static void main(String[] args) {
        
//        int [][] mat = {{123}, {456}, {789}};
//        
//        for(int ren = 0; ren < mat.length; ren++){
//            for(int col = 0; col < mat[0].length; col++){
//                System.out.print(mat[ren][col] + " , ");
//            }
//            System.out.println("");
//        }
//        
//        int [] vecNones = new int [mat.length];
//        for(int r = 0; r < mat.length; r++){
//            for(int c = 0; c < mat[0].length; c++){
//                if((mat[r][c] % 2) != 0)
//                    vecNones[r]++;
//            }
//        }
        
        //USANDO VALORES POR DEFAULT
        //ASIGNAR NUM DE REN Y DE COL DE MANERA ALEATORIA
        //                3 <= m, n <= 10
        //ADEMAS ASIGNE NUMEROS ALEATORIOS DE 2 DIGITOS
        
        Random random = new Random();
        
////        int [][]mat = new int [random.nextInt(8)+3][random.nextInt(8)+3];
////        
////        for(int ren = 0; ren < mat.length; ren++){
////            for(int col = 0; col < mat[0].length; col++){
////                mat[ren][col] = random.nextInt(90)+10;
////                System.out.print(mat[0][col] + " | ");
////            }
////            System.out.print(mat[ren][0] + " | ");
////        }
////        
////        int vecNones[] = new int[mat.length];
////        vec_Nones(mat, vecNones);
        
        Scanner scanner = new Scanner(System.in);
        int numCol = 0; int numRen = 0;
        do{
            System.out.println("INGRESE EL NUMERO DE COLUMNAS: ");
            numCol = scanner.nextInt();
            if(numCol > 3 && numCol < 10){
                System.out.println("INGRESE EL NUMERO DE RENGLONES: ");
                numRen = scanner.nextInt();
                if(numRen > 3 && numRen < 10){
                    int [][] mat = new int [numRen][numCol];
                    for(int ren = 0; ren < mat.length; ren++){
                        for(int col = 0; col < mat[0].length; col++){
                            mat[ren][col] = random.nextInt(90)+10;
                            System.out.print(mat[ren][col] + " | ");
                        }
                        System.out.println("");
                    }
                    System.out.println("promedio diag princ = "+ promDiagPrincipal(mat));
                    System.out.println("promedio diag inv = "+ promDiagInversa(mat));
                }
                else{
                    System.out.println("ERROR, NUMERO NO VALIDO");
                }
            }
            else{
                System.out.println("ERROR, NUMERO NO VALIDO");
            }
        }while(numCol < 3 || numCol > 10 || numRen < 3 || numRen > 10);
        
        int matA [][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int matB [][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int matC [][] = multiplica(matA, matB);
        
        for(int ren = 0; ren < matC.length; ren++){
            for(int col = 0; col < matC[0].length; col++){
                System.out.print(matC[ren][col] + "|");
            }
            System.out.println("");
        }
        
    }
    
}
