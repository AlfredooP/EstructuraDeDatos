/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmatematicas;

import java.util.Scanner;

/**
 *
 * @author Guest
 */
public class AppMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Ascii
//        System.out.println("\033[36m Tec");
//        Unicode
//        System.out.println("\u001B[33m Laguna");
        
//        int a = 2004;
//        if(Matematicas.esBisiesto(a))
//            System.out.println(a + " es bisiesto");
//        else
//            System.out.println(a + " no es bisiesto");
        
        //Matematicas.esBisiesto2(a) ? System.out.println(a+ " es bisiesto") : System.out.println(a+ " no es bisiesto");

//        if(Matematicas.esBisiesto2(a))
//            System.out.println(a + " es bisiesto");
//        else
//            System.out.println(a + " no es bisiesto");
//        
//        if(Matematicas.esBisiesto3(a))
//            System.out.println(a + " es bisiesto");
//        else
//            System.out.println(a + " no es bisiesto");
        
        Scanner teclado = new Scanner(System.in);
        char opc;
        boolean bandera = true;
        int n;
        double num;
        
        while(bandera){
            opc = Menu.Opciones();
            switch(opc){
                case '1':
                    //Validar entrada
                    System.out.print("\nNUMERO: ");
                    try{
                        n = Integer.parseInt(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 5");
                        n = 5;
                    }
                    
                    //Validar numero entre 0 y 12
                    if(n >= 0 && n <= 12){
                        System.out.println("\u001B[32mFactorial de: " + n + " = " + Matematicas.Factorial(n));
                    }
                    else{
                        System.out.println("\u001B[31mENTRADA NO VALIDA");
                    }
                    
                    break;
                    
                case '2':
                    //Validar entrada
                    System.out.print("\nNUMERO: ");
                    try{
                        num = Double.parseDouble(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 13");
                        num = 13;
                    }
                    
                    //Validar numero mayor de 12
                    if(num >= 0 && num > 12){
                        System.out.println("\u001B[32mFactorial de: " + num + " = " + Matematicas.Factorial(num));
                    }
                    else{
                        System.out.println("\u001B[31mENTRADA NO VALIDA");
                    }
                    break;
                    
                case '3':
                    //Validar entrada
                    System.out.print("\nNUMERO: ");
                    try{
                        n = Integer.parseInt(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 43");
                        n = 43;
                    }
                    if(Matematicas.esPrimo1(n) == true)
                        System.out.println("\n\u001B[32mEl número " + n + " es primo.");
                    else
                        System.out.println("\n\u001B[31mEl número " + n + " no es primo.");
                    break;
                    
                case 52: //52 es el número 4 en ascii
                    //Validar entrada
                    System.out.print("\nNUMERO: ");
                    try{
                        num = Double.parseDouble(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 1");
                        num = 1;
                    }
                    NumeroEntero numero = new NumeroEntero();
                    System.out.println("\u001B[32mResultado: " + Matematicas.serieE(num, numero));
                    
                    break;
                    
                case 53: //53 es el número 5 en ascii
                     //Validar entrada
                    System.out.print("\nAÑO: ");
                    try{
                        n = Integer.parseInt(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 2023");
                        n = 2023;
                    }
                    if(Matematicas.esBisiesto(n) == true)
                        System.out.println("\n\u001B[32mEl año " + n + " es bisiesto.");
                    else
                        System.out.println("\n\u001B[31mEl año " + n + " no es bisiesto.");
                    break;
                    
                case 54: //54 es el número 6 en ascii
                    //Validar entrada
                    System.out.print("\nNUMERO A OPERAR: ");
                    try{
                        num = Double.parseDouble(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 3");
                        num = 3;
                    }
                    System.out.print("\nVECES A REPETIR: ");
                    try{
                        n = Integer.parseInt(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 3");
                        n = 3;
                    }
                    System.out.println("\n\u001B[32mResultado: " + Matematicas.serieT(n, num));
                    break;
                case 55: //55 es el número 7 en ascii
                    //Validar entrada
                    System.out.print("\nNUMERO: ");
                    try{
                        n = Integer.parseInt(teclado.next());
                    }
                    catch(NumberFormatException e){
                        System.out.println("\u001B[31mERROR, ENTRADA NO VALIDA");
                        System.out.println("Mensaje del compilador: "+ e.getMessage());
                        System.out.println("Se usara como valor por default: 10000");
                        n = 10000;
                    }
                    System.out.println("\u001B[32mResultado: " + Matematicas.seriePi(n));
                    break;
                case 56: //%6 es el numero 8 en ascii
                    bandera = false;
                    break;
                default:
                    System.out.println("\n\u001B[31mOpción inválida, intente de nuevo");
                    break;
            }
        }
        
    }
    
}
