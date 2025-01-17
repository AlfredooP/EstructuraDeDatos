/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Guest
 */
public class Nodo {
    public int clave;
    public String producto;
    public double precio;
    public Nodo sig;
    
    public Nodo(int cve, String producto, double precio, Nodo nodo){
        clave = cve;
        this.producto = producto;
        this.precio = precio;
        sig = nodo;
    }
}
