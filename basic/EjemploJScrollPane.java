package basic;

import javax.swing.*;

public class EjemploJScrollPane {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo de JScrollPane");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JTextArea textArea = new JTextArea(10, 30); // Crea un JTextArea con 10 filas y 30 columnas
            JScrollPane scrollPane = new JScrollPane(textArea); // Agrega el JTextArea a un JScrollPane

            frame.getContentPane().add(scrollPane); // Agrega el JScrollPane al contenido del JFrame

            frame.setVisible(true);
        });
    }
}
