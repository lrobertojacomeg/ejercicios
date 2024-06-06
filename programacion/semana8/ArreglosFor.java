package Ejercicios;
public class ArreglosFor {
    public static void main(String[] args){
        int[] miarreglo = new int[100];        
        //modificamos los valores del arreglo
        for(int i=0; i < miarreglo.length ; i++){
            miarreglo[i] = i + 1;
        }        
        //leer los valores del arreglo
        for(int i=0; i< miarreglo.length; i++){
            System.out.println("El elemento " + i + " vale " + miarreglo[i]);
        }    
        //modificamos los valores del arreglo
        for(int i=0; i < miarreglo.length ; i++){
            miarreglo[i] = miarreglo.length - i;
        }        
        //leer los valores del arreglo
        for(int i=0; i< miarreglo.length; i++){
            System.out.println("El elemento " + i + " vale " + miarreglo[i]);
        }    
        //modificamos los valores del arreglo
        for(int i=0; i < miarreglo.length ; i++){
            miarreglo[i] = (i+1) * 100;
        }        
        //leer los valores del arreglo
        for(int i=0; i< miarreglo.length; i++){
            System.out.println("El elemento " + i + " vale " + miarreglo[i]);
        }    
    }
}
