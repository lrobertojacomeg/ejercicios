package Listas;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear una lista de ArrayList
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        // Imprimir elementos de la lista
        System.out.println("Lista de frutas: " + lista);

        // Obtener un elemento de la lista
        String fruta = lista.get(1);
        System.out.println("Fruta en la posición 1: " + fruta);

        // Recorrer la lista
        System.out.println("Recorrer la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Eliminar un elemento de la lista
        lista.remove("Banana");
        System.out.println("Lista después de eliminar Banana: " + lista);

        // Verificar si la lista contiene un elemento
        boolean contieneCereza = lista.contains("Cereza");
        System.out.println("¿La lista contiene Cereza? " + contieneCereza);
    }
}

