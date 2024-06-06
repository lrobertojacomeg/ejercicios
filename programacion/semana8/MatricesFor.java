package Ejercicios;

public class MatricesFor {
    public static void main(String[] args){
        int filas = 4;
        int columnas =10;                
        int[][] mimatriz = new int[filas][columnas];
        
        //modificar los valores de la matriz
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                mimatriz[i][j] = i + j;
            }
        }        
        //leer los valores de la matriz
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(mimatriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
