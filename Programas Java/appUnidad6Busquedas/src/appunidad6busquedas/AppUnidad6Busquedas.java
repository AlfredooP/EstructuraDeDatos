/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appunidad6busquedas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppUnidad6Busquedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] vec = new int [20];
        Numero comp, inter;
        comp = inter = new Numero();
        
        for(int i = 0; i < vec.length; i++){
            vec[i] = random.nextInt(900)+100;
            System.out.print(vec[i] + " ");
        }
        
        System.out.println("\nDatos ordenados:");
        Ordenamiento.shellAsc(vec, comp, inter);
        for(int i = 0; i < vec.length; i++){
            System.out.print(vec[i] + " ");
        }
        
        int xx;
        System.out.println("\nNumero a buscar:");
        xx = scanner.nextInt();
        Numero numX = new Numero();
        Busquedas.binaria(vec, xx, numX);
        if(numX.num == -1)
            System.out.println("Busqueda no exitosa");
        else
            System.out.println("Busqueda exitosa, el dato esta en la posición "+(numX.num+1));
        
    }
    
}
