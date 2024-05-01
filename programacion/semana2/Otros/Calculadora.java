/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otros;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}

