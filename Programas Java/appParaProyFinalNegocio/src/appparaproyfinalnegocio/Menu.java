/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appparaproyfinalnegocio;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class Menu {
    
    public static char opciones(){
        //Pasar a GUI
        System.out.println("ARCHIVOS BINARIOS");
        System.out.println("1) Abrir");
        System.out.println("2) Guardar");
        System.out.println("3) Agregar");
        System.out.println("4) Salir");
        System.out.print("Tu opcion: ");
        Scanner scanner = new Scanner(System.in);
        char opc = scanner.next().charAt(0);
        return opc;
    }
    
}
