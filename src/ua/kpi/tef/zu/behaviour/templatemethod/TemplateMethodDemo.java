package ua.kpi.tef.zu.behaviour.templatemethod;

/**
 * Created by Anton Domin on 2020-04-06
 */
public class TemplateMethodDemo {
	public static void main(String[] args) {
		MachineSecurity procedure = new DrillHeadSecurity("Smith");
		procedure.shutDown();

		procedure = new ContainmentSecurity("Levenberg");
		procedure.shutDown();

	}
}
