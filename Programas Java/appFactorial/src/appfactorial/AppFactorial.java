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
public class AppFactorial {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // TODO code application logic here
//        int n = 12;
        
//        AppFactorial numero = new AppFactorial();
//        int resultFact = numero.factorial(n);
//        System.out.println("Factorial de " + n + " = " + resultFact);
        
//        Matematicas numero = new Matematicas();
//        System.out.println("Factorial de " + n + " = " + Factorial(n));

        //boolean resul = Matematicas.esPrimo1(7);
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion, n;
        do
        {
            System.out.println("\n1- Factorial");
            System.out.println("2- Primos");
            System.out.println("3- Salir");
            System.out.println("");
            System.out.print("Seleccione opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el numero: ");
                    n = scanner.nextInt();
                    
                    System.out.println("El factorial de " + n + " es " + Matematicas.Factorial(n));
                    break;
                case 2:
                    System.out.print("Rango inferior: ");
                    int rI = scanner.nextInt();
                    System.out.print("Rango superior: ");
                    int rS = scanner.nextInt();
                    Matematicas.primoEntreNumeros(rI, rS);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                        
            }
            
        }while(opcion != 3);
    }
    
}
