package Conjuntos;

import java.util.Set;
import java.util.TreeSet;


/*
HashSet no garantiza el orden de los elementos.
LinkedHashSet mantiene el orden de inserción.
TreeSet ordena los elementos de acuerdo con su orden natural o con un comparador proporcionado.
*/
public class EjemploTreeSet {
    public static void main(String[] args) {
        // Crear un conjunto de TreeSet
        Set<String> conjunto = new TreeSet<>();

        // Agregar elementos al conjunto
        conjunto.add("Perro");
        conjunto.add("Gato");
        conjunto.add("Elefante");
        conjunto.add("Perro"); // Este elemento no se agregará ya que es duplicado

        // Imprimir elementos del conjunto
        System.out.println("Conjunto de animales: " + conjunto);

        // Verificar si el conjunto contiene un elemento
        boolean contieneGato = conjunto.contains("Gato");
        System.out.println("¿El conjunto contiene Gato? " + contieneGato);

        // Eliminar un elemento del conjunto
        conjunto.remove("Elefante");
        System.out.println("Conjunto después de eliminar Elefante: " + conjunto);

        // Recorrer el conjunto
        System.out.println("Recorrer el conjunto:");
        for (String animal : conjunto) {
            System.out.println(animal);
        }

        // Verificar el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del conjunto: " + tamaño);
    }
}

