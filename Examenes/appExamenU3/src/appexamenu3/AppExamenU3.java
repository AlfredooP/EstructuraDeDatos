/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appexamenu3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AppExamenU3 {

    public static char[] quitarEspacios(String cadena){
        char aux[] = cadena.toCharArray();
        StringBuilder c = new StringBuilder("");
        for(int i = 0; i < aux.length; i++){
            if(aux[i] != ' ')
                c.append(aux[i]);
        }
        return c.toString().toCharArray();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra: ");
        String palabra = scanner.nextLine();
        char [] arreglo = quitarEspacios(palabra);
        char [] arrAux = new char[arreglo.length];
        Pila pila = new Pila(arreglo.length);
        Cola cola = new Cola(arreglo.length);
        for(int i = 0; i < arreglo.length; i++)
            pila.push(arreglo[i]);
        for(int i = 0; i < arreglo.length; i++)
            arrAux[i] = pila.pop();
        for(int i = 0; i < arreglo.length; i++)
            cola.agregar(arreglo[i]);
        for(int i = 0; i < arreglo.length; i++)
            arreglo[i] = cola.extraer();
        String invertida = String.copyValueOf(arrAux);
        palabra = String.copyValueOf(arreglo);
        
        if(palabra.equals(invertida))
            System.out.println("La palabra es un palindromo");
        else
            System.out.println("La palabra no es un palindromo");
        
    }
    
}
