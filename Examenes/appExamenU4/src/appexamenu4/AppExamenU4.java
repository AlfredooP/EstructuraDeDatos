/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appexamenu4;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AppExamenU4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] tipoXPieza = {"Martillo", "Pinza", "Taladro", "Cinta Metrica", "Desarmador", "Pala"};
        String[] tipoXPeso = {"Clavos", "Tachuelas", "Tornillos", "Cemento", "Arena", "Grava", "Cal"};
        String[] tipoXMedida = {"Tubo PVC", "Canaleta", "Cable Electrico", "Alambre de Cobre", "Alambre Acerado"};
        
        String[] medidas = {"No.1", "No.2", "No.3"};
        String[] marcas = {"Trupper", "Pretul", "Urrea", "3M"};
        
        DecimalFormat df = new DecimalFormat("0.##");        
        Producto[] productos = new Producto[10];
        
        for(int i = 0; i < productos.length; i++){
            double pp = random.nextDouble()*1000;
            double precio = Double.parseDouble(df.format(pp));
            
            productos[i] = new Producto(random.nextInt(9000)+1000, random.nextInt(90)+10, tipoXPieza[random.nextInt(6)], 
                                        tipoXMedida[random.nextInt(5)], precio);
        
        }
        for(Producto prod : productos)
            System.out.println(prod.clave + " | " + prod.cantidad + " | " + prod.nombre + " | " + prod.descripcion + " | " + prod.precio);
        
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();
        
        for(int i = 0; i < productos.length; i++)
            arbol.insertar(productos[i].clave);
        
        System.out.println("\nRecorrido de claves Inorden");
        arbol.recorridoInorden();
        System.out.println("\nRecorrido de claves Preorden");
        arbol.recorridoPreorden();
        System.out.println("\nRecorrido de claves Postorden");
        arbol.recorrridoPostorden();
        
        System.out.println("\nClave a buscar: ");
        int x = scanner.nextInt();
        if(arbol.buscarDato(x))
            System.out.println("Clave encontrada");
        else
            System.out.println("Clave no encontrada");
        
        
    }
    
}
