/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Guest
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder cadenaSB1 = new StringBuilder("Tecnologico ");
        System.out.println("Cadena StringBuilder: " + cadenaSB1);
        
        String cadena = "de la Laguna, TORREON, COAH. MEXICO";
        StringBuilder cadenaSB2 = new StringBuilder(cadena);
        System.out.println("Cadena StringBuilder 2: " + cadenaSB2);        
        
        char [] cadenaChar = cadena.toCharArray();
        StringBuilder cadenaSB3 = new StringBuilder(new String(cadenaChar));
        System.out.println("CadenaSB3 : " + cadenaSB3);
        
        cadenaSB3 = cadenaSB1.append(cadenaSB2);
        System.out.println("CadenaSB3 : " + cadenaSB3);
        
        cadenaSB3 = new StringBuilder(cadenaSB2.toString()+cadenaSB1.toString());
        System.out.println("CadenaSB3 : " + cadenaSB3);
        
        StringBuilder cad1 = new StringBuilder("");
        System.out.println("LENGTH : " + cad1.length());
        System.out.println("CAPACITY : " + cad1.capacity());
        
        //INVERTIR LA CADENASB3
        cadenaSB3 = cadenaSB3.reverse();
        System.out.println("CadenaSB3 : " + cadenaSB3);
        
        cadenaSB3 = cadenaSB3.reverse();
        System.out.println("CadenaSB3 : " + cadenaSB3);
        
        int longitud = cadenaSB3.toString().length();
        
        StringBuilder cadenaSB11 = new StringBuilder("torreon");
        for(int i = 0; i < cadenaSB11.length(); i++){
            cadenaSB11.setCharAt(i, Caracter.aMayuscula(cadenaSB11.charAt(i)));
        }
        System.out.println("CadenaSB11 : " + cadenaSB11);
        
        StringBuilder cadenaSB12 = new StringBuilder("torreon");
        for(int i = 0; i < cadenaSB12.length(); i++){
            cadenaSB12.setCharAt(i, Character.toUpperCase(cadenaSB12.charAt(i)));
        }
        System.out.println("CadenaSB12 : " + cadenaSB12);
        
    }
    
    //TAREA DOMINGO 24 DE SEPTIEMBRE
    //APP. JUEGO LIBRE UTILIZANDO SU CREATIVIDAD DONDE MANEJE CARACTERES, CADENAS CON LAS VERSIONES VISTAS EN CLASE
    //EL JUEGO DEBERA PERMITIR APRENDER A LEER, CONOCER LAS LETRAS PALABRAS CORRECTAMENTE ESCRITAS, INGLES
    
}
