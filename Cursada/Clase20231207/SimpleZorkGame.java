package Clase20231207;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleZorkGame extends JFrame {
    private JTextArea outputTextArea;
    private JTextField inputTextField;
    private JButton sendButton;

    private String currentRoom;
    private String[] rooms = { "Sala de estar", "Dormitorio", "Cocina", "Baño" };
    private String[] objects = { "Llave", "Libro", "Martillo", "Vaso" };

    public SimpleZorkGame() {
        currentRoom = rooms[0];

        setTitle("Simple Zork Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        inputTextField = new JTextField();
        inputPanel.add(inputTextField, BorderLayout.CENTER);

        sendButton = new JButton("Enviar");
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processCommand(inputTextField.getText());
                inputTextField.setText("");
            }
        });
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        updateOutput("Bienvenido a Simple Zork. Estás en la " + currentRoom + ".");

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void processCommand(String command) {
        updateOutput("> " + command);

        if (command.equalsIgnoreCase("norte") || command.equalsIgnoreCase("sur") ||
                command.equalsIgnoreCase("este") || command.equalsIgnoreCase("oeste")) {
            move(command.toLowerCase());
        } else if (command.equalsIgnoreCase("look")) {
            lookAround();
        } else if (command.equalsIgnoreCase("inventory")) {
            showInventory();
        } else {
            updateOutput("Comando no reconocido. Intenta 'norte', 'sur', 'este', 'oeste', 'look' o 'inventory'.");
        }
    }

    private void move(String direction) {
        switch (direction) {
            case "norte":
                currentRoom = rooms[0];
                break;
            case "sur":
                currentRoom = rooms[1];
                break;
            case "este":
                currentRoom = rooms[2];
                break;
            case "oeste":
                currentRoom = rooms[3];
                break;
        }
        updateOutput("Te moviste hacia el " + currentRoom + ".");
        lookAround();
    }

    private void lookAround() {
        updateOutput("Estás en la " + currentRoom + ".");
        updateOutput("Objetos en la habitación: " + String.join(", ", objects));
    }

    private void showInventory() {
        updateOutput("Inventario: No tienes ningún objeto en este juego simple.");
    }

    private void updateOutput(String message) {
        outputTextArea.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleZorkGame());
    }
}
