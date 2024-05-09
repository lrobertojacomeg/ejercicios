
package Ejercicios;

import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args){
        int num1, num2, suma;
        
        Scanner input = new Scanner(System.in);
    
        //leer los 2 numeros
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        //sumar los numeros
        suma = num1 + num2;
        
        //mostrar el resultado
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);
    
    }
}
