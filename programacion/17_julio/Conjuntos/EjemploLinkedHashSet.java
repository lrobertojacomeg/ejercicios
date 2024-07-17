package Conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {
        // Crear un conjunto de LinkedHashSet
        Set<Integer> conjunto = new LinkedHashSet<>();

        // Agregar elementos al conjunto
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(10); // Este elemento no se agregará ya que es duplicado

        // Imprimir elementos del conjunto
        System.out.println("Conjunto de números: " + conjunto);

        // Verificar si el conjunto contiene un elemento
        boolean contiene20 = conjunto.contains(20);
        System.out.println("¿El conjunto contiene 20? " + contiene20);

        // Eliminar un elemento del conjunto
        conjunto.remove(30);
        System.out.println("Conjunto después de eliminar 30: " + conjunto);

        // Recorrer el conjunto
        System.out.println("Recorrer el conjunto:");
        for (int numero : conjunto) {
            System.out.println(numero);
        }

        // Verificar el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del conjunto: " + tamaño);
    }
}

