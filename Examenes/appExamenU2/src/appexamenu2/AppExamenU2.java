/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appexamenu2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AppExamenU2 {

    public static int multiplicacion(int a, int b){
        if(b == 0)
            return 0;
        else
            return a + multiplicacion(a,b-1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EXAMEN U2 RECURSIVIDAD
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1- Multiplicacion");
            System.out.println("2- Salir");
            System.out.print("Seleccione opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un numero");
                    int a = scanner.nextInt();
                    System.out.println("Ingrese el numero a multiplicar");
                    int b = scanner.nextInt();
                    System.out.println("Resultado = " + multiplicacion(a,b));
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 2);
        
    }
    
}
