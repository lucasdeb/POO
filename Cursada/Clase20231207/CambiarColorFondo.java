package Clase20231207;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambiarColorFondo extends JFrame {
    public CambiarColorFondo() {
        JButton boton = new JButton("Cambiar Color");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED); // Puedes cambiar esto a cualquier color
            }
        });

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(boton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CambiarColorFondo());
    }
}
