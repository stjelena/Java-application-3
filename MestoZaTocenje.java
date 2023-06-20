package sladoledi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MestoZaTocenje extends Canvas implements Runnable {
	
	private AparatZaTocenje aparat;
	private Sladoled sladoled;
	private Thread nit;
	private boolean tocenjeUToku = false;
	private Button prodaj = new Button("Prodaj");
	int trX = this.getX();
	int trY = 0 - this.getY();
	Color trBoja;
	
	public MestoZaTocenje(AparatZaTocenje aparat) {
		this.aparat = aparat;
		this.setSize(aparat.getWidth()/3, aparat.getHeight()/3);
		this.setBackground(Color.LIGHT_GRAY);
		
		
		
	}

	public Sladoled getSladoled() {
		return sladoled;
	}
	
	public void crtajPravougaonik(int x, int y, Color boja) {
		Graphics g = this.getGraphics();
		g.drawRect(x, y, this.getWidth(), (int)(this.getHeight()*0.2));
		g.setColor(boja);
	}
	
	public void postaviTrBoju(Color boja) {
		trBoja = boja;
	}
	
	
	public void paint() {
		
		crtajPravougaonik(trX, trY, trBoja);
		trY = (int)(1.2*trY);
		
	}

	public void run() {
		
	}

}
