/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoptionpanevector;

import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class AppOptionPaneVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadsMain = ""; //Asignamos cadena vacia
        JOptionPane.showMessageDialog(null, "Cadenas enviadas a Main");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
            cadsMain += args[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, cadsMain);

        int cantLetras = 0;
        int cantDigitos = 0;
        int cantOtros = 0;
        
        for(int i = 0; i < cadsMain.length(); i++){
            if(Character.isLetter(cadsMain.charAt(i)))
                cantLetras++;
            else
                if(Character.isDigit(cadsMain.charAt(i)))
                    cantDigitos++;
                else
                    cantOtros++;
        }
        
        System.out.printf("Num. Letras = %d \n", cantLetras);
        System.out.printf("Num. Digitos = %d \n", cantDigitos);
        System.out.printf("Num. Otros = %d \n", cantOtros);
        
    }
    
}
