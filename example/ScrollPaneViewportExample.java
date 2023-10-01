package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollPaneViewportExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JScrollPane y Viewport");

        // Crear un JTextArea grande para demostración
        JTextArea textArea = new JTextArea(10, 30);
        for (int i = 1; i <= 100; i++) {
            textArea.append("Línea " + i + "\n");
        }

        // Crear un JScrollPane y agregar el JTextArea a él
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Crear un botón para mostrar el área de visualización actual
        JButton showViewportButton = new JButton("Mostrar Viewport");
        showViewportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el área de visualización (Viewport) del JScrollPane
                JViewport viewport = scrollPane.getViewport();
                //Muestra en un cuadro informativo las medidas de Viewport
                JOptionPane.showMessageDialog(frame, "Ancho del Viewport: " + viewport.getWidth() +
                        "\nAlto del Viewport: " + viewport.getHeight(), "Viewport Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar el JScrollPane y el botón al marco
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(showViewportButton, BorderLayout.SOUTH);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
