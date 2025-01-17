/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadapoo_1;

/**
 *
 * @author Guest
 */
public class ListaEnlazada {
    private int dato;
    ListaEnlazada sig;
    
    public ListaEnlazada(int d){
        dato = d;
        sig = null;
    }

    public void insertaSigNodo(ListaEnlazada nodo){
        if(sig == null){
            sig = nodo;
            nodo.sig = null;
        }
        else{
            nodo.sig = sig;
            sig = nodo;
        }
    }

    public void muestra(){
        ListaEnlazada nodoAux;
        nodoAux = this;
        while(nodoAux != null){
            System.out.println("Dir. Nodo : " + nodoAux +" Dato : "+ nodoAux.dato +" Dir. Sig : " + nodoAux.sig);
            nodoAux = nodoAux.sig;
        }
        System.out.println("");
    }
}

