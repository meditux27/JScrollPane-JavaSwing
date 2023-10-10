package example;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class JScrollPanesetBorder {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Ejemplos para SetBorder");
		JPanel panel=new JPanel();
		
		frame.setSize(900,300);
		frame.setLocationRelativeTo(null);
		
		//Se crea el boton LineBorder
		JButton btnLineBorder=new JButton("LineBorder");
		btnLineBorder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frameLine=new JFrame("LineBorder");
				JTextArea area=new JTextArea();
				area.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");
				JScrollPane scroll=new JScrollPane(area);
				LineBorder border = new LineBorder(Color.BLUE, 5,true);
				scroll.setBorder(border);


				frameLine.add(scroll);
				frameLine.setSize(400,300);
				frameLine.setLocationRelativeTo(null);
				frameLine.setVisible(true);	

			}
		});
		
		//Se crea el boton EtchedBorder
		JButton btnEtchedBorder=new JButton("EtchedBorder");
		btnEtchedBorder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frameEtc=new JFrame("LineBorder");
				JTextArea area=new JTextArea();
				area.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");
				JScrollPane scroll=new JScrollPane(area);
				// Crear un borde en relieve (EtchedBorder) y establecerlo en el JScrollPane
				//  Border border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.BLUE);
				EtchedBorder border=new EtchedBorder( EtchedBorder.LOWERED,Color.BLUE,Color.green);
				scroll.setBorder(border);


				frameEtc.add(scroll);
				frameEtc.setSize(400,300);
				frameEtc.setLocationRelativeTo(null);
				frameEtc.setVisible(true);	

			}
		});

	//Se crea el boton EmptyBorder
		JButton btnEmptyBorder=new JButton("EmptyBorder");
		btnEmptyBorder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frameEmp=new JFrame("LineBorder");
				JTextArea area=new JTextArea();
				area.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");
				JScrollPane scroll=new JScrollPane(area);

				EmptyBorder emptyBorder = new EmptyBorder(10, 20, 10, 20);
				scroll.setBorder(emptyBorder);


				frameEmp.add(scroll);
				frameEmp.setSize(400,300);
				frameEmp.setLocationRelativeTo(null);
				frameEmp.setVisible(true);	

			}
		});

		//Se crea el boton BevelBorder
		JButton btnBevelBorder=new JButton("BevelBorder");
		btnBevelBorder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frameBev=new JFrame("BevelBorder");
				JTextArea area=new JTextArea();
				area.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");
				JScrollPane scroll=new JScrollPane(area);

				 BevelBorder border = new BevelBorder(BevelBorder.LOWERED,
			                Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW);
				scroll.setBorder(border);


				frameBev.add(scroll);
				frameBev.setSize(400,300);
				frameBev.setLocationRelativeTo(null);
				frameBev.setVisible(true);	

			}
		});
		
		//Se crea el boton TitledBorder
		JButton btnTitledBorder=new JButton("TitledBorder");
		
		btnTitledBorder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frameTit=new JFrame("TitledBorder");
				JTextArea area=new JTextArea();
				area.setText("Este es un JTextArea grande que requiere barras de desplazamiento.\n\nLorem Ipsum es simplemente el texto de relleno de las imprentas\n y archivos de texto. Lorem Ipsum ha sido el texto de relleno \nestándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó \nuna galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino \nque tambien ingresó como texto de relleno en documentos\n electrónicos, quedando esencialmente igual al original. Fue \npopularizado en los 60s con la creación de las hojas \"Letraset\", las \ncuales contenian pasajes de Lorem Ipsum, y más recientemente \ncon software de autoedición,\n como por ejemplo Aldus PageMaker, \nel cual incluye versiones de Lorem Ipsum.");
				JScrollPane scroll=new JScrollPane(area);
				
				 // Crear un TitledBorder personalizado
		        TitledBorder titledBorder = new TitledBorder("Panel con TitledBorder");
		        
				 // Configurar algunas propiedades del TitledBorder
		        titledBorder.setTitlePosition(TitledBorder.BOTTOM);
		        titledBorder.setTitleJustification(TitledBorder.LEFT);
		        titledBorder.setTitleColor(Color.BLUE);
		        Font customFont = new Font("Arial", Font.BOLD, 14);
		        titledBorder.setTitleFont(customFont);
		        titledBorder.setBorder(BorderFactory.createLineBorder(Color.RED));
//		        titledBorder.setTitlePad(10);

		        scroll.setBorder(titledBorder);
				frameTit.add(scroll);
				frameTit.setSize(400,300);
				frameTit.setLocationRelativeTo(null);
				frameTit.setVisible(true);	

			}
		});
		panel.add(btnLineBorder);
		panel.add(btnEtchedBorder);
		panel.add(btnEmptyBorder);
		panel.add(btnBevelBorder);
		panel.add(btnTitledBorder);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
