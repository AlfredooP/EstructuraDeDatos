/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmatrizclase;

/**
 *
 * @author Guest
 */
public class Matriz {
    
    //EXAMEN UNIDAD I, VIERNES 6 / OCT
    int [][] mat ;
    
    public Matriz(){
        mat = new int[3][3];
    }
    
    public Matriz(int nr, int nc){
        mat = new int [nr][nc];
        for(int r=0; r < nr; r++)
            for(int c = 0; c < nc; c++)
                mat[r][c] = 0;
        
    }
    
    //CONSTRUCTOR CON ARREGLO BIDIMENSIONAL
    public Matriz(int [][]m){
        mat = new int [m.length][m[0].length];
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m[0].length; j++)
                mat[i][j] = m[i][j];
    }
    
    //CONSTRUCTOR DE COPIA
    public Matriz(Matriz m){
        mat = new int [m.mat.length][m.mat[0].length];
        for(int i = 0; i < mat.length; i++)
            for(int j = 0; j < mat[0].length; j++)
                this.mat[i][j] = m.mat[i][j];
    }
    
    public int nRen(){
        return this.mat.length;
    }
    
    public int nCol(){
        return mat[0].length;
    }
    
    public static int[][] multiplica(int [][] matA, int [][] matB){
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
    
    public static Matriz multiplicar(Matriz matA, Matriz matB){
        //Matriz matC = new Matriz(matA.mat.length, matB.mat[0].length);
        Matriz matC = new Matriz(matA.nRen(), matB.nCol());
        
        if(matA.nCol() == matB.mat.length){
            for(int i = 0; i < matA.nRen(); i++){
                for(int j = 0; j < matB.nCol(); j++){
                    matC.mat[i][j] = 0; //en Java no se requiere
                    for(int k = 0; k < matB.mat[0].length; k++)
                        matC.mat[i][j] += matA.mat[i][k] * matB.mat[k][j];
                }
            }
        }
        return matC;
    }
    
    public Matriz multiplicar(Matriz mB){
        Matriz mC = new Matriz(this.nRen(), mB.nCol());
        if(this.nCol() == mB.nRen()){
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mB.nRen(); j++){
                    mC.mat [i][j] = 0;
                    for(int k = 0; k < mB.nCol(); k++)
                        mC.mat[i][j] += this.mat[i][k] * mB.mat[k][j];
                }
            }
        }
        return mC;
    }
}
