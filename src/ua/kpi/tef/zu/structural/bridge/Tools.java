package ua.kpi.tef.zu.structural.bridge;

/**
 * Created by Anton Domin on 2020-04-07
 */
class Drill extends Tool {
	public Drill(ToolGrade grade) {
		setBasePrice(800);
		setBaseWeight(2000);
		setGrade(grade);
	}
	@Override
	public String toString() {
		return "Drill{" +
				"livePrice=" + getLivePrice() +
				", liveWeight=" + getLiveWeight() +
				", grade=" + getGrade() +
				'}';
	}
}

class Hammer extends Tool {
	public Hammer(ToolGrade grade) {
		setBasePrice(200);
		setBaseWeight(1000);
		setGrade(grade);
	}
	@Override
	public String toString() {
		return "Hammer{" +
				"livePrice=" + getLivePrice() +
				", liveWeight=" + getLiveWeight() +
				", grade=" + getGrade() +
				'}';
	}
}


class Pliers extends Tool {
	public Pliers(ToolGrade grade) {
		setBasePrice(600);
		setBaseWeight(200);
		setGrade(grade);
	}
	@Override
	public String toString() {
		return "Pliers{" +
				"livePrice=" + getLivePrice() +
				", liveWeight=" + getLiveWeight() +
				", grade=" + getGrade() +
				'}';
	}
}
