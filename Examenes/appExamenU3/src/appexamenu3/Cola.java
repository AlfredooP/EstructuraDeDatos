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
public class Cola {
    char [] vec;
    int p, u;
    
    public Cola(int n){
        p = u = -1;
        vec = new char[n];
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
    
    public boolean agregar(char c){
        if(!estaLlena()){
            vec[++u] = c;
            if(u == 0)
                p = 0;
            return true;
        }
        return false;
    }
    
    public char extraer(){
        if(!estaVacia()){
            char c = vec[p];
            if(p == u){
                p = -1;
                u = p;
                //p = u = -1;
            }
            else{
                p++;
            }
            return c;
        }
        return 0;
    }
    
    public void mostrar(){
        System.out.println("DATOS EN LA COLA");
        for(int i = 0; i < vec.length; i++)
            System.out.println("\033[34m Dato[" + i + "] = " + vec[i]);
    }
}
