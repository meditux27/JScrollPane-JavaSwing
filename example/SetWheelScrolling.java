package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetWheelScrolling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JScrollPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Crear un panel con la estructura FlowLayout para la distribución de los botones
        JPanel panel = new JPanel(new FlowLayout());
        
        JButton btn1 = new JButton("Enabled");
        btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog=new JDialog(frame,"setWheelScrolling",true);
				JTextArea textArea = new JTextArea(10, 20);
		        textArea.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");

		        JScrollPane scrollPane = new JScrollPane(textArea);
		        // Agregando el comportamiento para subir o bajar la barra con el scroll del mouse
				scrollPane.setWheelScrollingEnabled(true);				 
				dialog.add(scrollPane);
				 dialog.setSize(300,200);
				 dialog.setLocationRelativeTo(frame);
				dialog.setVisible(true);
				
				
			}
		});
        JButton btn2 = new JButton("Disabled");
        btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog2=new JDialog(frame,"setWheelScrolling.::Desactivado::.",true);
				JTextArea textArea2 = new JTextArea(10, 20);
		        textArea2.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");

		        JScrollPane scrollPane2 = new JScrollPane(textArea2);
		     // Agregando el comportamiento para subir o bajar la barra con el scroll del mouse
				scrollPane2.setWheelScrollingEnabled(false);				 
				dialog2.add(scrollPane2);
				 dialog2.setSize(300,200);
				 dialog2.setLocationRelativeTo(frame);
				dialog2.setVisible(true);
				
				
			}
		});
        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel);
        frame.setVisible(true);
    }
}
