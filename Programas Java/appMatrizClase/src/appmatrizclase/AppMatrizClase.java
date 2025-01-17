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
public class AppMatrizClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matrizA = {{1,2,3},
                            {4,5,6},
                            {7,8,9},
                            {10,11,12}};
        int [][] matrizB = {{1,2,3},{4,5,6},{7,8,9}};
        
        Matriz mA = new Matriz(matrizA);
        Matriz mB = new Matriz(matrizB);
        
        System.out.println("Matriz A");
        for(int i = 0; i < mA.nRen(); i++){
            for(int j = 0; j < mA.nCol(); j++){
                System.out.print(mA.mat[i][j] + " | ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz B");
        for(int i = 0; i < mB.nRen(); i++){
            for(int j = 0; j < mB.nCol(); j++){
                System.out.print(mB.mat[i][j] + " | ");
            }
            System.out.println("");
        }
        
        //UTILIZAR EL METODO QUE RECIBE DOS OBJETOS MATRIZ Y REGRESA UNA MATRIZ
        Matriz mC = new Matriz(mA.nRen(), mB.nCol());
        mC = Matriz.multiplicar(mA, mB);
        
        System.out.println("Multiplicacion de matrices");
        for(int i = 0; i < mC.nRen(); i++){
            for(int j = 0; j < mC.nCol(); j++){
                System.out.print(mC.mat[i][j] + " | ");
            }
            System.out.println("");
        }
        
        //UTILIZAR EL METODO QUE INVOCA A MULTIPLICAR CON UN OBJETO
        //RECIBE UN OBJETO Y REGRESA UN OBJETO (TIPO MATRIZ)
        Matriz mC2 = new Matriz(mA.nRen(), mB.nCol());
        mC2 = mA.multiplicar(mB);
        
        System.out.println("Multiplicacion de matrices, utilizando objetos matriz, resultado en matriz C2");
        for(int i = 0; i < mC2.nRen(); i++){
            for(int j = 0; j < mC2.nCol(); j++){
                System.out.print(mC2.mat[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
