/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu2recursividad;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppU2Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 4;
        int fresul = MatematicasRec.factorial(num);
        System.out.printf("Factorial de %d = %d \n", num, fresul);
        
        int num2 = 5;
        System.out.printf("Sumatoria de %d = %d \n", num2, MatematicasRec.sumatoria(num2));
        
        Random random = new Random();
        int num3 = random.nextInt(9000)+1000;
        System.out.println("Numero a Invertir: " + num3);
        System.out.println("Utilizando recursividad y enteros:");
        MatematicasRec.invertirNumero(num3);
        System.out.println("\nUtilizando String y arreglo de char:");
        MatematicasRec.invertirNumero(Integer.toString(num3));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNumero: ");
        
        int n = 0;
        try{
            n = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error, entrada no valida, se usara 6");
            n = 6;
        }
        
        System.out.println("Serie de fibonacci en la posicion " + n + " = " + MatematicasRec.serieFibonacci(n));
        
        int combinaciones = MatematicasRec.combinaciones(3, 2);
        System.out.println("El numero de combinaciones de {"+5+","+2+"} = "+ combinaciones);
        
        System.out.println("Ingrese el numero de discos: ");
        try{
            n = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error, entrada no valida, se usara 3");
            n = 3;
        }
        
        MatematicasRec.hanoi(n, 1, 2, 3);
        
    }
    
}
