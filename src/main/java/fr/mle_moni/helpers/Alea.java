package fr.mle_moni.helpers;

import java.util.Random;

public final class Alea {
	private static Random random = new Random();

	public static int randomBetween(int min, int max) {
		return Alea.random.nextInt(max - min + 1) + min;
	}
}
