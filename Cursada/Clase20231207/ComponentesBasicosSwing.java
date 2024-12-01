package Clase20231207;

import javax.swing.*;
import java.awt.*;

public class ComponentesBasicosSwing extends JFrame {
    public ComponentesBasicosSwing() {
        // Configuración del JFrame
        setTitle("Componentes Básicos de Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Creación de componentes básicos
        JButton boton = new JButton("Botón");
        JLabel etiqueta = new JLabel("Etiqueta");
        JTextField campoTexto = new JTextField("Campo de Texto");
        JTextArea areaTexto = new JTextArea("Área de Texto");
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        // Configuración del diseño del contenido
        setLayout(new FlowLayout());
        add(boton);
        add(etiqueta);
        add(campoTexto);
        add(scrollPane);

        // Hacer visible el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ComponentesBasicosSwing());
    }
}
