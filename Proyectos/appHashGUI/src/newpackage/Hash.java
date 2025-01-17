/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Guest
 */
public class Hash {
    
    public static int modulo(int[] vec, int clave, int n){
        //Se recibe la clave para ubicarla en su posicion  dentro del arreglo
        int pos;
        //Determinar si el numero de elementos (n) del arreglo es primo, sino buscar el mas proximo
        //Se podria requerir redimensionar el arreglo en la app
        //Si n es primo trabajamos, sino regresamos y redefinimos
        pos = clave % n;
        for(;;){ //El arreglo debera estar inicializado a ceros, java por definicion inicializa a cero
            if(vec[pos] != 0)
                pos++;
            else
                break;//Termnina el ciclo inmediato
            if(pos >= n)//vec.length = n
                pos = 0;
        }//Fin for
        return pos;
    }
    
    public static int plegamiento(int[] vec, String clave, int n){
        int pos = 0;
        char [] arrClave = clave.toCharArray();
        for(int i = 0; i < arrClave.length; i++){
            pos += arrClave[i];
        }
        pos %= n;
        for(;;){
            if(vec[pos] != 0)
                pos++;
            else
                break;
            if(pos >= n)
                pos = 0;
        }
        return pos;
        
    }
    
    public static int buscarModulo(int[] vec, int clave, int n){
        int pos, band = 0;
        pos = clave % n;
        for(;;){
            if(vec[pos] != clave)
                pos++;
            else //No lo encontro
                break;
            band++;
            if(band < n)
                return -1;
        }
        return pos;
    }
    
    public static int buscarPlegamiento(int[] vec, String clave, int n){
        int pos = 0, band = 0;
        char [] arrClave = clave.toCharArray();
        for(int i = 0; i < arrClave.length; i++){
            pos += arrClave[i];
        }
        pos %= n;
        for(;;){
            if(vec[pos] != Integer.parseInt(clave))
                pos++;
            else
                break;
            band++;
            if(pos >= n)
                pos = 0;
            if(band > n)
                return -1;
        }
        return pos;
    }
    
}
