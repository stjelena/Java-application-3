package sladoledi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AparatZaTocenje extends Panel {
	
	private MestoZaTocenje mesto;
	Panel ukusi;
	Button prodaj = new Button("Prodaj");
	Panel bottomPanel = new Panel();
	Panel rightPanel = new Panel();
	Panel leftPanel = new Panel(new GridLayout(0, 2));

	public AparatZaTocenje() {
		this.setBackground(Color.LIGHT_GRAY);
		populateWindow();
		
		setVisible(true);
	}
	
	private void populateWindow() {
		
		
		//DUGMICI ZA UKUSE

		
		//DONJI PANEL
		bottomPanel.add(new Label("Sladoled: " + this.mesto.getSladoled().toString()));
		
		
		
		//DESNI PANEL
		prodaj.setSize(mesto.getWidth(), mesto.getHeight()/2);
		prodaj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 
				//PRODAJ SLADOLED
			}
		});
		
		rightPanel.add(mesto, BorderLayout.SOUTH);
		rightPanel.add(prodaj, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);
		add(rightPanel, BorderLayout.EAST);
		add(leftPanel, BorderLayout.WEST);
		
	}
	
	public void dodajUkus(String naziv, String SBoja) {
		
		Color boja = Color.decode("0x"+SBoja);
		Ukus noviUkus = new Ukus(boja, naziv);
		
		if (!(mesto.getSladoled().ukusi.contains(noviUkus))) {
		
		Button newButton = new Button(naziv);
		newButton.setBackground(boja);
		leftPanel.add(newButton);
		
		//leftPanel.pack();
		
		newButton.addActionListener((ae) -> {
			mesto.getSladoled().dodajUkus(noviUkus, 20);
			mesto.postaviTrBoju(boja);
			repaint();
		});
		
		}
		
		
	}
	
}
