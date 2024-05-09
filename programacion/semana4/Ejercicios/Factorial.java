
package Ejercicios;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        
        //es un comentario de 1 sola linea
        /*
          es un comentario
        de varias lineas
        
        */
        
        Scanner input = new Scanner(System.in);
        
        //definir variables
        int n; 
        long factorial;
        factorial = 1;
        
        System.out.println("Ingrese un numero: ");
        n = input.nextInt();
        
        //calcular el factorial
        for (int i=1; i<= n; i++){
            //estas son pruebas
            //System.out.println(i);
            //System.out.println(i*10);
            //System.out.println(i*i);
            
            factorial = factorial * i;
        }
        
        //mostrar el resultado
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
