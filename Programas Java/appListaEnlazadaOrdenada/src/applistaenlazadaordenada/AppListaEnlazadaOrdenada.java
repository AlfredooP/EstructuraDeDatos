/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadaordenada;

/**
 *
 * @author Guest
 */
public class AppListaEnlazadaOrdenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaEnlazadaOrdenada lista = new ListaEnlazadaOrdenada();
        
        lista.insertarNodo(10);
        lista.insertarNodo(12);
        lista.insertarNodo(1);
        lista.insertarNodo(5);
        lista.insertarNodo(3);
        lista.mostrar();
        
        lista.borrar(15);
        lista.borrar(5);
        lista.borrar(12);
    }
    
}
