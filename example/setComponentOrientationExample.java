package example;
import javax.swing.*;
import java.awt.*;


public class setComponentOrientationExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JScrollPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setText("Este es un JTextArea grande \n que requiere barras de desplazamiento."
        		+ "\n \n setComponentOrientation() es un método utilizado en la clase JScrollPane\n"
        		+ "de Java Swing para establecer la orientación de los \n"
        		+ "componentes dentro del JScrollPane. \n"
        		+ "\n"
        		+ "La orientación de los componentes se refiere a cómo se disponen \n"
        		+ "y se ajustan los elementos dentro del JScrollPane, especialmente\n"
        		+ "en entornos de escritura de derecha a izquierda, \n"
        		+ "como el árabe o el hebreo.");
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Establecer la orientación de los componentes a RIGHT_TO_LEFT
        scrollPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        frame.add(scrollPane);
        frame.setVisible(true);
    }

	
}



