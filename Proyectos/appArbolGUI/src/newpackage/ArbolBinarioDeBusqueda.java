/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guest
 */
public class ArbolBinarioDeBusqueda {
    
    private class nodoArbol{
        
        private ArbolBinarioDeBusqueda der;
        private ArbolBinarioDeBusqueda izq;
        int clave;
        int cantidad;
        String nombre;
        String descripcion;
        double precio;
        
        private void nodoArbol(){
            der = null;
            izq = null;
            clave = 0;
            cantidad = 0;
            nombre = "";
            descripcion = "";
            precio = 0;
        }
    }//Fin nodo arbol
    
    nodoArbol raiz;
    
    public void ArbolBinarioDeBusqueda(){
        raiz = new nodoArbol();
    }
    
    public boolean estaVacio(){
        return raiz == null;
    }
    
    public void insertar(Producto p){
        if(estaVacio()){
            nodoArbol nuevo = new nodoArbol();
            nuevo.clave = p.clave;
            nuevo.cantidad = p.cantidad;
            nuevo.nombre = p.nombre;
            nuevo.descripcion = p.descripcion;
            nuevo.precio = p.precio;
            nuevo.der = new ArbolBinarioDeBusqueda();
            nuevo.izq = new ArbolBinarioDeBusqueda();
            raiz = nuevo;
        }
        else{
            if(p.clave < raiz.clave)
                (raiz.izq).insertar(p);
            if(p.clave > raiz.clave)
                (raiz.der).insertar(p);
        }
    }
    
    public void recorridoInorden(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if(!estaVacio()){
            raiz.izq.recorridoInorden(tabla);
            modelo.setColumnCount(modelo.getColumnCount()+1);
            tabla.setValueAt(raiz.clave, 0, modelo.getColumnCount()-1);
            raiz.der.recorridoInorden(tabla);
        }
    }
    
    public void recorridoPreorden(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if(!estaVacio()){
            modelo.setColumnCount(modelo.getColumnCount()+1);
            tabla.setValueAt(raiz.clave, 0, modelo.getColumnCount()-1);
            raiz.izq.recorridoPreorden(tabla);
            raiz.der.recorridoPreorden(tabla);
        }
    }
    
    public void recorridoPostorden(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if(!estaVacio()){
            raiz.izq.recorridoPostorden(tabla);
            raiz.der.recorridoPostorden(tabla);
            modelo.setColumnCount(modelo.getColumnCount()+1);
            tabla.setValueAt(raiz.clave, 0, modelo.getColumnCount()-1);
        }
    }
    
    public int buscarMenor(){
        ArbolBinarioDeBusqueda aBB = this;
        while(!aBB.raiz.izq.estaVacio()){
            aBB = aBB.raiz.izq;
        }
        int menor = aBB.raiz.clave;
        return menor;
    }
    
    public int buscarMayor(){
        ArbolBinarioDeBusqueda aBB = this;
        while(!aBB.raiz.der.estaVacio()){
            aBB = aBB.raiz.der;
        }
        int mayor = aBB.raiz.clave;
        return mayor;
    }
    
    public boolean buscarProducto(int clave){
        nodoArbol aBB = raiz;
        while(aBB != null){
            if(clave == aBB.clave)
                return true;
            else{
                if(clave < aBB.clave)
                    aBB = aBB.izq.raiz;
                else
                    aBB = aBB.der.raiz;
            }
        }
        return false;
    }
    
//    public boolean buscarDato(int x){
//        ArbolBinarioDeBusqueda aBB = this;
//        if(aBB.raiz.c == x)
//            return true;
//        else if(!aBB.raiz.izq.estaVacio() && aBB.raiz.dato > x){
//            aBB = aBB.raiz.izq;
//            aBB.buscarDato(x);
//        }
//        else if(!aBB.raiz.der.estaVacio() && aBB.raiz.dato < x){
//            aBB = aBB.raiz.der;
//            aBB.buscarDato(x);
//        }
//        return false;
//    }
    
}
