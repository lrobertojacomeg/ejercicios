package Estudiantes;

import java.util.ArrayList;
import java.util.List;

class Estudiante1 {
    private String nombre;
    private List<Double> calificaciones;

    public Estudiante1(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCalificacion(double calificacion) {
        this.calificaciones.add(calificacion);
    }

    public double obtenerPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    public void imprimirCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ": " + calificaciones);
        System.out.println("Promedio: " + obtenerPromedio());
    }
}

public class CalificarEstudiantes {
    public static void main(String[] args) {
        // Crear una lista de estudiantes
        List<Estudiante1> estudiantes = new ArrayList<>();

        // Agregar estudiantes a la lista
        Estudiante1 estudiante1 = new Estudiante1("Juan");
        estudiante1.agregarCalificacion(85.5);
        estudiante1.agregarCalificacion(90.0);
        estudiante1.agregarCalificacion(78.0);
        estudiantes.add(estudiante1);

        Estudiante1 estudiante2 = new Estudiante1("Maria");
        estudiante2.agregarCalificacion(92.0);
        estudiante2.agregarCalificacion(88.5);
        estudiante2.agregarCalificacion(95.0);
        estudiantes.add(estudiante2);

        Estudiante1 estudiante3 = new Estudiante1("Carlos");
        estudiante3.agregarCalificacion(70.0);
        estudiante3.agregarCalificacion(65.5);
        estudiante3.agregarCalificacion(80.0);
        estudiantes.add(estudiante3);

        // Imprimir las calificaciones de cada estudiante
        for (Estudiante1 estudiante : estudiantes) {
            estudiante.imprimirCalificaciones();
        }
    }
}
