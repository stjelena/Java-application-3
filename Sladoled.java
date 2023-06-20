package sladoledi;

import java.util.ArrayList;

public class Sladoled {
	
	protected ArrayList<Ukus> ukusi;
	private int[] kolicine;
	private int velCase;
	private int popunjenostCase = 0;
	private int brUkusa = 0;
	private int trBrUkusa = 0;
	private boolean popunjenaCasa = false;
	
	public Sladoled(int velCase) {
		this.ukusi = new ArrayList<Ukus>();
		this.velCase = velCase;
	}
	
	public void dodajUkus(Ukus ukus, int kolicina) {
		if (!popunjenaCasa) {
			if (ukusi.contains(ukus)) {
				int kol = kolicine[ukusi.indexOf(ukus)];
				if ((popunjenostCase + kol) < velCase) {
					popunjenostCase += kol;
					kolicine[ukusi.indexOf(ukus)] += kolicina;
				}
				else {
					kolicine[ukusi.indexOf(ukus)] += velCase - popunjenostCase;
					popunjenostCase = velCase;
				}
			} 
			else {
			ukusi.add(ukus);
			if ((popunjenostCase + kolicina) < velCase) {
				popunjenostCase += kolicina;
				kolicine[trBrUkusa++] = kolicina;
			}
			else {
				kolicine[trBrUkusa++] = velCase - popunjenostCase;
				popunjenostCase = velCase;
			}
			brUkusa++;
			if (popunjenostCase == velCase)
				popunjenaCasa = true;
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(kolicine[0] + "ml" + ukusi.get(0).toString() + " ");
		for (int i = 1; i < ukusi.size(); i++) {
			sb.append(kolicine[i] + ukusi.get(i).toString()).append(" ");
		}
		return sb.toString();
	}

}
