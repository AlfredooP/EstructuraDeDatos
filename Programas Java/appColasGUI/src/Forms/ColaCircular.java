/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Guest
 */
public class ColaCircular {
    int [] cola;
    int tam;
    int p,u;
    
    public ColaCircular(int n){
        tam = n;
        cola = new int[tam];
        p = u = -1;
    }
    
    public boolean insertar(int dato){
        if((u == tam) && (p == 0) || (u+1 == p)){
            System.out.println("\n\u001B[31mOVERFLOW");
            return false;
        }
        else if(u == tam-1)
            u = 0;
        else
            u++;
        cola[u] = dato;
        if(p == -1)
            p = 0;
        return true;
    }
    
    public boolean eliminar(Numero dato){
        if(p == -1){
            System.out.println("\n\u001B[31mUNDERFLOW");
            return false;
        }
        dato.num = cola[p];
        if(p == u){
            cola[p] = -1;
            p = u = -1;
        }
        else if(p == tam-1){//vec.length
            cola[p] = -1;
            p = 0;
        }
        else{
            cola[p] = -1;
            p++;
        }
        return true;
    }
    
    public boolean estaVacia(){
        return p == -1;
    }
    
    public boolean estaLlena(){
        int resul = (u+1)%tam;
        return resul == p;
    }
    
    public void mostrar(){
        System.out.println("DATOS EN LA COLA CIRCULAR:");
        for(int i = 0; i < cola.length; i++){
            System.out.println("Cola ["+(i+1)+"] = "+cola[i]);
        }
    }
}
