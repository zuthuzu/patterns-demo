package ua.kpi.tef.zu.creation.singleton;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Anton Domin on 2020-03-18
 */
public class SingletonDemo {
	private static final int HOWMUCH = 100;

	private static class R implements Runnable {
		@Override
		public void run() {
			Singleton.getInstance();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread[] arr = new Thread[HOWMUCH];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Thread(new R());
			arr[i].start();
		}

		for (Thread thread : arr) {
			thread.join();
		}

		System.out.println(Singleton.getCounter());
	}
}
