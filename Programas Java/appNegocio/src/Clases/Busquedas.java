/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Guest
 */
public class Busquedas {
        
    private static char[] quitarEspacios(String cadena){
        char aux[] = cadena.toCharArray();
        StringBuilder c = new StringBuilder("");
        for(int i = 0; i < aux.length; i++){
            if(aux[i] != ' ')
                c.append(aux[i]);
        }
        return c.toString().toCharArray();
    }
    
    private static boolean esMenor(char [] comparar, char [] nombre){
        if(comparar[0] < nombre[0])
            return true;
        else{
            for(int i = 0; i < comparar.length; i++){
                if(esMenor(comparar,nombre));
            }
            return false;
        }
    }
    
    public static int binariaCodigo(Producto [] vec, int codigo){
        int pos = -1;
        int li = 0;
        int ls = vec.length -1;
        int i;
        while((li <= ls) && pos == -1){
            i = (li + ls)/2;
            if(vec[i].codigo == codigo)
                pos = i;
                else if(vec[i].codigo < codigo)
                    li = i+1;
                else
                    ls = i-1;
        }
        return pos;
    }
    
    public static int binariaNombre(Producto [] vec, String nombre){
        char[] arrNombre = quitarEspacios(nombre);
        int pos = -1;
        int li = 0;
        int ls = vec.length -1;
        int i;
        while((li <= ls) && pos == -1){
            i = (li + ls)/2;
            char[] arrComparar = quitarEspacios(vec[i].nombre);
            if(vec[i].nombre.equals(nombre))
                pos = i;
            else if(arrComparar[i] < arrNombre[i])
                li = i+1;
            else
                ls = i-1;
            }
        return pos;
    }
}
