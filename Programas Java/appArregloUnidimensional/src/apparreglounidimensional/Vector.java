/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apparreglounidimensional;

/**
 *
 * @author aa611
 */
public class Vector {
    public static float calcularPromedio(int []vec){
        float promedio = 0.0f;
        
        for(int i=0; i<vec.length; i++){
            //System.out.println(vec[i]);
            promedio += vec[i];
        }
        promedio /= vec.length;
        //vec[2] = 33;
        return promedio;
        //return promedio/vec.length;
    }
    
    public static int calcularMayor(int []vec){
        int mayor = vec[0];
        for(int i=1; i<vec.length; i++){
            if(vec[i] > mayor)
                mayor = vec[i];
        }
        return mayor;
    }
    
    public static int calcularMenor(int []v){
        int menor = v[0];
        for(int i=1; i<v.length; i++){
            if(v[i] < menor)
                menor = v[i];
        }
        return menor;
    }
}
