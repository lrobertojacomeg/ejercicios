package Mapas;

import java.util.Map;
import java.util.TreeMap;

/*
HashMap no garantiza el orden de los elementos.
LinkedHashMap mantiene el orden de inserción.
TreeMap ordena los elementos de acuerdo con su orden natural o con un comparador proporcionado.
*/

public class EjemploTreeMap {
    public static void main(String[] args) {
        // Crear un mapa de TreeMap
        Map<String, Integer> mapa = new TreeMap<>();

        // Agregar elementos al mapa
        mapa.put("Rojo", 5);
        mapa.put("Verde", 10);
        mapa.put("Azul", 7);

        // Imprimir elementos del mapa
        System.out.println("Mapa de colores: " + mapa);

        // Obtener un valor del mapa
        int cantidadAzul = mapa.get("Azul");
        System.out.println("Cantidad de azul: " + cantidadAzul);

        // Verificar si el mapa contiene una clave
        boolean contieneRojo = mapa.containsKey("Rojo");
        System.out.println("¿El mapa contiene Rojo? " + contieneRojo);

        // Eliminar un elemento del mapa
        mapa.remove("Verde");
        System.out.println("Mapa después de eliminar Verde: " + mapa);

        // Recorrer el mapa
        System.out.println("Recorrer el mapa:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        // Verificar el tamaño del mapa
        int tamaño = mapa.size();
        System.out.println("Tamaño del mapa: " + tamaño);
    }
}

