/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparbolbinariodebusqueda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppArbolBinarioDeBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int valor = 1;
        
        while(valor != 0){
            System.out.println("Inserte un valor en el árbol, para terminar inserte 0");
            valor = scanner.nextInt();

            if(valor != 0){
                arbol.insertar(valor);
                System.out.println("Valor insertado");
            }
        }
        
        System.out.println("\nRECORRIDOS:");
        System.out.println("1) Inorden");
        System.out.println("2) Preorden");
        System.out.println("3) Postorden");
        System.out.println("4) Todos los recorridos");
        System.out.println("5) Buscar Mayor y Menor");
        System.out.println("SELECCIONE EL RECORRIDO A REALIZAR:");
        int opc = scanner.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("\nRecorrido inorden:");
                arbol.recorridoInorden();
                break;
            case 2:
                System.out.println("\nRecorrido preorden:");
                arbol.recorridoPreorden();
                break;
            case 3:
                System.out.println("\nRecorrido postorden:");
                arbol.recorrridoPostorden();
                break;
            case 4:
                System.out.println("\nRecorrido inorden:");
                arbol.recorridoInorden();
                System.out.println("\nRecorrido preorden:");
                arbol.recorridoPreorden();
                System.out.println("\nRecorrido postorden:");
                arbol.recorrridoPostorden();
                break;
            case 5:
                System.out.println("Menor = "+ arbol.buscarMenor());
                System.out.println("Mayor = "+ arbol.buscarMayor());
                break;
            default:
                System.out.println("Opción no válida, saliendo...");
                break;
        }
        
    }
    
}
