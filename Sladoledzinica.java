package sladoledi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sladoledzinica extends Frame {
	
	private AparatZaTocenje aparat;
	Label naziv;
	TextField tfNaziv;
	Label boja;
	TextField tfBoja;
	Button dugmeDodajUkus;
	private Panel bottomPanel1 = new Panel();
	private Panel bottomPanel2 = new Panel();
	private Panel bottomPanel = new Panel();
	private Panel centerPanel = new Panel();
	
	public Sladoledzinica() {
		setBounds(700, 200, 500, 300);
		setResizable(false);
		setTitle("Sladoledzinica");
		populateWindow();
		pack();
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}

	private void populateWindow() {
		
		//aparat.setBackground(Color.LIGHT_GRAY);
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		centerPanel.add(aparat);
		
		add(centerPanel, BorderLayout.CENTER);
		
		dugmeDodajUkus.addActionListener((ae) -> {
		aparat.dodajUkus(tfNaziv.getText(), tfBoja.getText());
		});
		
		bottomPanel.add(new Label("Naziv: "));
		bottomPanel.add(tfNaziv);
		bottomPanel.add(new Label("Boja: "));
		bottomPanel.add(tfBoja);
		bottomPanel.add(dugmeDodajUkus);

		add(bottomPanel, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		new Sladoledzinica();
	}

}
