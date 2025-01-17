/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppilapruebas;

/**
 *
 * @author Guest
 */
public class AppPilaPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String escuela = "Tec Laguna";
        escuela.toCharArray();
        PilaGenerica<Character> pilaLetras = new PilaGenerica(escuela.length());
        
        System.out.println("INTRODUCIENDO DATOS EN LA PILA...");
        int indice = 0;        
        while(!pilaLetras.estaLlena()){
            //System.out.println("Dato a Insertar: " + escuela.charAt(indice));
            System.out.print(escuela.charAt(indice));
            pilaLetras.push(escuela.charAt(indice++));
        }
        System.out.println("");
        System.out.println("ELIMINANDO DATOS DE LA PILA...");
        for(; !pilaLetras.estaVacia();){
            //System.out.println("Dato eliminado: " + pilaLetras.pop());
            System.out.print(pilaLetras.pop());
        }
        System.out.println("");
        
        //DISEÑE UNA PILA CON NOMBRES ALEATORIOS
        //MUESTRE EL NOMBRE A INSERTAR
        //MUESTRE LA PILA Y LA ELIMINACION DE LOS NOMBRES EN LA PILA
        
        String [] nombres = {"ANA", "JUANA", "MARIA", "BERTHA", "MAYELA", "LUIS", "ALEX", "DANIEL", "JOSE", "JUAN"};
        PilaGenerica<String> pilaNombres = new PilaGenerica(nombres.length);
        
        System.out.println("NOMBRES");
        indice = 0;
        while(!pilaNombres.estaLlena()){
            System.out.println(nombres[indice]);
            pilaNombres.push(nombres[indice++]);
        }
        System.out.println("");
        System.out.println("ELIMINANDO DATOS DE LA PILA...");
        for(; !pilaNombres.estaVacia();){
            //System.out.println("Dato eliminado: " + pilaLetras.pop());
            System.out.print(pilaNombres.pop());
        }
        System.out.println("");
        
    }
    //PARA MAÑANA IMPLEMENTAR UNA APLICACION JAVA PARA ALMACENAR LOS NOMBRES 
    //EN UN ARCHIVO DE TEXTO PARA ASIGNARLOS EN UNA PILA
}
