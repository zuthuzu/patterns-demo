package ua.kpi.tef.zu.structural.bridge;

/**
 * Created by Anton Domin on 2020-04-07
 */
public abstract class Tool {
	private int basePrice;
	private int baseWeight;
	private int livePrice;
	private int liveWeight;
	private ToolGrade grade;

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public void setBaseWeight(int baseWeight) {
		this.baseWeight = baseWeight;
	}
	public void setGrade(ToolGrade grade) {
		this.grade = grade;
		calculatePrice();
		calculateWeight();
	}
	public void calculatePrice() {
		livePrice = grade.calculatePrice(basePrice);
	}
	public void calculateWeight() {
		liveWeight = grade.calculateWeight(baseWeight);
	}

	public int getLivePrice() {
		return livePrice;
	}
	public int getLiveWeight() {
		return liveWeight;
	}
	public String getGrade() {
		return grade.getName();
	}
}
