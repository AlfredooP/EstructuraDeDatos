/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparchivosbinariosparaproyectofinal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Guest
 */
public class ArchivosBinarios {
    
    public void leerArchivo(String nombArch){
        FileInputStream archivoInput = null;
        DataInputStream entradaDatos = null;
        int n;
        
        try{
            archivoInput = new FileInputStream(nombArch);
            entradaDatos = new DataInputStream(archivoInput);
            
            while(true){
                n = entradaDatos.readInt();
                System.out.println("Dato = " + n);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(EOFException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(entradaDatos != null)
                    entradaDatos.close();
                if(archivoInput != null)
                    archivoInput.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void guardarVecEnArchivo(String nombArch, int[] vec){
        FileOutputStream archivoSalida = null;
        DataOutputStream salidaDatos = null;
        
        try{
            archivoSalida = new FileOutputStream(nombArch);
            salidaDatos = new DataOutputStream(archivoSalida);
            
            for(int i = 0; i < vec.length; i++){
                salidaDatos.writeInt(vec[i]);
                System.out.println("Dato guardado en Archivo: " + vec[i]);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(salidaDatos != null)
                    salidaDatos.close();
                if(archivoSalida != null)
                    archivoSalida.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
