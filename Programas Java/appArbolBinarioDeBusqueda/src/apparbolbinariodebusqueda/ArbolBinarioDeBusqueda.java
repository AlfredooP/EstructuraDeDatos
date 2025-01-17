/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparbolbinariodebusqueda;

/**
 *
 * @author Guest
 */
public class ArbolBinarioDeBusqueda {
    
    private class nodoArbol{
        
        private ArbolBinarioDeBusqueda der;
        private ArbolBinarioDeBusqueda izq;
        int dato;
        
        private void nodoArbol(){
            der = null;
            izq = null;
            dato = 0;
        }
    }//Fin nodo arbol
    
    nodoArbol raiz;
    
    public void ArbolBinarioDeBusqueda(){
        raiz = new nodoArbol();
    }
    
    public boolean estaVacio(){
        return raiz == null;
    }
    
    public void insertar(int valor){
        if(estaVacio()){
            nodoArbol nuevo = new nodoArbol();
            nuevo.dato = valor;
            nuevo.der = new ArbolBinarioDeBusqueda();
            nuevo.izq = new ArbolBinarioDeBusqueda();
            raiz = nuevo;
        }
        else{
            if(valor < raiz.dato)
                (raiz.izq).insertar(valor);
            if(valor > raiz.dato)
                (raiz.der).insertar(valor);
        }
    }
    
    
    public void recorridoInorden(){
        if(!estaVacio()){
            raiz.izq.recorridoInorden();
            System.out.print(raiz.dato + ", ");
            raiz.der.recorridoInorden();
        }
    }
    
    public void recorridoPreorden(){
        if(!estaVacio()){
            System.out.print(raiz.dato + ", ");
            raiz.izq.recorridoPreorden();
            raiz.der.recorridoPreorden();
        }
    }
    
    public void recorrridoPostorden(){
        if(!estaVacio()){
            raiz.izq.recorrridoPostorden();
            raiz.der.recorrridoPostorden();
            System.out.print(raiz.dato + ", ");
        }
    }
    
    public int buscarMenor(){
        ArbolBinarioDeBusqueda aBB = this;
        while(!aBB.raiz.izq.estaVacio()){
            aBB = aBB.raiz.izq;
        }
        int menor = aBB.raiz.dato;
        return menor;
    }
    
    public int buscarMayor(){
        ArbolBinarioDeBusqueda aBB = this;
        while(!aBB.raiz.der.estaVacio()){
            aBB = aBB.raiz.der;
        }
        int mayor = aBB.raiz.dato;
        return mayor;
    }
    
    
//    public boolean buscarDato(int x){
//        ArbolBinarioDeBusqueda aBB = this;
//        if(aBB.raiz.dato == x)
//            return true;
//            else if(aBB.raiz.izq.raiz.dato == x)
//           
//        
//    }
}
