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
public class Nodo {
    public int valor;
    public Nodo sig;
    
    public Nodo(int v, Nodo nodo){
        valor = v;
        sig = nodo;
    }
}
