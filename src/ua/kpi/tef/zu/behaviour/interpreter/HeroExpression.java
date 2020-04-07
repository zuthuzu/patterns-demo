package ua.kpi.tef.zu.behaviour.interpreter;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class HeroExpression implements Expression {
	private String hero;

	public HeroExpression(String hero) {
		this.hero = hero.trim();
	}

	@Override
	public String interpret() {
		return hero;
	}
}
