/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppila;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Pila pila1 = new Pila(5);
        int opc = 0;
        
        do{
            System.out.println("PRESIONE 1 PARA INTRODUCIR DATOS A LA PILA (PUSH)");
            System.out.println("PRESIONE 2 PARA EXTRAER DATOS DE LA PILA (POP)");
            System.out.println("PRESIONE 3 PARA SALIR");

            try{
                opc = scanner.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("INTRODUCIENDO DATOS EN LA PILA...");
                        while(!pila1.estaLlena()){
                            int dato = random.nextInt(90)+10;
                            System.out.println("Dato Insertado: " + dato);
                            pila1.push(dato);
                        }
                        break;
                    case 2: 
                        System.out.println("EXTRAYENDO DATOS DE LA PILA...");
                        Entero dato = new Entero();
                        for(; !pila1.estaVacia();){
                            //int dato = pila1.pop();
                            //System.out.println("Dato eliminado: " + pila1.pop());
                            dato.num = 0;
                            pila1.pop(dato);
                            System.out.println("Dato eliminado: " + dato.num);
                        }
                        break;
                    case 3:
                        System.out.println("SALIENDO...");
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA, INTENTE DE NUEVO");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error, entrada no valida");
                opc = 3;
            }
        }while(opc != 3);
        
        
        
        
        
        
    }
    
    
    
    //PREGUNTA 1 DE LA EVALUACION U2 RECURSIVIDAD
    
    //TAREA PARA EL DOMINGO 22 
    //APP.PILA CON MENU CONSOLA
    //UTILIZAR COMO BASE EL EJEMPLO DE LOS APUNTES
    
    //APP.GUI (VERSION PREVIA O PRIMER INTENTO) UTILIZAR COMOBASE EL EJEMPLO DE LOS
    //APUNTES HOJA 38 / PAG 8
    
    
}
