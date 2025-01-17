/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimple;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppColaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("CANT DE DATOS:");
        int n = scan.nextInt();
        Cola cola = new Cola(n);
        Random random = new Random();
        int dato;
        System.out.println("INSERTANDO DATOS EN UNA COLA");
        for(int i = 0; i < cola.vec.length; i++){
            dato = random.nextInt(90)+10;
            System.out.println("Dato = " + dato);
            if(cola.agregar(dato))
                System.out.println("\033[32m DATO AGREGADO");
            else
                System.out.println("\033[35m DESBORDAMIENTO - OVERFLOW");
        }
        cola.mostrar();
        System.out.println("ELIMINANDO DATOS DE LA COLA");
        Numero numero = new Numero();
        
        while(cola.extraer(numero)){
            System.out.println("\033[35m Dato extraido " + numero.num);
        }
    }
    
}
