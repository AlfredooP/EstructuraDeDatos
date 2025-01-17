/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu2recursividad;

/**
 *
 * @author Guest
 */
public class MatematicasRec {
    
    public static int factorial(int n){
        int f = 1;
        if(n == 0 || n == 1)
            return f;
        else
            f = n * factorial(n-1);
        return f;
    }
    
    public static double factorial(double n){
        double f = 1;
        if(n == 0 || n == 1)
            return f;
        else
            f = n * factorial(n-1);
        return f;
    }
    
    public static int sumatoria(int n){
        int f= 0;
        if(n == 0)
            return f;
        else
            f = n + sumatoria(n-1);
        return f;
    }
    
    public static void invertirNumero(int n){
        System.out.printf("%d  ", n%10);
        if(n >= 10)
            invertirNumero(n/10);
    }
    
    public static void invertirNumero(String cadena){
        char arrChar [] = cadena.toCharArray();
        //char arrInv [] = new char [arrChar.length];
        //int j = 0;
        for(int i = arrChar.length - 1; i >= 0; i--){
            System.out.print(arrChar[i]);
        }
    }
    
    public static int serieFibonacci(int n){
        if(n == 1 || n == 2)
            return 1;
        else
            return serieFibonacci(n-1) + serieFibonacci(n-2);
        
    }

    public static int combinaciones(int n, int r){
        int resul = 0;
        if(n == 1 || r == 0 || n <= r)
            return 1;
        else
            resul = combinaciones(n-1, r) + combinaciones(n-1, r-1);
        return resul;
    }
    
    public static void hanoi(int n, int origen, int auxiliar, int destino){
        if(n == 1){
            System.out.println("Mover disco de " + origen + " a " + destino);
        }
        else{
            hanoi(n-1, origen, destino, auxiliar);
            System.out.println("Mover disco de " + origen + " a " + destino);
            hanoi(n-1, auxiliar, origen, destino);
        }
        
    }
}
