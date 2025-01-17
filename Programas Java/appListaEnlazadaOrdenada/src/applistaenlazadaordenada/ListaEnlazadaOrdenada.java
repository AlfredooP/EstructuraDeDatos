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
public class ListaEnlazadaOrdenada {
    Nodo primero;
    Nodo actual;
    
    public ListaEnlazadaOrdenada(){
        //primero = null;
    }
    
    public void insertarNodo(int dato){
        Nodo anterior;
        if(listaVacia() || primero.valor > dato){
            primero = new Nodo(dato, primero);
        }
        else{
            anterior = primero;
            while(anterior.sig != null && anterior.sig.valor <= dato){
                anterior = anterior.sig;
            }
            anterior.sig = new Nodo(dato, anterior.sig);
            
        }
    }
    
    public boolean listaVacia(){
        if(primero == null)
            return true;
        return false;
    }
    
    public void mostrar(){
        Nodo aux;
        aux = this.primero;
        while(aux != null){
            System.out.print(aux.valor + "->");
            aux = aux.sig;
        }
        System.out.println(" null ");
        System.out.println();
    }
    
    public void borrar(int valor){
        Nodo anterior, nodoAux;
        nodoAux = primero;
        anterior = null;
        //SE TIENE UNA LISTA ORDENADA
        while(nodoAux != null && nodoAux.valor < valor){
            anterior = nodoAux;
            nodoAux = nodoAux.sig;
        }
        if(nodoAux == null || nodoAux.valor != valor)
            return;
        else{
            if(anterior == null)
                primero = nodoAux.sig;
            else
                anterior.sig = nodoAux.sig;
        }
    }
}

//PREGUNTA 1 EXAMEN U3

