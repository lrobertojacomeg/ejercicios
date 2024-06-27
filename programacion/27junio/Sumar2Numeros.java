import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sumar2Numeros extends JFrame {

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    private JLabel lblResultado;

    public Sumar2Numeros() {
        // Configuración básica de la ventana
        setTitle("Suma de Números");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana en pantalla

        // Crear componentes
        txtNumero1 = new JTextField(20);
        txtNumero2 = new JTextField(20);
        btnSumar = new JButton("Sumar");
        lblResultado = new JLabel("Resultado:");

        // Layout de la ventana (usaremos BorderLayout para organizar los componentes)
        setLayout(new BorderLayout());

        // Panel para los campos de texto y el botón (en el centro de la ventana)
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(3, 2));
        panelCenter.add(new JLabel("Número 1:"));
        panelCenter.add(txtNumero1);
        panelCenter.add(new JLabel("Número 2:"));
        panelCenter.add(txtNumero2);
        panelCenter.add(btnSumar);

        // Manejador de evento para el botón
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener números de los campos de texto
                try {
                    int num1 = Integer.parseInt(txtNumero1.getText());
                    int num2 = Integer.parseInt(txtNumero2.getText());

                    // Realizar la suma
                    int resultado = num1 + num2;

                    // Mostrar resultado en el JLabel
                    lblResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Sumar2Numeros.this,
                            "Por favor ingresa números válidos.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Panel para mostrar el resultado (en la parte inferior de la ventana)
        JPanel panelBottom = new JPanel();
        panelBottom.add(lblResultado);

        // Agregar paneles a la ventana
        add(panelCenter, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Crear una instancia de SumaGUI
        Sumar2Numeros sumaGUI = new Sumar2Numeros();
        
        // Hacer visible la ventana
        sumaGUI.setVisible(true);
    }
}
