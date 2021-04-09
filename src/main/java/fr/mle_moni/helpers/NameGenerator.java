package fr.mle_moni.helpers;

public class NameGenerator {
	private static final String[] character = { "bloody", "good", "cool", "hard", "nice", "bad", "bald", "bold",
			"polite", "rude", "stressed", "cocky", "tall", "stupid", "clever", "1HEAD", "POGCHAMP", "rat", "gangster",
			"sheep slayer", "shark", "dog eater", "eagle eye", "rich", "capitalist" };
	private static final String[] vilainsNames = { "Bob", "Liam", "Noah", "Oliver", "Jean", "William", "Elijah",
			"James", "Benjamin", "Lucas", "Mason", "Ethan", "Alexander", "Henry", "Jacob", "Michael", "Daniel", "Logan",
			"Jackson", "Sebastian", "Jack", "Jones", "Aiden", "Owen", "Samuel", "Matthew", "Joseph", "Levi", "Mateo" };
	private static final String[] weaponsNames = { "boomerang", "bow", "spear", "dagger", "sabre", "sword",
			"tomahawk" };
	private static final String[] adjectives = { "red", "green", "blue", "dull", "shiny", "nice", "giant", "small",
			"cute", "flexible" };

	private static String generateFromArray(String[] arr) {
		return arr[Alea.randomBetween(0, arr.length - 1)];
	}

	public static String generateVilainName() {
		String name = NameGenerator.generateFromArray(NameGenerator.vilainsNames);
		name += " the " + NameGenerator.generateFromArray(NameGenerator.character);
		return name;
	}

	public static String generateWeaponName() {
		String name = NameGenerator.generateFromArray(NameGenerator.adjectives);
		name += " " + NameGenerator.generateFromArray(NameGenerator.weaponsNames);
		return name;
	}

	public static String generateArmorName() {
		String name = NameGenerator.generateFromArray(NameGenerator.adjectives);
		name += " armor";
		return name;
	}

	public static String generateHelmetName() {
		String name = NameGenerator.generateFromArray(NameGenerator.adjectives);
		name += " helmet";
		return name;
	}
}
