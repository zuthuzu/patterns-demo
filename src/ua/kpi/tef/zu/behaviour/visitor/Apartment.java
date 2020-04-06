package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Apartment extends Place {
	private int fridge = 0;
	private String purity = "Messy";

	public int getFridge() {
		return fridge;
	}
	public void setFridge(int fridge) {
		this.fridge = fridge;
	}
	public String getPurity() {
		return purity;
	}
	public void setPurity(String purity) {
		this.purity = purity;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
		return "Apartment{" +
				"fridge=" + fridge + "% full" +
				", purity='" + purity + '\'' +
				'}';
	}
}
