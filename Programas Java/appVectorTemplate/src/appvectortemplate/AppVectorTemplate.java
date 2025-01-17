/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appvectortemplate;

import java.util.Random;

/**
 *
 * @author Guest
 */
public class AppVectorTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        //TIPO ENTERO
        VectorT<Integer> vecEnteros = new VectorT<Integer>(10);
        System.out.println("\033[34mVector de enteros");
        for(int i = 0; i < vecEnteros.tam(); i++){
            vecEnteros.asignar(i, random.nextInt(50)+50);
            System.out.println("\033[32mVecEnteros["+(i+1)+"] = "+vecEnteros.leer(i));
        }
        
        float prom = vecEnteros.promedio();
        System.out.println("Prmoedio = "+ prom);
        System.out.println("Mayor = "+ vecEnteros.mayor());
        System.out.println("Menor = "+ vecEnteros.menor());
        System.out.println("");
        
        //TIPO FLOAT
        VectorT<Float> vecFloats = new VectorT(random.nextInt(20));
        System.out.println("Vector de floats");
        for(int i = 0; i < vecFloats.tam(); i++){
            vecFloats.asignar(i, random.nextFloat()*90+10);//10.0f, 99.0f
            System.out.println("VecFloat ["+ (i+1) + "] = "+ vecFloats.leer(i));
        }
        
        System.out.println("Mayor = "+ vecFloats.mayor());
        System.out.println("Menor = "+ vecFloats.menor());
        System.out.println("Promedio = "+ vecFloats.promedio());
        System.out.println("");
        
        //VectorT<Float> vecFloatCopia = new VectorT(vecFloats);
        
       //TIPO CHAR
        VectorT<Character> vecChar = new VectorT(26);
        System.out.println("Vector de char");
        for(int i = 0; i < vecChar.tam(); i++){
            vecChar.asignar(i, (char)('a'+i));
            System.out.println(vecChar.leer(i));
        }
        
        System.out.println("Mayor = "+ vecChar.mayor());
        System.out.println("Menor = "+ vecChar.menor());
        //System.out.println("Promedio = "+ vecChar.promedio());
        System.out.println("");
        
        //IMPLEMENTAR EL METODO INVERTIR
        
        //TIPO STRING
        System.out.println("Vector de Strings");
        String [] nombres = {"Juan", "Pedro", "Sergio", "Alma", "Emiliano", "Marcos", "Alfredo", "David", "Abraham", "Isaac"};
        
        VectorT<String> vecString = new VectorT(5);
        for(int i = 0; i < vecString.tam(); i++){
            int pos = random.nextInt(10);
            vecString.asignar(i, nombres[pos]);
            System.out.println("VecString ["+(i+1)+"] = "+vecString.leer(i));
           
        }
//            System.out.println("LETRA MAYOR = "+ vecString.mayor());
//            System.out.println("LETRA MENOR = "+ vecString.menor());
        System.out.println("");
        
        //TIPO DOUBLE
        VectorT<Double> vecDouble = new VectorT(random.nextInt(10));
        System.out.println("Vector de Doubles");
        for(int i = 0; i < vecDouble.tam(); i++){
            vecDouble.asignar(i, random.nextDouble()*90+10);
            System.out.println("VecDouble [" + (i+1) + "] = " + vecDouble.leer(i));
        }
        System.out.println("Mayor = "+ vecDouble.mayor());
        System.out.println("Menor = "+ vecDouble.menor());
        System.out.println("Promedio = "+ vecDouble.promedio());
        System.out.println("");
        
        //USAR LA CLASE VECTORT EN LA APP. GUI
        //PRACTICAR CON EL MANUAL DE TUTORIALS POINT LO REFERENTE AL CAPITULO DE LA CLASE CHARACTER
        
    }
    
}
