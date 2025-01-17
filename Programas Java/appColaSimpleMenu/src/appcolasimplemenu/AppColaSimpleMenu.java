/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimplemenu;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppColaSimpleMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean bandera = true;
        int opc;
        Numero numero = new Numero();
        
        System.out.print("TAMAÑO DE LA COLA: ");
        int n = scan.nextInt();
        Cola cola = new Cola(n);
        while(bandera){
            System.out.println("\n\u001B[35mMENU");
            System.out.println("1) Insertar");
            System.out.println("2) Eliminar");
            System.out.println("3) Mostrar");
            System.out.println("4) Salir");
            System.out.print("\nTu opcion : ");
            opc = scan.nextInt();
            
            switch(opc){
                case 1:
                    System.out.print("\nDato a insertar: ");
                    int dato = scan.nextInt();
                    cola.agregar(dato);
                    System.out.println("\n\u001B[32mDato insertado: "+dato);
                    cola.mostrar();
                    break;
                case 2:
                    cola.extraer(numero);
                    cola.mostrar();
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    bandera = false;
                    break;
            }
        }
    }
}