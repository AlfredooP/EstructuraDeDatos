/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjoptionpanetablamultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class AppJOptionPaneTablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    
    public static void tablaDeMultiplicar(Vector vec, int num){
        for(int i = 1; i <= 10; i++)
            vec.asignar(i-1, i*num);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String cad;
        int opc;
        do{
            Vector vector = new Vector(10);
            cad = ""; //Asignar cadena vacia a cad
            int n;
            try{
                cad = JOptionPane.showInputDialog(null, "Numero: ", "Tabla de Multiplicar", JOptionPane.INFORMATION_MESSAGE);
                n = Integer.parseInt(cad);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR, ENTRADA NO VALIDA\nSE UTILIZARA COMO VALOR POR DEFAULT: 5");
                n = 5;
            }
            cad = "";
            
            tablaDeMultiplicar(vector, n);
            for(int i = 0; i < vector.tam(); i++)
                cad += n + "x" + (i+1) + "=" + vector.leer(i)+"\n";
            
            JOptionPane.showMessageDialog(null, cad);
            opc = JOptionPane.showConfirmDialog(null, "OTRA TABLA");
            
        }while(opc == 0); //YES = 0
        
    }
    
}
