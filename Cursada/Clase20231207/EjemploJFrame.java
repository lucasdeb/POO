package Clase20231207;


import java.awt.FlowLayout;

import javax.swing.*;

public class EjemploJFrame {

    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo JFrame");

        // Configuración del JFrame
        frame.setSize(400, 300); // Establecer el tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Definir la operación de cierre
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        frame.setLayout(new FlowLayout()); // Establecer el diseño de la ventana (en este caso, FlowLayout)

        // Crear algunos componentes para agregar al JFrame
        JButton button = new JButton("Haz clic");
        JLabel label = new JLabel("Hola, mundo!");

        // Agregar componentes al JFrame
        frame.add(button);
        frame.add(label);

        // Hacer visible el JFrame
        frame.setVisible(true);

        // Ejemplo de uso de JOptionPane
        JOptionPane.showMessageDialog(frame, "Hola, mundo!");
        
    }
}
