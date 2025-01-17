/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjoptionpanetablamultiplicar;

/**
 *
 * @author Guest
 */
        
//T = template = plantilla
public class VectorT<T> {
    //public class VectorT {
 
    Object [] vec;
    
    public Vector(){
        vec = new int[5];
    }
    
    public Vector(int n){
        vec = new int[n];
    }
    
    public Vector(Vector v){
        vec = new int [v.tam()];
        for(int i = 0; i < vec.length; i++)
            vec[i] = v.leer(i);
    }
    
    public int tam(){
        return vec.length;
    }
    
    public int leer(int pos){
        if(pos >= 0 && pos <vec.length)
            return vec[pos];
        return -1;
    }
    
    public void asignar(int pos, int val){
        if(pos >= 0 && pos < vec.length)
            vec[pos] = val;
    }
    
    public int[] getVec(){
        return vec;
    }
    
    public void setVec(int[] vec){
        this.vec = vec;
    }
    
    public int mayor(){
        int Mayor = this.vec[0];
        for(int i = 0; i < vec.length; i++)
            if(vec[i] > Mayor)
                Mayor = vec[i];
        return Mayor;
    }
    
    public int menor(){
        int Menor = vec[0];
        for(int indice = 0; indice < vec.length; indice++)
            if(vec[indice] < Menor)
                Menor = vec[indice];
        return Menor;
    }
    
    public void invertir(Vector v){
        //Se trabaja con el vector que invoco el metodo
        //Es el objeto que tiene el this
        Vector vecAux = new Vector(this);
        int len = vecAux.tam();
        for(int izq = 0, der = tam()-1; izq < len; izq++, der--)
            vecAux.asignar(der, this.leer(izq));
        //Copiar los valores de vecAux en el vector que invoco
        for(int i = 0; i < this.tam(); i++)
            this.vec[i]= vecAux.leer(i);
    }

}
}
