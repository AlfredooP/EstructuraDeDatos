/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appstring1;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppString1 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
//        String cadena1 = "hola";
//        
//        //cadena1.charAt(1) = 'o';
//        //LOS OBJETOS STRING SON INMUTABLES, ES DECIR, NO SE PUEDEN MODIFICAR CARACTER POR CARACTER
//        
//        System.out.println("Cadena 1: "+cadena1);
//        
//        for(int i = 0; i < cadena1.length(); i++){
//            System.out.println(cadena1.charAt(i));
//        }
//        
//        char [] cadChar = cadena1.toCharArray();
//        System.out.println("Cadena de Char = "+cadChar);
//        //ESCRIBIO UNA REPRESENTACION NO LEGIBLE DEL ARREGLO DE CARACTERES
//        for(int i = 0; i < cadChar.length; i++){
//            System.out.print(cadChar[i]);
//        }
//        System.out.println("");
//        
//        char [] cadChar2 = {'H', 'O', 'L', 'A'};
//        System.out.println("Arreglo de Char = "+String.copyValueOf(cadChar2));
//        
//        String cadena3 = "Arreglo de Char = ".concat(String.copyValueOf(cadChar2));
//        System.out.println(cadena3);
//        
//        for(int i =0; i < cadChar2.length; i++){
//            //cadChar2 [i] = Character.toLowerCase(cadChar2[i]);
//            cadChar2 [i] = Caracter.aMinuscula(cadChar2[i]);
//        }
//        System.out.println("Cadena en minusculas = "+String.copyValueOf(cadChar2));
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("TECLEA UNA CADENA: ");
        String texto = scanner.nextLine(); 
        // String texto = scanner.next(); lee la cadena hasta el primer espacio en blanco
        
        char [] textoCh = texto.toCharArray();
        
        for(int i = 0; i < textoCh.length; i++){
            if(Caracter.esMayuscula(textoCh[i]))
                textoCh[i] = Caracter.aMinuscula(textoCh[i]);
            
            System.out.println(textoCh[i]);
        }
        
        System.out.println("");
        System.out.println("CADENA DE SALIDA: " + String.copyValueOf(textoCh));
        
    }   
    
}

