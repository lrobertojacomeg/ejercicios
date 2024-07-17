package Listas;


import java.util.List;
import java.util.ArrayList;

public class EjemploList {
    public static void main(String[] args) {
        // Crear una lista usando la interfaz List
        List<String> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");

        // Imprimir elementos de la lista
        System.out.println("Lista de colores: " + lista);

        // Obtener un elemento de la lista
        String color = lista.get(2);
        System.out.println("Color en la posición 2: " + color);

        // Recorrer la lista
        System.out.println("Recorrer la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Eliminar un elemento de la lista
        lista.remove("Verde");
        System.out.println("Lista después de eliminar Verde: " + lista);

        // Verificar el tamaño de la lista
        int tamaño = lista.size();
        System.out.println("Tamaño de la lista: " + tamaño);
    }
}

