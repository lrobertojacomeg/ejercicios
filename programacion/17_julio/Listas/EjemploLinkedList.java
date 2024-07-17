package Listas;


import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Crear una lista de LinkedList
        LinkedList<Integer> lista = new LinkedList<>();

        // Agregar elementos a la lista
        lista.add(10);
        lista.add(20);
        lista.add(30);

        // Imprimir elementos de la lista
        System.out.println("Lista de números: " + lista);

        // Obtener el primer y el último elemento de la lista
        int primero = lista.getFirst();
        int ultimo = lista.getLast();
        System.out.println("Primer elemento: " + primero);
        System.out.println("Último elemento: " + ultimo);

        // Recorrer la lista
        System.out.println("Recorrer la lista:");
        for (int numero : lista) {
            System.out.println(numero);
        }

        // Eliminar el primer elemento de la lista
        lista.removeFirst();
        System.out.println("Lista después de eliminar el primer elemento: " + lista);

        // Verificar si la lista está vacía
        boolean estaVacia = lista.isEmpty();
        System.out.println("¿La lista está vacía? " + estaVacia);
    }
}
