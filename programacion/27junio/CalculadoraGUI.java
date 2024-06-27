import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JLabel lblResultado;

    public CalculadoraGUI() {
        // Configuración básica de la ventana
        setTitle("Calculadora Básica");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana en pantalla

        // Crear componentes
        txtNumero1 = new JTextField(10);
        txtNumero2 = new JTextField(10);
        btnSumar = new JButton("+ Sumar");
        btnRestar = new JButton("- Restar");
        btnMultiplicar = new JButton("* Multiplicar");
        btnDividir = new JButton("/ Dividir");
        lblResultado = new JLabel("Resultado:");

        // Layout de la ventana (usaremos BorderLayout para organizar los componentes)
        setLayout(new BorderLayout());

        // Panel para los campos de texto y los botones (en el centro de la ventana)
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(5, 2));
        panelCenter.add(new JLabel("Número 1:"));
        panelCenter.add(txtNumero1);
        panelCenter.add(new JLabel("Número 2:"));
        panelCenter.add(txtNumero2);
        panelCenter.add(btnSumar);
        panelCenter.add(btnRestar);
        panelCenter.add(btnMultiplicar);
        panelCenter.add(btnDividir);

        // Manejadores de evento para los botones
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("+");
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("-");
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("*");
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("/");
            }
        });

        // Panel para mostrar el resultado (en la parte inferior de la ventana)
        JPanel panelBottom = new JPanel();
        panelBottom.add(lblResultado);

        // Agregar paneles a la ventana
        add(panelCenter, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.SOUTH);
    }

    private void realizarOperacion(String operacion) {
        // Obtener números de los campos de texto
        try {
            double num1 = Double.parseDouble(txtNumero1.getText());
            double num2 = Double.parseDouble(txtNumero2.getText());
            double resultado = 0;

            // Realizar la operación según el botón presionado
            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(CalculadoraGUI.this,
                                "Error: División por cero no permitida.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }

            // Mostrar resultado en el JLabel
            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(CalculadoraGUI.this,
                    "Por favor ingresa números válidos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de CalculadoraGUI
        
        CalculadoraGUI calculadoraGUI = new CalculadoraGUI();
        calculadoraGUI.setVisible(true);
            
        
    }
}

