/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolacircular;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean bandera = true;
        int opc;
        Numero numero = new Numero();
        
        System.out.print("TAMAÑO DE LA COLA: ");
        int n = scan.nextInt();
        ColaCircular cola = new ColaCircular(n);
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
                    cola.insertar(dato);
                    System.out.println("\n\u001B[32mDato insertado: "+dato);
                    cola.mostrar();
                    break;
                case 2:
                    cola.eliminar(numero);
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
