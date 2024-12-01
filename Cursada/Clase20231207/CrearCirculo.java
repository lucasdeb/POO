package Clase20231207;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CrearCirculo extends JFrame {
    private int x, y;

    public CrearCirculo() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(x - 25, y - 25, 50, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CrearCirculo());
    }
}
