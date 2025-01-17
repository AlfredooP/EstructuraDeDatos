
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        Random random = new Random();
        boolean bandera = true;
        Scanner scan = new Scanner(System.in);
        int opc;
        
        System.out.print("\n\u001B[35mNUMERO DE DATOS: ");
        int n = scan.nextInt();
        
        int[]vec = new int[n];
        //vec = {1,6};
        
        System.out.println("\n\u001B[35mDATOS DESORDENADOS:");
        for(int i = 0; i < vec.length; i++){
            vec[i] = random.nextInt(899)+100;
            System.out.println(vec[i]);
        }  
        
        while(bandera){
            System.out.println("\n\u001B[35mMENU:");
            System.out.println("\u001B[31m0) Salir");
            System.out.println("\u001B[35m1)\u001B[30m Burbuja Asc");
            System.out.println("\u001B[35m2)\u001B[30m Burbuja Desc");
            System.out.println("\u001B[35m3)\u001B[30m Burbuja Con Señal Asc");
            System.out.println("\u001B[35m4)\u001B[30m Burbuja Con Señal Desc");
            System.out.println("\u001B[35m5)\u001B[30m Shaker Sort Asc");
            System.out.println("\u001B[35m6)\u001B[30m Shaker Sort Desc");
            System.out.println("\u001B[35m7)\u001B[30m Shell Asc");
            System.out.println("\u001B[35m8)\u001B[30m Shell Desc");
            System.out.println("\u001B[35m9)\u001B[30m Shell 2 Asc");
            System.out.println("\u001B[35m10)\u001B[30m Shell 2 Desc");
            System.out.println("\u001B[35m11)\u001B[30m QuickSort");
            System.out.println("\u001B[35m12)\u001B[30m Volver a generar datos");
                        
            System.out.print("\n\u001B[35mSELECCIONE OPCIÓN: ");
            opc = scan.nextInt();
            
            System.out.println("");
            switch(opc){
                case 0:
                    System.out.println("\u001B[32mSALIENDO...");
                    bandera = false;
                    break;
                case 1:
                    Ordenamiento.BurbujaAsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Ascendentemente con Burbuja:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 2:
                    Ordenamiento.BurbujaDsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Descendentemente con Burbuja:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 3:
                    Ordenamiento.BurbujaConSeñalAsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Ascendentemente con Burbuja Con Señal:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 4:
                    Ordenamiento.BurbujaConSeñalDsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Descendentemente con Burbuja Con Señal:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 5:
                    Ordenamiento.shaker_sortAsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Ascendentemente con Shaker Sort:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 6:
                    Ordenamiento.shaker_sortDsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Descendentemente con Shaker Sort:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 7:
                    Ordenamiento.shellAsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Ascendentemente con Shell:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 8:
                    Ordenamiento.shellDesc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Descendentemente con Shell:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 9:
                    Ordenamiento.shell2Asc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Ascendentemente con Shell 2:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 10:
                    Ordenamiento.shell2Dsc(vec);
                    System.out.println("\n\u001B[35mDatos Ordenados Descendentemente con Shell 2:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 11:
                    Ordenamiento numeros = new Ordenamiento();
                    numeros.quickSortAsc(vec,0,vec.length-1);
                    System.out.println("\n\u001B[35mDatos Ordenados Ascendentemente con QuickSort:");
                    for(int i = 0; i < vec.length; i++){
                        System.out.println(vec[i]);
                    }
                    break;
                case 12:
                    System.out.println("\n\u001B[35mDATOS DESORDENADOS:");
                    for(int i = 0; i < vec.length; i++){
                        vec[i] = random.nextInt(899)+100;
                        System.out.println(vec[i]);
                    }
                    break;
            }
        }        
    }    
}
