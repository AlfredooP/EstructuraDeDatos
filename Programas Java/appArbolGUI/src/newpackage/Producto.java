/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Guest
 */
public class Producto {
    int clave;
    int cantidad;
    String nombre;
    String descripcion;
    double precio;
    
    public Producto(int cve, int cant, String nomb, String desc, double p){
        clave = cve;
        cantidad = cant;
        nombre = nomb;
        descripcion = desc;
        precio = p;
    }
}
