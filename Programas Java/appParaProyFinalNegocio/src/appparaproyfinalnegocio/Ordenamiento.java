package appparaproyfinalnegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest
 */
public class Ordenamiento {
    
    private int interc, comp;
    
    public static void BurbujaAsc(int []vec){
        int intercambios, comparaciones;
        intercambios = comparaciones = 0;
        for(int i = 0; i < vec.length-1; i++){
            for(int j = vec.length -1; i < j ; j--){
                comparaciones++;
                if(vec[j-1] > vec[j]){
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    intercambios++;
                }
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comparaciones);
        System.out.println("\u001B[32mNo. de Intercambios  : "+intercambios);
    }
    
    public static void BurbujaDsc(int []vec){
        int intercambios, comparaciones;
        intercambios = comparaciones = 0;
        for(int i = 0; i < vec.length-1; i++)
            for(int j = vec.length -1; i < j ; j--){
                comparaciones++;
                if(vec[j-1] < vec[j]){
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    intercambios++;
                }
            }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comparaciones);
        System.out.println("\u001B[32mNo. de Intercambios  : "+intercambios);
    }
  
    public static void BurbujaConSeñalDsc(int []vec){
        int intercambios, comparaciones;
        intercambios = comparaciones = 0;
        boolean band=false;
        for(int i = 0; i < vec.length-1 && !band; i++){
           band = true;
           for(int j = vec.length -1; i < j ; j--){
                comparaciones++;
                if(vec[j-1] < vec[j]){
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    intercambios++;
                    band = false;
                }
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comparaciones);
        System.out.println("\u001B[32mNo. de Intercambios  : "+intercambios);
    }
    
    public static void BurbujaConSeñalAsc(int []vec){
        int intercambios, comparaciones;
        intercambios = comparaciones = 0;
        boolean band = false;
        for(int i = 0; i < vec.length-1 && !band; i++){
            band = true;
            for(int j = vec.length -1; i < j ; j--){
                comparaciones++;
                if(vec[j-1] > vec[j]){
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    intercambios++;
                    band = false;
                }
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comparaciones);
        System.out.println("\u001B[32mNo. de Intercambios  : "+intercambios);
    }
    
    public static void shaker_sortAsc(int [] vec){
        int intercambios, comparaciones;
        intercambios = comparaciones = 0;
        int a,b,c,d,aux;
        c = 1;
        b = vec.length-1;
        d = vec.length-1;
        do{
            for(a=d;a>=c;--a){
                comparaciones++;
                if(vec[a-1] > vec[a]){
                    aux = vec[a-1];
                    vec[a-1] = vec[a];
                    vec[a]=aux;
                    b=a;
                    intercambios++;
                }
            }
            c=b+1;
            for(a=c; a<d+1;++a){
                comparaciones++;
                if(vec[a-1] > vec[a]){
                    aux = vec[a-1];
                    vec[a-1] = vec[a];
                    vec[a]=aux;
                    b=a;
                    intercambios++;
                }
            }
            d=b-1;
        }while(c<=d);
        System.out.println("\u001B[32mNo. de Comparaciones : "+comparaciones);
        System.out.println("\u001B[32mNo. de Intercambios  : "+intercambios);
    
    }
    
    
    public static void shaker_sortDsc(int [] vec){
        int intercambios, comparaciones;
        intercambios = comparaciones = 0;
        int a,b,c,d,aux;
        c = 1;
        b = vec.length-1;
        d = vec.length-1;
        do{
            for(a=d;a>=c;--a){
                comparaciones++;
                if(vec[a-1] < vec[a]){
                    aux = vec[a-1];
                    vec[a-1] = vec[a];
                    vec[a]=aux;
                    b=a;
                    intercambios++;
                }
            }
            c=b+1;
            for(a=c; a<d+1;++a){
                comparaciones++;
                if(vec[a-1] < vec[a]){
                    aux = vec[a-1];
                    vec[a-1] = vec[a];
                    vec[a]=aux;
                    b=a;
                    intercambios++;
                }
            }
            d=b-1;
        }while(c<=d);
        System.out.println("\u001B[32mNo. de Comparaciones : "+comparaciones);
        System.out.println("\u001B[32mNo. de Intercambios  : "+intercambios);
    }
    
    public static void shellAsc(int [] vec){
        boolean band;
        int aux, i, inc;
        int comp, interc;
        comp = interc = 0;
        inc = vec.length;
        while(inc > 1){
            inc /= 2;
            band = true;
            while(band){
                band = false;
                i = 0;
                while((i+inc) < vec.length){
                    comp++;
                    if(vec[i] > vec[i+inc]){
                        aux = vec[i];
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        interc++;
                    }
                    i++;                    
                }
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comp);
        System.out.println("\u001B[32mNo. de Intercambios  : "+interc);
    }
    
    public static void shellDesc(int [] vec){
        boolean band;
        int aux, i, inc;
        int comp, interc;
        comp = interc = 0;
        inc = vec.length;
        while(inc > 1){
            inc /= 2;
            band = true;
            while(band){
                band = false;
                i = 0;
                while((i+inc) < vec.length){
                    comp++;
                    if(vec[i] < vec[i+inc]){
                        aux = vec[i];
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        interc++;
                    }
                    i++;                    
                }
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comp);
        System.out.println("\u001B[32mNo. de Intercambios  : "+interc);
    }
    
    public static void shell2Asc(int [] vec){
        int comp, interc;
        comp = interc = 0;
        int i, j, k ,s, w, aux;
        boolean entro = false;
        //CALCULAR LAS SECUENCIAS UTILIZANDO UNA DE LAS FORMULAS PROPUESTAS POR
        //LOS PROFES DE STANFORD, IMPLEMENTAR UN METODO PARA IR OBTENIENDO LOS
        //INCREMENTOS DE ACUERDO AL NUMERO DE ELEMENTOS
        int [] a = {9,5,3,3,1};
        for(w = 0; w < a.length; w++){
            k = a[w];
            s = -k;
            for(i = k; i < vec.length; ++i){
                aux = vec[i];
                j = i-k;
                if(s == 0){
                    s = -k;
                    s++;
                    vec[s] = aux;
                }
                comp++;
                while(j >= 0 && aux < vec[j] && j <= vec.length){
                    vec[j+k] = vec[j];
                    j -= k;
                }
                vec[j+k] = aux;
                interc++;
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comp);
        System.out.println("\u001B[32mNo. de Intercambios  : "+interc);
    }
    
    public static void shell2Dsc(int [] vec){
        int comp, interc;
        comp = interc = 0;
        int i, j, k ,s, w, aux;
        
        int [] a = {9,5,3,3,1};
        for(w = 0; w < a.length; w++){
            k = a[w];
            s = -k;
            for(i = k; i < vec.length; ++i){
                aux = vec[i];
                j = i-k;
                if(s == 0){
                    s = -k;
                    s++;
                    vec[s] = aux;
                }
                comp++;
                while(j >= 0 && aux > vec[j] && j <= vec.length){
                    vec[j+k] = vec[j];
                    j -= k;
                }
                vec[j+k] = aux;
                interc++;
            }
        }
        System.out.println("\u001B[32mNo. de Comparaciones : "+comp);
        System.out.println("\u001B[32mNo. de Intercambios  : "+interc);
    }
    
    public static void quickSortAsc(int [] vec, int izq,int der){
        //comp = interc = 0;
        //quickSortASC(vec, izq, der);
        //System.out.println("\u001B[32mNo. de Comparaciones : "+comp);
        //System.out.println("\u001B[32mNo. de Intercambios  : "+interc);
    }
    
    public static void quickSortASC(Producto []vec, int izq,int der){
        int i,j,pivote;
        i = izq;
        j = der;
        Producto aux;
        pivote = vec[(izq+der)/2].clave;
        do{
            
            while(vec[i].clave < pivote && i < der){
                i++;
                
            }
            
            while(vec[j].clave > pivote && j > izq){
                j--;
                
            }
            if(i <= j){
                aux = vec[i];
                vec[i] = vec[j];
                vec[j] = aux;
                i++;
                j--;
                
            }
        }while (i <= j);
        if(izq < j)
           quickSortASC(vec,izq,j);
        if(i < der)
           quickSortASC(vec,i,der);
    }
    
}
