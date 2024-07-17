package Mapas;

import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        // Crear un mapa de LinkedHashMap
        Map<String, Integer> mapa = new LinkedHashMap<>();

        // Agregar elementos al mapa
        mapa.put("Perro", 1);
        mapa.put("Gato", 3);
        mapa.put("Elefante", 2);

        // Imprimir elementos del mapa
        System.out.println("Mapa de animales: " + mapa);

        // Obtener un valor del mapa
        int cantidadGatos = mapa.get("Gato");
        System.out.println("Cantidad de gatos: " + cantidadGatos);

        // Verificar si el mapa contiene una clave
        boolean contienePerro = mapa.containsKey("Perro");
        System.out.println("¿El mapa contiene Perro? " + contienePerro);

        // Eliminar un elemento del mapa
        mapa.remove("Elefante");
        System.out.println("Mapa después de eliminar Elefante: " + mapa);

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

