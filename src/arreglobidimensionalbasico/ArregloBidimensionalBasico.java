package arreglobidimensionalbasico;
import java.util.Scanner;

/**
 * @author Francisco Delgado Martínez.
 **/

public class ArregloBidimensionalBasico {
    
    public static void imprimirArreglo (int [][] arreglo){
        
        System.out.println("Los datos del arreglo son: ");
        for(int i=0; i<arreglo.length; i++){//Recorrer filas.
            for(int j=0; j<arreglo[i].length; j++){//Recorrer columnas.
                System.out.print(" "+arreglo[i][j]);
            }
            
            System.out.println("");
        }
    }
    
    public static int [][] leerArreglo(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce el número de filas: ");
        int filas = leer.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int columnas = leer.nextInt();
        
        //Declarar un arreglo dibidemsional.
        int arreglo[][] = new int[filas][columnas];
        
        System.out.println("Ingrese datos númericos al arreglo bidimensional: ");
        for(int i=0; i<filas; i++)//recorrer filas.
            for(int j=0; j<columnas; j++)//recorrer columnas.
                arreglo[i][j] = leer.nextInt();
        
        return arreglo;
    }
    
    public static void main(String[] args) {
        int arreglo1[][] = leerArreglo();
        
        imprimirArreglo(arreglo1);
    }
}
