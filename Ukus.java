package sladoledi;

import java.awt.Color;

public class Ukus {
	
	private Color boja;
	private String naziv;
	
	public Ukus(Color b, String n) {
		setBoja(b);
		setNaziv(n);
	}

	public Color getBoja() {
		return boja;
	}

	public void setBoja(Color boja) {
		this.boja = boja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.naziv == ((Ukus)obj).naziv)
			return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "[" + naziv + "]";
	}
	
	

}
