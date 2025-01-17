/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appparaproyfinalnegocio;

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
        System.out.println("Leyendo datos desde archivo");
        try{
            archivoInput = new FileInputStream(nombArch);
            entradaDatos = new DataInputStream(archivoInput);
            
            while(true){
                int clave = entradaDatos.readInt();
                int cantidad = entradaDatos.readInt();
                String nombre = entradaDatos.readUTF();
                String descripcion = entradaDatos.readUTF();
                double precio = entradaDatos.readDouble();
                
                System.out.println(clave + " | " + cantidad + " | " + nombre + " | " + descripcion + " | " + precio);
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
    
    public void guardarVecEnArchivo(String nombArch, Producto[] productos){
        FileOutputStream archivoSalida = null;
        DataOutputStream salidaDatos = null;
        System.out.println("Guardando datos en archivo");
        try{
            archivoSalida = new FileOutputStream(nombArch);
            salidaDatos = new DataOutputStream(archivoSalida);
            
            int i = 0;
            while(i < productos.length){
                salidaDatos.writeInt(productos[i].clave);
                salidaDatos.writeInt(productos[i].clave);
                salidaDatos.writeUTF(productos[i].nombre);
                salidaDatos.writeUTF(productos[i].descripcion);
                salidaDatos.writeDouble(productos[i].precio);
                i++;
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
    
    
    public void guardarProductosEnArchivo(String nombArch, Producto[] productos){
        FileOutputStream archivoSalida = null;
        DataOutputStream salidaDatos = null;
        System.out.println("Guardando datos en archivo");
        try{
            archivoSalida = new FileOutputStream(nombArch, true);
            salidaDatos = new DataOutputStream(archivoSalida);
            
            int i = 0;
            while(i < productos.length){
                salidaDatos.writeInt(productos[i].clave);
                salidaDatos.writeInt(productos[i].clave);
                salidaDatos.writeUTF(productos[i].nombre);
                salidaDatos.writeUTF(productos[i].descripcion);
                salidaDatos.writeDouble(productos[i].precio);
                i++;
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
