package ua.kpi.tef.zu.structural.bridge;

/**
 * Created by Anton Domin on 2020-04-07
 */
public interface ToolGrade {
	String getName();
	int calculatePrice(int price);
	int calculateWeight(int weight);
}
