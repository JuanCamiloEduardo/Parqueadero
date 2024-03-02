package Interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import System.Principal;

public class Entrada extends JFrame implements ChangeListener , ActionListener {
	private static JFrame frame ;
	private static JLabel TextoPlaca;
	private static JTextField Placa;
	private JCheckBox check1,check2;
	private static JButton button,button2,button3;
	private String tipo;
	
	public  Entrada()  {
		
		JPanel panel = new JPanel();

		frame = new JFrame();
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
	 	   button3 = new JButton("...");
	 	   button3.setBounds(230,10,20,20);
	 	   button3.addActionListener(this );
	 	   panel.add(button3);

	 	  
		
		TextoPlaca= new JLabel("Placa: ");
		TextoPlaca.setFont(new Font("Verdana", Font.PLAIN, 18));
		TextoPlaca.setBounds(10,10,125,50);
		panel.add(TextoPlaca);
		
		Placa = new JTextField();
		Placa.setBounds(95,10,110,40);
		panel.add(Placa);
		
		
         check1=new JCheckBox("Carro");
         check1.setBounds(10,80,150,30);
         check1.addChangeListener(this);
         panel.add(check1);
         
         check2=new JCheckBox("Moto");
         check2.setBounds(150,80,150,30);
         check2.addChangeListener(this);        
         panel.add(check2);
         
        button = new JButton("Entrada");
 		button.setBounds(10,120,80,40);
 		button.addActionListener(this );
 		panel.add(button);
 		
 	   button2 = new JButton("Salida");
 	   button2.setBounds(150,120,80,40);
 	   button2.addActionListener(this );
 	   panel.add(button2);
 	
		frame.setVisible(true);
		
	}
	public static void main (String args[]) {
		Entrada main = new Entrada();
		/*ViewTable prueba = new ViewTable();*/
		}
	
	public void actionPerformed(ActionEvent e) {
		String user = Placa.getText();
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Entrada")) {
			
			
	        if (check1.isSelected()==true) {
	            tipo ="Carro";
	            
	        }
	        if (check2.isSelected()==true) {
	            tipo ="Moto";
	          
	        } 
	        Principal.Entrada(user, tipo);
		}
		
		if (e.getActionCommand().equals("Salida")) {
			long precio=Principal.Salida(user);
			String format = String.format("A pagar: %,d $",precio);
			JOptionPane.showMessageDialog(null, format);
			
		}
		if (e.getActionCommand().equals("...")) {
			ViewTable prueba = new ViewTable() ;
		}
		if(!e.getActionCommand().equals("...")) {
		Placa.setText("");
		check1.setSelected(false);
		check2.setSelected(false);
		}
		
		/*
		 * 
		 * ((JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource())).dispose();
		 * Hace lo mismo que el dipose() pero sin necesidad de volver el Frame una instancia
		 * 
		 * */



		
	}

    public void stateChanged(ChangeEvent e){
        
        if (check1.isSelected()==true) {
            tipo ="Moto";
            check2.setSelected(false);
        }
        if (check2.isSelected()==true) {
            tipo ="Carro";
            check1.setSelected(false);
        } 
  
        
    }
}
