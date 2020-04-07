package ua.kpi.tef.zu.behaviour.interpreter;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class EncounterExpression implements Expression {
	private String hero1;
	private String hero2;
	private String keyword;

	public EncounterExpression(String hero1, String hero2, String keyword) {
		this.hero1 = hero1;
		this.hero2 = hero2;
		this.keyword = keyword;
	}

	@Override
	public String interpret() {
		return Expression.WIN_TERMS.contains(keyword) ? hero1 :
				Expression.LOSS_TERMS.contains(keyword) ? hero2 :
						hero1 + " with " + hero2;
	}
}
