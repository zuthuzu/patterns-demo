package ua.kpi.tef.zu.structural.bridge;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class BridgeDemo {
	public static void main(String[] args) {
		ToolGrade grade;
		Tool tool;

		grade = new Budget();
		tool = new Drill(grade);
		System.out.println(tool);

		tool = new Pliers(grade);
		System.out.println(tool);

		grade = new Hardened();
		tool.setGrade(grade);
		System.out.println(tool);

		grade = new Portable();
		tool.setGrade(grade);
		System.out.println(tool);

	}
}
