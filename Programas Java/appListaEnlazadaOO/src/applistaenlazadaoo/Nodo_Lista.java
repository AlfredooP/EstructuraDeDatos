/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applistaenlazadaoo;

/**
 *
 * @author alfre
 */
public class Nodo_Lista {
    
    private int id;
    private double precio;
    private String producto;
    
    Nodo_Lista sig;
    
    public Nodo_Lista(int d, double dd, String nom){
        id = d;
        precio = dd;
        producto = nom;
        sig = null;
    }
    
    public void inserta_s(Nodo_Lista nodo){
        if(this.sig == null){
            sig = nodo;
        }
        nodo.sig = null;
    }
    
    public void muestra(){
        Nodo_Lista plista;
        plista = this;
        while (plista != null){
            System.out.println("ID: "+plista.id+" | Precio: "+plista.precio+" | Producto: "+plista.producto+" ->");
            plista = plista.sig;
        }
        System.out.print("null");
        System.out.println();
        
    }
    
}
