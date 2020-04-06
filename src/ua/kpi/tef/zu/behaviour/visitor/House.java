package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class House extends Place {
	private int cellar = 0;
	private String lawn = "Overgrown";

	public int getCellar() {
		return cellar;
	}
	public void setCellar(int cellar) {
		this.cellar = cellar;
	}
	public String getLawn() {
		return lawn;
	}
	public void setLawn(String lawn) {
		this.lawn = lawn;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
		return "House{" +
				"cellar=" + cellar + "kg" +
				", lawn='" + lawn + '\'' +
				'}';
	}
}
