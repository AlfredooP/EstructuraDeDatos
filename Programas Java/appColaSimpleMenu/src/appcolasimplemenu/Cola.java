/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimplemenu;

/**
 *
 * @author Guest
 */
public class Cola {
    int [] vec;
    int p, u;
    
    public Cola(int n){
        p = u = -1;
        vec = new int[n];
    }
    
    public boolean estaLlena(){
        if(u >= vec.length -1)
            return true;
        return false;
    }
    
    public boolean estaVacia(){
        if(p == -1)
            return true;
        return false;
    }
    
    public boolean agregar(int dato){
        if(!estaLlena()){
            vec[++u] = dato;
            if(u == 0)
                p = 0;
            return true;
        }
        else
            System.out.println("\n\u001B[31mOVERFLOW");
        return false;
    }
    
    public boolean extraer(Numero dato){
        if(!estaVacia()){
            dato.num = vec[p];
            vec[p] = -1;
            if(p == u){
                p = -1;
                u = p;
                //p = u = -1;
            }
            else{
                p++;
            }
            return true;
        }
        else
            System.out.println("\n\u001B[31mUNDERFLOW");
        return false;
    }
    
    public void mostrar(){
        System.out.println("\nDATOS EN LA COLA");
        for(int i = 0; i < vec.length; i++)
            System.out.println("\033[34m Dato[" + (i+1) + "] = " + vec[i]);
    }
}
