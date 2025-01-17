/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicasGUI;

import java.util.GregorianCalendar;
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
            double fact = 1;
            if(num == 0||num==1)
                return 1;
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
    
    public static double serieE(double x){
        //double valor = Math.exp(x);
        double serie = 0.0;
        //double i = 0;
        int i= 0;
        do{
            //e = x^0/0! + x^1/1! + x^2/2! + ...
            serie += Math.pow(x,i)/Factorial(i);
            i++;
        }while(serie + 0.000001 <= Math.exp(x));
        return serie;
    }
    
    public static boolean esBisiesto(int año){
        boolean bisiesto = false;
        if(año%4 == 0){
            if(año%400 == 0)
                bisiesto = true;
            else
                if(año%100 != 0)
                    bisiesto = true;
        }
        return bisiesto;
    }
    
    public static boolean esBisiesto2(int año){
        boolean esBis;
        esBis = (año % 4 == 0) && ((año % 100) != 0 || (año % 400) == 0) ? true : false;
        return esBis;
    }
    
    public static boolean esBisiesto3(int año){
        GregorianCalendar calendario = new GregorianCalendar();
        return calendario.isLeapYear(año);
    }
    
    public static double serieT(int n, double t){
        int i = 0;
        double res = 0.0;
        while(n > i && n < 10){
            res = Math.sqrt(t + res);
            ++i;
        }
        return res;
    }
    
     public static double seriePi(int num){
        //Utilizando la formula de Leibniz
        double serie = 0.0;
        for(int i = 0; i<num; i++){
            double numerador = Math.pow(-1, i);
            double denominador = 2*i+1;
            serie += numerador / denominador;
        }
        return serie*4;
    }
}
