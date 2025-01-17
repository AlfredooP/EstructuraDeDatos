/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author alfre
 */
public class Ordenamiento {
    
    private static char[] quitarEspacios(String cadena){
        char aux[] = cadena.toCharArray();
        StringBuilder c = new StringBuilder("");
        for(int i = 0; i < aux.length; i++){
            if(aux[i] != ' ')
                c.append(aux[i]);
        }
        System.out.println(c);
        return c.toString().toCharArray();
    }
    
    public static void ordenarCodigoAsc(Producto []vec, int izq,int der){
        int i,j,pivote;
        i = izq;
        j = der;
        Producto aux;
        pivote = vec[(izq+der)/2].codigo;
        do{
            while(vec[i].codigo < pivote && i < der){
                i++;
            }
            while(vec[j].codigo > pivote && j > izq){
                j--;
            }
            if(i <= j){
                aux = vec[i];
                vec[i] = vec[j];
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
        if(izq < j)
           ordenarCodigoAsc(vec,izq,j);
        if(i < der)
           ordenarCodigoAsc(vec,i,der);
    }
    
    public static void ordenarNombreAsc(Producto []vec, int izq,int der){
        int i,j;
        i = izq;
        j = der;
        Producto aux;
        String pivote = vec[(izq+der)/2].nombre;
        char[] arrPivote = quitarEspacios(pivote);
        do{    
        char[] arrVec = quitarEspacios(vec[i].nombre);
            while(arrVec[i] < arrPivote[i] && i < der){
                i++;
            }
            while(arrVec[j] > arrPivote[j] && j > izq){
                j--;
            }
            if(i <= j){
                aux = vec[i];
                vec[i] = vec[j];
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
        if(izq < j)
           ordenarCodigoAsc(vec,izq,j);
        if(i < der)
           ordenarCodigoAsc(vec,i,der);
    }
    
    public static void ordenarPrecioAsc(Producto []vec, int izq,int der){
        int i,j;
        i = izq;
        j = der;
        Producto aux;
        double pivote = vec[(izq+der)/2].precio;
        do{
            while(vec[i].precio < pivote && i < der){
                i++;
            }
            while(vec[j].precio > pivote && j > izq){
                j--;
            }
            if(i <= j){
                aux = vec[i];
                vec[i] = vec[j];
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
        if(izq < j)
           ordenarCodigoAsc(vec,izq,j);
        if(i < der)
           ordenarCodigoAsc(vec,i,der);
    }
}
