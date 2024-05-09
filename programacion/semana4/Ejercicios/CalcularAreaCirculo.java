
package Ejercicios;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args){
            
        Scanner input = new Scanner(System.in);
        
        //definir variables
        double radio, area;
        double PI = 3.14159;
    
        //leer el radio
        System.out.println("Ingrese el radio del circulo: ");
        radio = input.nextDouble();
        
        //calcular el area
        area = PI * radio * radio;
        
        //mostrar el resultado
        System.out.println("El area del circulo con radio " + radio + " es " + area);
    }
}
