/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Guest
 */
        
//DISEÑE E IMPLEMENTE UNA CLASE PARA REPRESENTAR EL COMPORTAMIENTO DE LA CLASE CHARACTER
public class Caracter {
    
    //A MINUSCULAS
    public static char aMinuscula(char c){
        //a = 97, z = 122
        //A = 65, Z = 90
        
//        //VALIDAR SI EL CARACTER ES LETRA Y ES MAYUSCULA
//        char letra = c;
//        if(c >= 65 && c <= 'Z'){
//            letra = (char)(c + 32);
//        }
//        return letra;
        if(esMayuscula(c))
            c += (char)32;
        return c;
    }
    
    //A MAYUSCULAS
    public static char aMayuscula(char c){
        if(esMinuscula(c))
            c -= (char)32;
        return c;
    }
    
    //ES MINUSCULA
    public static boolean esMinuscula(char c){
//        if(c >= 'a' && c <= 'z')
//            return true;
//        return false;
        return(c >= 'a' && c <= 'z');
    }
    
    //ES MAYUSCULA
    public static boolean esMayuscula(char c){
        return(c >= 65 && c <= 90);
    }
    
    //ES DIGITO
    public static boolean esDigito(char c){
        return (c >= '0' && c <= 57);
    }
    
    //DETERMINE SI ES UN SIGNO DE PUNTUACION (, ; . :)
    public static boolean esSignoDePuntuacion(char c){
        if(c!=44 || c!=':' || c!=46 || c!=';')
            return false;
        else
            return true;
    }
    
    public static boolean esVocal(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || esVocalConAcento(c))
            return true;
        return false;
    }
    
    public static boolean esVocalConAcento(char c){
        if(c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú')
            return true;
        return false;
    }
    
    
    
    
}
