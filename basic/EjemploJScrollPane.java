package basic;

import javax.swing.*;

public class EjemploJScrollPane {
    public static void main(String[] args) {
    	  // Crear un JFrame
        JFrame frame = new JFrame("Ejemplo de JScrollPane");

        // Establecer el tamaño del JFrame
        frame.setSize(300, 200);
        
        //Establece la posición inicial al centro de la pantalla
        frame.setLocationRelativeTo(null);

        // Crear un JTextArea grande
        JTextArea textArea = new JTextArea(10, 20);
      

        // Agregar el JTextArea a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        //Agregando comportamiento opcional para que esten visibles las barras siempre
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        // Agregar el JScrollPane al JFrame
        frame.add(scrollPane);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar el JFrame
        frame.setVisible(true);
}
}