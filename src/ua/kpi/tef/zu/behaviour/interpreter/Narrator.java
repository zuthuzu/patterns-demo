package ua.kpi.tef.zu.behaviour.interpreter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Narrator {
	private List<Encounter> encounters = new ArrayList<>();

	private class Encounter {
		private int pos;
		private String keyword;

		public Encounter(int pos, String keyword) {
			this.pos = pos;
			this.keyword = keyword;
		}

		public int getPos() {
			return pos;
		}
		public String getKeyword() {
			return keyword;
		}

		@Override
		public String toString() {
			return "Encounter{" +
					"pos=" + pos +
					", keyword='" + keyword + '\'' +
					'}';
		}
	}

	public Expression evaluate(String saga) {
		Set<String> keywords = new HashSet<>();
		keywords.addAll(Expression.WIN_TERMS);
		keywords.addAll(Expression.LOSS_TERMS);
		keywords.addAll(Expression.BRO_TERMS);

		StringBuilder regex = new StringBuilder();
		keywords.forEach(w -> regex.append("(").append(w).append(")|"));
		regex.deleteCharAt(regex.length()-1);

		Matcher m = Pattern.compile(regex.toString()).matcher(saga);
		while (m.find()) encounters.add(new Encounter(m.start(), m.group()));
		encounters.forEach(System.out::println);
		//encounters.sort(Comparator.comparingInt(Encounter::getPos).reversed());
		//int firstkeyword = keywords.stream().map(saga::indexOf).mapToInt(i -> i).min().orElse(-1);
		if (encounters.isEmpty()) return new HeroExpression(saga);

		String currentHero = saga.substring(0, encounters.get(0).getPos()).trim();
		String nextHero;
		Expression resolution;
		Encounter thisEnc;
		int nextEncIndex;

		for (int i = 0; i < encounters.size(); i++) {
			thisEnc = encounters.get(i);
			nextEncIndex = (i == encounters.size() -1 ) ? saga.length() : encounters.get(i + 1).getPos();
			nextHero = saga.substring(thisEnc.getPos() + thisEnc.getKeyword().length(), nextEncIndex).trim();
			resolution = new EncounterExpression(currentHero, nextHero, thisEnc.keyword);
			currentHero = resolution.interpret();
			System.out.println("Current hero: " + currentHero);
		}

		return new HeroExpression(currentHero);
	}
}
