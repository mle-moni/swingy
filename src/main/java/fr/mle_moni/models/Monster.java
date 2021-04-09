package fr.mle_moni.models;

import fr.mle_moni.helpers.Alea;
import fr.mle_moni.helpers.NameGenerator;

public class Monster {
	private String name;
	private int hp;
	private int attack;
	private int defense;

	public Monster() {
		name = NameGenerator.generateVilainName();
		hp = Alea.randomBetween(5, 70);
		attack = Alea.randomBetween(1, 50);
		defense = Alea.randomBetween(0, 20);
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}
}
