/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author alfre
 */
public class Metodos {
    
    public static String numEjercicio(int i, int n){
        StringBuilder cadenaSB = new StringBuilder("Ejercicio i de n");
        char arrI [] = Integer.toString(i).toCharArray();
        char arrN [] = Integer.toString(n).toCharArray();
        cadenaSB.setCharAt(10, arrI[0]);
        cadenaSB.setCharAt(15, arrN[0]);
        return cadenaSB.toString();
    }
    
    public static boolean verificarMayusRespuesta(String res){
        char arrResp [] = res.toCharArray();
        for(int i = 0; i < arrResp.length; i++){
            if(Caracter.esMinuscula(arrResp[i])){
                i = arrResp.length;
                return false;
            }
        }
        return true;
    }
    
}
