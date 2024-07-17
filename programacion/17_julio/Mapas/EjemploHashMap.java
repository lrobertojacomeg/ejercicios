package Mapas;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        // Crear un mapa de HashMap
        Map<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al mapa
        mapa.put("Manzana", 3);
        mapa.put("Banana", 2);
        mapa.put("Cereza", 5);

        // Imprimir elementos del mapa
        System.out.println("Mapa de frutas: " + mapa);

        // Obtener un valor del mapa
        int cantidadManzanas = mapa.get("Manzana");
        System.out.println("Cantidad de manzanas: " + cantidadManzanas);

        // Verificar si el mapa contiene una clave
        boolean contieneBanana = mapa.containsKey("Banana");
        System.out.println("¿El mapa contiene Banana? " + contieneBanana);

        // Eliminar un elemento del mapa
        mapa.remove("Cereza");
        System.out.println("Mapa después de eliminar Cereza: " + mapa);

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
