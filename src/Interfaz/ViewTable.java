package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import System.Table;

public class ViewTable extends JFrame {
	
	private static JFrame frame ;
	
	public  ViewTable() {
		
	JPanel panel = new JPanel();

	frame = new JFrame();
	frame.setSize(400,200);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.add(panel);
	panel.setLayout(new FlowLayout());

    JTable table = new JTable(Table.changeArray(), Table.COLUMNAMES);
    table.setPreferredScrollableViewportSize(new Dimension(400, 200));
    table.setFillsViewportHeight(true);
    panel.add(new JScrollPane(table));

    frame.pack();
    frame.setVisible(true);
	}
	
}
