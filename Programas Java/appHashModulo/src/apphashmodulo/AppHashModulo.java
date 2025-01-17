/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphashmodulo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppHashModulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vec = new int[7]; //Para el tamaño del arreglo verificar si es primo, si no buscar el mas proximo
        Random random = new Random();
        for(int i = 0; i < vec.length; i++){
            int key = random.nextInt(90)+10;
            System.out.println("Clave = "+key);
            //Hash nos devolvera el indice donde se ubicara la clave
            int indice = HashModulo.modulo(vec, key, vec.length);
            vec[indice] = key;
        }
        System.out.println("Datos ubicados en el arreglo por Hash");
        for(int i = 0; i < vec.length; i++){
            System.out.println("vec["+(i+1)+"] : "+vec[i]);
        }
        
        Scanner scanner = new Scanner(System.in);
        char resp;
        do{
            System.out.println("Dato a buscar : ");
            int dato = scanner.nextInt();
            int pos = HashModulo.buscar(vec, dato, vec.length);
            if(pos == -1)
                System.out.println("Dato no existe");
            else
                System.out.println("Dato encontrado en la posicion "+(pos+1));
            System.out.println("Buscar otro? (s|n): ");
            resp = Character.toLowerCase(scanner.next().charAt(0));
        }while(resp == 's');
        
    }
    
}
