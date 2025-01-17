/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadapoo_1;

import java.util.Random;

/**
 *
 * @author Guest
 */
public class AppListaEnlazadaPOO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Puentes Vargas Alfredo - 22130803");
        Random random = new Random();
        ListaEnlazada primero = new ListaEnlazada(random.nextInt(90)+10);
        ListaEnlazada nodo = primero;
        for(int i = 0; i< 5; i++){
            ListaEnlazada nodoAux = new ListaEnlazada(random.nextInt(90)+10);
            nodo.insertaSigNodo(nodoAux);
            nodo = nodoAux;
        }
        primero.muestra();
        nodo.muestra();
    }
    
}
