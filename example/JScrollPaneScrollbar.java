package example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JScrollPaneScrollbar {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Ejemplo de barras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        
    	JTextArea textArea = new JTextArea();
        textArea.setText("Este es un JTextArea con mucho texto que necesita desplazamiento vertical y horizontal.\n" +
                "Puedes usar los métodos setVerticalScrollBarPolicy() y setHorizontalScrollBarPolicy() para controlar las barras de desplazamiento.");

        JScrollPane scrollPane = new JScrollPane(textArea);
    //    JScrollPane scrollPane2 = new JScrollPane(textArea);
        JButton btn1=new JButton("SCROLLBAR_ALWAYS");
        btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
				JDialog dialog = new JDialog(frame, "SCROLLBAR_ALWAYS", true);
				dialog.setSize(600,200);
			
		        // Crear un JScrollPane y agregar el JTextArea como su vista
		        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		        
				dialog.add(scrollPane);
				dialog.setLocationRelativeTo(null);
				dialog.setVisible(true);
				
				
				
        
			}
		});
		
		  JButton btn2=new JButton("SCROLLBAR_NEVER"); 
		  btn2.addActionListener(new ActionListener() {
		  
		  @Override 
		  public void actionPerformed(ActionEvent e) {
		  
		  JDialog dialog2 = new JDialog(frame, "SCROLLBAR_NEVER", true);
		  dialog2.setSize(600,200);
		  
		  // Crear un JScrollPane y agregar el JTextArea como su vista
		  
		  scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		  scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		  
		  dialog2.add(scrollPane); 
		  dialog2.setLocationRelativeTo(null);
		  dialog2.setVisible(true);
		  
		  
		  } });
		  JButton btn3=new JButton("SCROLLBAR_AS_NEEDED"); 
		  btn3.addActionListener(new ActionListener() {
		  
		  @Override 
		  public void actionPerformed(ActionEvent e) {
		  
		  JDialog dialog3 = new JDialog(frame, "SCROLLBAR_AS_NEEDED", true);
		  dialog3.setSize(600,200);
		  
		  // Crear un JScrollPane y agregar el JTextArea como su vista
		  
		  scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		  scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		  
		  dialog3.add(scrollPane); 
		  dialog3.setLocationRelativeTo(null);
		  dialog3.setVisible(true);
		  
		  
		  } });
        
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.setVisible(true);
        

}
    }
