/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appexamenu5;

/**
 *
 * @author USER
 */
public class AppExamenU5 {

    public static void seleccion(int [] vec, int n){
        int i, mayor, k, j;
        
        for(i = 0; i < n-1; i++){
            mayor = vec[i];
            k = i;
            for(j = i+1; j < n; j++){
                if(vec[j] > mayor){
                    mayor = vec[j];
                    k = j;
                }
            }
            vec[k] = vec[i];
            vec[i] = mayor;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vec = {14,25,17,3,6};
        System.out.println("Vector ordenado: ");
        seleccion(vec, vec.length);
        for(int i = 0; i < vec.length; i++)
            System.out.print(vec[i] + ", ");
        
    }
    
}
