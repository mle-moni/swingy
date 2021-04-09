package fr.mle_moni.models;

public class Elf extends Hero {
	public Elf(String name, int mapSize) {
		super(name, "Elf");
		hp = 20;
		attack = 10;
		defense = 2;
		posX = mapSize / 2;
		posY = posX;
	}

	protected void levelUp() {
		super.levelUp();
		attack += 3;
		defense += 1;
		hp += 2;
	}
}
