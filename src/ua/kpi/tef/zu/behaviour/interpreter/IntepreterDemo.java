package ua.kpi.tef.zu.behaviour.interpreter;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class IntepreterDemo {
	public static void main(String[] args) {
		String saga = "Guðmundr Arason killed Aron Hjörleifsson killed Guðni Jónsson " +
				"died to Magnús Finnbogason befriended Jón Jóhannesson conceded to Hervor, daughter of Angantyr";
		Narrator narrator = new Narrator();
		Expression outcome = narrator.evaluate(saga);
		System.out.println("Final hero: " + outcome.interpret());
	}
}
