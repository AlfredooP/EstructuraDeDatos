/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparreglounidimensional;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Guest
 */
public class AppArregloUnidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] calif = new int[5];
        Random random =new Random();
        
        for(int i=0; i<calif.length; i++){
            calif[i] = random.nextInt(90) + 10;
            System.out.println(calif[i]);
        }
        
        //calif[0] = 70;
        DecimalFormat df = new DecimalFormat("#.00");
        
        //Utilizando valores por default
        //int [] calif = {77,98,91,55,67};
//        System.out.println("-----------------------------------");
//        double prom = 0.0;
//        for(int i = 0; i < calif.length; i++){
//            System.out.println(calif[i]);
//            prom += calif[i];
//        }
        //System.out.println("------------------------------------");
        //prom /= calif.length;
        //System.out.println("El promedio es = " + prom);
        
//        double prom = calcularPromedio(calif);
//        System.out.println("Promedio "+ prom);

//        System.out.println("El promedio es = " + df.format(prom/calif.length));
//        System.out.printf("Utilizando printf. El promedio es %.2f \n", prom/calif.length);
        
        //Implementar el codigo necesario para mostrar la calificacion mayor y la menor del promedio
//        int mayor = calif[0];
//        for(int i = 1; i < calif.length; i++){
//            if(calif[i] > mayor){
//                mayor = calif[i];
//            }
//        }
        //System.out.println("La calificacion mayor es: "+ mayor);
//        
        //Recorriendo el arreglo a partir del ultimo elemento
//        int menor = calif[calif.length-1];
//        for(int i = calif[calif.length -2]; i >= 0; i--){
//            if(menor > calif[i]){
//                menor = calif[i];
//            }
//        }
        
//        int menor = calif[0];
//        for(int i = 1; i < calif.length; i++){
//            if(menor > calif[i]){
//                menor = calif[i];
//            }
//        }
        //System.out.printf("La calificacion menor es: %d", menor);

        //Utilizando metodos para los calculos requeridos
        double prom = Vector.calcularPromedio(calif);
        System.out.println("Promedio "+ df.format(prom));
        
        int mayor = Vector.calcularMayor(calif);
        System.out.println("El mayor es "+ mayor);
        
        int menor = Vector.calcularMenor(calif);
        System.out.println("El menor es "+ menor);

    }
    
}
