package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class SleepingPod extends Place {
	private int soylentTank = 0;
	private String purity = "Biohazard";

	public int getSoylentTank() {
		return soylentTank;
	}
	public void setSoylentTank(int soylentTank) {
		this.soylentTank = soylentTank;
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
		return "SleepingPod{" +
				"soylentTank=" + soylentTank + "% full" +
				", purity='" + purity + '\'' +
				'}';
	}
}
