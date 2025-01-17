/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexamenu3;

/**
 *
 * @author Guest
 */
public class Pila {
    
    private char[] pila;
    private int tope;
    private boolean vacia;
    private boolean llena;
    
    public Pila(int n){
        pila = new char[n];
        tope = 0;
        vacia = true;
        llena = false;
    }
    
    public void push(char c){
        vacia = false;
        pila[tope++] = c;
        if(tope == pila.length)
            llena = true;
    }
    
    public char pop(){
        if(--tope == 0)
            vacia = true;
        llena = false;
        return pila[tope];
    }
    
    public boolean estaVacia(){
        return vacia;
    }
    
    public boolean estaLlena(){
        return llena;
    }
    
}
