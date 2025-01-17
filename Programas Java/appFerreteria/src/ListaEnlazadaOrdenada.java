
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
    public void insertarNodo(int cve, String producto, double p){
        Nodo anterior;
        if(listaVacia() || primero.clave > cve){
            primero = new Nodo(cve, producto, p, primero);
        }
        else{
            anterior = primero;
            while(anterior.sig != null && anterior.sig.clave <= cve){
                anterior = anterior.sig;
            }
            anterior.sig = new Nodo(cve, producto, p, anterior.sig);
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
            System.out.print(aux.clave + "|" + aux.producto + "|" + aux.precio + "->");
            aux = aux.sig;
        }
        System.out.println(" null ");
        System.out.println();
    }
    //GUI
    public void Mostrar(DefaultTableModel tabla){
        Nodo aux;
        aux = this.primero;
        while(aux != null){
            tabla.insertRow(tabla.getRowCount(), new Object[]{aux.clave, aux.producto, aux.precio});
            aux = aux.sig;
        }
    }
    
    //MODIFICAR LO NECESARIO PARA EL DOMINGO
    public void borrar(int cve){
        Nodo anterior, nodoAux;
        nodoAux = primero;
        anterior = null;
        //SE TIENE UNA LISTA ORDENADA
        while(nodoAux != null && nodoAux.clave < cve){
            anterior = nodoAux;
            nodoAux = nodoAux.sig;
        }
        if(nodoAux == null || nodoAux.clave != cve)
            JOptionPane.showMessageDialog(null, "Clave no encontrada");
        else{
            if(anterior == null)
                primero = nodoAux.sig;
            else
                anterior.sig = nodoAux.sig;
        }
    }
}

//PREGUNTA 1 EXAMEN U3

