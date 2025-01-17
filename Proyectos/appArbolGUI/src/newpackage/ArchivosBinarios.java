/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guest
 */
public class ArchivosBinarios {
    
    public void leerArchivoEnTabla(String nombArch, JTable tabla){
        FileInputStream archivoInput = null;
        DataInputStream entradaDatos = null;
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        try{
            archivoInput = new FileInputStream(nombArch);
            entradaDatos = new DataInputStream(archivoInput);
            int i = 0;
            while(true){
                int clave = entradaDatos.readInt();
                int cantidad = entradaDatos.readInt();
                String nombre = entradaDatos.readUTF();
                String descripcion = entradaDatos.readUTF();
                double precio = entradaDatos.readDouble();
                
                modelo.setRowCount(i+1);
                tabla.setValueAt(clave, i, 0);
                tabla.setValueAt(cantidad, i, 1);
                tabla.setValueAt(nombre, i, 2);
                tabla.setValueAt(descripcion, i, 3);
                tabla.setValueAt(precio, i, 4);
                i++;
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
        try{
            archivoSalida = new FileOutputStream(nombArch);
            salidaDatos = new DataOutputStream(archivoSalida);
            
            int i = 0;
            while(i < productos.length){
                salidaDatos.writeInt(productos[i].clave);
                salidaDatos.writeInt(productos[i].cantidad);
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
    
    
    public void agregarProductoEnArchivo(String nombArch, Producto producto){
        FileOutputStream archivoSalida = null;
        DataOutputStream salidaDatos = null;
        try{
            archivoSalida = new FileOutputStream(nombArch, true);
            salidaDatos = new DataOutputStream(archivoSalida);
            
            salidaDatos.writeInt(producto.clave);
            salidaDatos.writeInt(producto.cantidad);
            salidaDatos.writeUTF(producto.nombre);
            salidaDatos.writeUTF(producto.descripcion);
            salidaDatos.writeDouble(producto.precio);
            
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
