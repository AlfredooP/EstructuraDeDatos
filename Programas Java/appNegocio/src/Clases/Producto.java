/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Guest
 */
public class Producto {
    int codigo;
    int cantidad;
    String nombre;
    String descripcion;
    double precio;
    
    public Producto(int cod, int cant, String nomb, String desc, double p){
        codigo = cod;
        cantidad = cant;
        nombre = nomb;
        descripcion = desc;
        precio = p;
    }
}
