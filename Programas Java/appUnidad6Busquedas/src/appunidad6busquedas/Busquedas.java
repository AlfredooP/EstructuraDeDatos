/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appunidad6busquedas;

/**
 *
 * @author Guest
 */
public class Busquedas {
    
    public static boolean busquedaDesord(int [] vec, int x){
        for(int i = 0; i < vec.length; i++){
            if(vec[i] == x){
                System.out.println("Dato encontrado en la posicion " + (i+1));
                return true;
            }
        }
        return false;
    }
    
    public static boolean busquedaOrd(int [] vec, int x){
        for(int i = 0; i < vec.length; i++){
            if(vec[i] == x){
                System.out.println("Dato encontrado en la posicion " + (i+1));
                return true;
            }
            if(vec[i] > x)
                return false;
        }
        return false;
    }
    
    public static void binaria(int [] vec, int x, Numero pos){
        pos.num = -1;
        int li = 0;
        int ls = vec.length -1;
        int i;
        while((li <= ls) && pos.num == -1){
            i = (li + ls)/2;
            if(vec[i] == x)
                pos.num = i;
                else if(vec[i] < x)
                    li = i+1;
                else
                    ls = i-1;
            
        }
    }
    
}
