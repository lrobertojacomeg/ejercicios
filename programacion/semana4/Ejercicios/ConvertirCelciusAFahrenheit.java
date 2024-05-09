package Ejercicios;

import java.util.Scanner;

public class ConvertirCelciusAFahrenheit {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);    
        //definir variables
        
        double celsius, fahrenheit;
        
        //leer la temperatura en grados celsius
        System.out.println("Ingrese la temperatura en grados Celsius");
        celsius = input.nextDouble();
        
        //convertir celsius a fahrenheit
        fahrenheit = (celsius *9/5) + 32;
        
        //mostrar el resultado
        System.out.println("La temperatura de " + celsius + 
                " grados celsius es equivalente a " + fahrenheit + 
                " grados Fahrenheit");
    }
}
