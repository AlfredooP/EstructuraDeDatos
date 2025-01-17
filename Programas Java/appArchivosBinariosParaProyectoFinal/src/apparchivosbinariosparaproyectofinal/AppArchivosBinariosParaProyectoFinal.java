/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparchivosbinariosparaproyectofinal;

import java.util.Random;

/**
 *
 * @author Guest
 */
public class AppArchivosBinariosParaProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] vec = new int[5];
        for(int i = 0; i < vec.length; i++)
            vec[i] = random.nextInt(900)+100;
        
        ArchivosBinarios archivoBin = new ArchivosBinarios();        
        archivoBin.guardarVecEnArchivo("vector1.pue", vec);
        archivoBin.leerArchivo("vector1.pue");
    }
    
}
