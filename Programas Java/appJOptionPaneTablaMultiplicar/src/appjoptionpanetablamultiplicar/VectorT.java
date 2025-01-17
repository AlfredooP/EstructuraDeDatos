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
    
    public VectorT(){
        vec = new Object[5];
    }
    
    public VectorT(int n){
        vec = new Object[n];
    }
    
    public VectorT(VectorT v){
        vec = new Object[v.tam()];
        for(int i = 0; i < vec.length; i++)
            vec[i] = v.leer(i);
    }
    
    public int tam(){
        return vec.length;
    }
    
    public T leer(int pos){
        if(pos >= 0 && pos <vec.length)
            return (T)vec[pos];
        Object val = -1;
        return (T)val;
    }
    
    public void asignar(int pos, T val){
        if(pos >= 0 && pos < vec.length)
            vec[pos] = val;
    }
    
    public Object[] getVec(){
        return vec;
    }
    
    public void setVec(Object[] vec){
        this.vec = vec;
    }
    
//    public int mayor(){
//        int Mayor = this.vec[0];
//        for(int i = 0; i < vec.length; i++)
//            if(vec[i] > Mayor)
//                Mayor = vec[i];
//        return Mayor;
//    }
    
//    public int menor(){
//        int Menor = vec[0];
//        for(int indice = 0; indice < vec.length; indice++)
//            if(vec[indice] < Menor)
//                Menor = vec[indice];
//        return Menor;
//    }
    
    public void invertir(VectorT v){
        //Se trabaja con el vector que invoco el metodo
        //Es el objeto que tiene el this
        VectorT vecAux = new VectorT(this);
        int len = vecAux.tam();
        for(int izq = 0, der = tam()-1; izq < len; izq++, der--)
            vecAux.asignar(der, this.leer(izq));
        //Copiar los valores de vecAux en el vector que invoco
        for(int i = 0; i < this.tam(); i++)
            this.vec[i]= vecAux.leer(i);
    }
    
    public float promedio(){
        float prom = 0.0f;
        for(int i = 0; i < vec.length; i++)
            //prom += (float)vec[i];
            prom += Float.parseFloat(vec[i].toString());
        prom /= vec.length;
        return prom;
    }
    
    public T mayor(){
        Object mayor = vec[0];
        for(int i = 1; i < vec.length; i++)
            if(vec[i].hashCode() > mayor.hashCode())
                mayor = vec[i];
        return (T)mayor;
    }
    
    public <T extends Comparable<T> > T menor(){
        T menor = (T)this.vec[0];
        for(int i = 1; i < vec.length; i++)
            if(!(menor.compareTo((T)vec[i]) < 0))
                menor = (T)vec[i];
        return menor;
    }
}
