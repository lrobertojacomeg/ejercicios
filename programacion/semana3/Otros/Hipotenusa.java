package Otros;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Valor cateto A: ");
        double a = input.nextDouble();
        System.out.println("Valor cateto B: ");
        double b = input.nextDouble();
    
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
    
        double c = Math.sqrt(a + b);
    
        System.out.println("Valor de la Hipotenusa: " +c);         
    }    
}
