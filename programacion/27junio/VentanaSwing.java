package Otros;
import javax.swing.*;
import java.awt.event.*;

public class VentanaSwing {
    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de java Swing");
        // Establecer el tamaño de la ventana
        frame.setSize(600, 400);
        // Terminar el programa cuando se cierre la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un nuevo JPanel
        JPanel panel = new JPanel();

        // Crear una etiqueta de texto
        JLabel label = new JLabel("Introduce tu nombre:");

        // Agregar la etiqueta al panel
        panel.add(label);

        // Crear un campo de texto
        JTextField textField = new JTextField(15);

        // Agregar el campo de texto al panel
        panel.add(textField);

        // Crear un nuevo botón
        JButton button = new JButton("Saludar");

        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Este método se ejecutará cuando se haga clic en el botón
                String nombre = textField.getText();
                System.out.println("¡Hola, " + nombre + "!");
            }
        });

        // Agregar el botón al panel
        panel.add(button);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
