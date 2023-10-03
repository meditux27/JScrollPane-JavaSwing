package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class CustomScrollBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Personalización de Barras de Desplazamiento");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");

        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();

        // Personalizar la apariencia de la barra de desplazamiento vertical
        verticalScrollBar.setBackground(Color.RED);
        
        verticalScrollBar.setPreferredSize(new Dimension(20, 0));

        // Personalizar el comportamiento de la barra de desplazamiento horizontal
        horizontalScrollBar.setUnitIncrement(20); // Cambia la cantidad de desplazamiento en píxeles
        
        horizontalScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Realiza acciones personalizadas cuando se ajusta la barra de desplazamiento horizontal
                System.out.println("Valor de la barra de desplazamiento horizontal: " + e.getValue());
            }
        });

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
}
