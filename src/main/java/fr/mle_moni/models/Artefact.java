package fr.mle_moni.models;

public abstract class Artefact {
	protected String name;
	protected int attack;
	protected int defense;
	protected int hp;

	public Artefact(String name) {
		this.name = name;
		attack = 0;
		defense = 0;
		hp = 0;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getHp() {
		return hp;
	}
}
