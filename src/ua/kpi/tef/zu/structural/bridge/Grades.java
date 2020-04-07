package ua.kpi.tef.zu.structural.bridge;

/**
 * Created by Anton Domin on 2020-04-07
 */
class Budget implements ToolGrade {
	@Override
	public String getName() {
		return "Budget";
	}
	@Override
	public int calculatePrice(int price) {
		return (int) (price * 0.5);
	}
	@Override
	public int calculateWeight(int weight) {
		return (int) (weight * 1.1);
	}
}

class Portable implements ToolGrade {
	@Override
	public String getName() {
		return "Portable";
	}
	@Override
	public int calculatePrice(int price) {
		return (int) (price * 1.2);
	}
	@Override
	public int calculateWeight(int weight) {
		return (int) (weight * 0.7);
	}
}

class Hardened implements ToolGrade {
	@Override
	public String getName() {
		return "Hardened";
	}
	@Override
	public int calculatePrice(int price) {
		return (int) (price * 1.5);
	}
	@Override
	public int calculateWeight(int weight) {
		return (int) (weight * 1.8);
	}
}