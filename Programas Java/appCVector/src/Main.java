
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void tablaDeMultiplicar(int n, CVector v){
        for(int i = 1; i <= 10; i++){
            v.asignar(i-1, i*n);
            //System.out.println(n+"x"+i+"="+(n*i));
        }
    }
    
    public static void numerosPrimos(CVector v){
        for(int i=0; i < v.tam(); i++){
            if(Matematicas.esPrimo1(v.leer(i)))
                System.out.println("NUM. PRIMO: "+v.leer(i));
            else
                System.out.println("NUM. NO ES PRIMO: "+v.leer(i));
        }
    }
    
    public static void numerosNones(CVector v){
        for(int i=0; i < v.tam(); i++){
            if(v.leer(i)%2 != 0)
                System.out.println("NUM. NON: " + v.leer(i));
            else
                System.out.println("NUM PAR: " + v.leer(i));
        }
    }
    
        public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        CVector vector = new CVector();
        for(int i =0; i < vector.tam(); i++){
            vector.asignar(i, random.nextInt(90)+10);
            System.out.println(vector.leer(i));
        }
        vector.invertir(vector);
        System.out.println("DATOS EN ORDEN INVERSO: ");
        for(int i = 0; i < vector.tam(); i++){
            System.out.println(vector.leer(i));
        }
        
        CVector vecTabla = new CVector(10);
        System.out.print("TABLA DE MULTIPLICAR DEL: ");
        int numero = scanner.nextInt();
        
        tablaDeMultiplicar(numero, vecTabla);
        
        for(int i = 0; i < vecTabla.tam(); i++){
            System.out.println(numero+"x"+(i+1)+"="+vecTabla.leer(i));
        }
    
        //Diseñe e implemente un metodo para determinar numeros primos en el arreglo
        //El tamaño del arreglo sera aleatorio entre 10 y 50 numeros
        //Asignar numeros aleatorios de tres digitos al arreglo
        CVector vecPrimos = new CVector(random.nextInt(41)+10);
        
        for(int i = 0; i < vecPrimos.tam(); i++)
            vecPrimos.asignar(i, random.nextInt(900)+100);
        numerosPrimos(vecPrimos);
        System.out.println("");
        numerosNones(vecPrimos);
    }
    
}
