/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmatematicas;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class Menu {
    
    public static char Opciones(){
        
        System.out.println("\n\t\u001B[31m METODOS DE LA CLASE MATEMATICAS");
        System.out.println("\u001B[34m1) \u001B[30mFactorial Int (0-12)");
        System.out.println("\u001B[34m2) \u001B[30mFactorial Double (>12)");
        System.out.println("\u001B[34m3) \u001B[30mNumero Primo");
        System.out.println("\u001B[34m4) \u001B[30mSerie E");
        System.out.println("\u001B[34m5) \u001B[30mAño Bisiesto");
        System.out.println("\u001B[34m6) \u001B[30mSerie T");
        System.out.println("\u001B[34m7) \u001B[30mSerie PI");
        System.out.println("\u001B[34m8) \u001B[30mSalir");
        System.out.print("\n\u001B[34mTu Opción: ");
        
        Scanner teclado = new Scanner(System.in);
        char opcion = teclado.next().charAt(0);
        return opcion;
    }
    
}
