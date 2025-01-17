/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appparaproyfinalnegocio;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Guest
 */
public class AppParaProyFinalNegocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
//        for(int i = 0; i < productos.length; i++){
//            System.out.println(productos[i].clave + " | " + productos[i].cantidad + " | " + productos[i].nombre + " | " + productos[i].descripcion + " | " + productos[i].precio);
//        }
        
        //Usando for-each
        for(Producto prod : productos)
            System.out.println(prod.clave + " | " + prod.cantidad + " | " + prod.nombre + " | " + prod.descripcion + " | " + prod.precio);
        
        System.out.println("Datos Ordenados:");
        Ordenamiento.quickSortASC(productos, 0, productos.length);
        //Agregar buscar
        
        System.out.println("Datos guardados en archivo");
        ArchivosBinarios archProductos = new ArchivosBinarios();
        archProductos.guardarProductosEnArchivo("lunes11.prod", productos);
        archProductos.leerArchivo("lunes11.prod");
    }
    
}
