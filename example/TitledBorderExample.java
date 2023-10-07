package example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TitledBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de TitledBorder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Crear un panel
        JPanel panel = new JPanel();
        
        // Texto del título
        TitledBorder titledBorder = new TitledBorder("Panel con TitledBorder");
        
        //Posición del título
        titledBorder.setTitlePosition(TitledBorder.BOTTOM);
        //Alineación del título
        titledBorder.setTitleJustification(TitledBorder.LEFT);
        //Color del título
        titledBorder.setTitleColor(Color.BLUE);
        //Fuente del título
        Font customFont = new Font("Arial", Font.BOLD, 14);
        titledBorder.setTitleFont(customFont);
        //Borde del título
        titledBorder.setBorder(BorderFactory.createLineBorder(Color.RED));


        // Establecer el TitledBorder en el panel
        panel.setBorder(titledBorder);

        frame.add(panel);
        frame.setVisible(true);
    }
}
