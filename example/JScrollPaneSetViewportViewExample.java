package example;

import javax.swing.*;


public class JScrollPaneSetViewportViewExample {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Ejemplo de JScrollPane con setViewportView()");

        // Establecer el tamaño del JFrame
        frame.setSize(200, 180);
        //Establece la posición de la ventana 
        frame.setLocationRelativeTo(null);

        // Crear un JTextArea grande
        JTextArea textArea = new JTextArea(10, 20);
        

        // Crear un JScrollPane y configurar el contenido con setViewportView()
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(textArea); // Establecer el JTextArea como contenido

        // Agregar el JScrollPane al JFrame
        frame.add(scrollPane);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar el JFrame
        frame.setVisible(true);
        
    }
}

