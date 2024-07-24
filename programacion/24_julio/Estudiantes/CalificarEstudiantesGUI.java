package Estudiantes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private List<Double> calificaciones;

    public Estudiante(String nombre) {
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

    public String obtenerCalificaciones() {
        return calificaciones.toString();
    }
}

public class CalificarEstudiantesGUI extends JFrame {
    private List<Estudiante> estudiantes;
    private JTextField nombreField;
    private JTextField calificacionField;
    private JTextArea resultadoArea;

    public CalificarEstudiantesGUI() {
        estudiantes = new ArrayList<>();

        setTitle("Calificar Estudiantes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior para ingresar datos
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(3, 2));

        panelSuperior.add(new JLabel("Nombre del Estudiante:"));
        nombreField = new JTextField();
        panelSuperior.add(nombreField);

        panelSuperior.add(new JLabel("Calificación:"));
        calificacionField = new JTextField();
        panelSuperior.add(calificacionField);

        JButton agregarButton = new JButton("Agregar Calificación");
        panelSuperior.add(agregarButton);

        JButton mostrarButton = new JButton("Mostrar Calificaciones");
        panelSuperior.add(mostrarButton);

        add(panelSuperior, BorderLayout.NORTH);

        // Área de texto para mostrar resultados
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        // Acción del botón agregar
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                double calificacion;
                try {
                    calificacion = Double.parseDouble(calificacionField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una calificación válida.");
                    return;
                }

                Estudiante estudiante = encontrarEstudiante(nombre);
                if (estudiante == null) {
                    estudiante = new Estudiante(nombre);
                    estudiantes.add(estudiante);
                }
                estudiante.agregarCalificacion(calificacion);

                nombreField.setText("");
                calificacionField.setText("");
                JOptionPane.showMessageDialog(null, "Calificación agregada.");
            }
        });

        // Acción del botón mostrar
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resultado = new StringBuilder();
                for (Estudiante estudiante : estudiantes) {
                    resultado.append("Nombre: ").append(estudiante.getNombre()).append("\n");
                    resultado.append("Calificaciones: ").append(estudiante.obtenerCalificaciones()).append("\n");
                    resultado.append("Promedio: ").append(estudiante.obtenerPromedio()).append("\n\n");
                }
                resultadoArea.setText(resultado.toString());
            }
        });
    }

    private Estudiante encontrarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalificarEstudiantesGUI().setVisible(true);
            }
        });
    }
}
