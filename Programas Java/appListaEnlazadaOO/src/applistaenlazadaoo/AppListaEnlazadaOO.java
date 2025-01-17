/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applistaenlazadaoo;

import java.util.Random;

/**
 *
 * @author alfre
 */
public class AppListaEnlazadaOO {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Random numero = new Random();
        
        String [] nombres = {"Martillo 1", "Martillo 2", "Desarmador 1", "Desarmador 2", "Taladro", "Clavo 1", "Clavo 2", "Tornillo 1", "Tornillo 2", "Pala 1", "Pala 2"};
        Nodo_Lista primero = new Nodo_Lista(numero.nextInt(90)+10, numero.nextDouble()*100, nombres[numero.nextInt(nombres.length)]);
        Nodo_Lista nodo = primero;
        
        for(int i = 0; i < 5; i++){
            Nodo_Lista nuevo = new Nodo_Lista(numero.nextInt(90)+10, numero.nextDouble()*100, nombres[numero.nextInt(nombres.length)]);
            nodo.inserta_s(nuevo);
            nodo = nuevo;
        }
        
        primero.muestra();
        nodo.muestra();
        
    }
    
}
