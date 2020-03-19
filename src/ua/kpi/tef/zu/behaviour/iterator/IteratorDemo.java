package ua.kpi.tef.zu.behaviour.iterator;

import java.util.Iterator;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Iterator<String> todo = new SurgeryIterator();

		while (todo.hasNext()) {
			System.out.println(todo.next());
		}
	}
}
