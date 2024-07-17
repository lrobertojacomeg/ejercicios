package Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        // Crear un conjunto de HashSet
        Set<String> conjunto = new HashSet<>();

        // Agregar elementos al conjunto
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Cereza");
        conjunto.add("Manzana"); // Este elemento no se agregará ya que es duplicado

        // Imprimir elementos del conjunto
        System.out.println("Conjunto de frutas: " + conjunto);

        // Verificar si el conjunto contiene un elemento
        boolean contieneBanana = conjunto.contains("Banana");
        System.out.println("¿El conjunto contiene Banana? " + contieneBanana);

        // Eliminar un elemento del conjunto
        conjunto.remove("Cereza");
        System.out.println("Conjunto después de eliminar Cereza: " + conjunto);

        // Recorrer el conjunto
        System.out.println("Recorrer el conjunto:");
        for (String fruta : conjunto) {
            System.out.println(fruta);
        }

        // Verificar el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del conjunto: " + tamaño);
    }
}

