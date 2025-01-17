/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfactorial;

import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class Matematicas {
    
    Scanner scanner = new Scanner(System.in);
    
    public static int Factorial(int num){
            int fact = 1;
            for(int i = 1; i <= num;){
                fact *= i;
                i++;
            }
            return fact;
        }
    
    public static double Factorial(double num){
            int fact = 1;
            for(int i = 1; i <= num;){
                fact *= i;
                i++;
            }
            return fact;
        }
    
    public static boolean esPrimo1(int n){
        for(int div = 2; div < n; div++){
            if(n%div == 0)
                return false;
        }
        return true;
    }
    
    public static boolean esPrimo2(int n){
        int div = 2;
        while(div < n){
            if(n%div == 0)
                return false;
            ++div;
        }
        return true;
    }
    
    public static void primoEntreNumeros(int rI, int rS){
        int contPrimos = 0;
        for(int inicio = rI; inicio < rS; inicio++){
            if(Matematicas.esPrimo2(inicio)){
                contPrimos++;
                System.out.println(inicio);
            }
        }
        System.out.println("Cantidad de numeros primos entre " + rI + " y " + rS + " = " + contPrimos);
    }
}
