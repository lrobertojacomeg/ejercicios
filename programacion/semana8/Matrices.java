package Ejercicios;

public class Matrices {
    public static void main(String[] args){
        int[][] mimatriz = new int[2][2];
        
        mimatriz[0][0] = 0;
        mimatriz[0][1] = 1;
        mimatriz[1][0] = 2;
        mimatriz[1][1] = 3;
        
        System.out.println("El elemento [0][0] vale " + mimatriz[0][0]);
        System.out.println("El elemento [0][1] vale " + mimatriz[0][1]);
        System.out.println("El elemento [1][0] vale " + mimatriz[1][0]);
        System.out.println("El elemento [1][1] vale " + mimatriz[1][1]);        
    }
}
