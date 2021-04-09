package fr.mle_moni.models;

public abstract class Hero {
	protected String name;
	protected String type; // hero class
	protected int level;
	protected int xp;
	protected int attack;
	protected int defense;
	protected int hp;
	protected int posX;
	protected int posY;

	private int xpNeeded;

	public Hero(String name, String type) {
		this.name = name;
		this.type = type;
		xp = 0;
		level = 1;
		xpNeeded = xpToLevelUp(1);
		posX = 0;
		posY = 0;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getLevel() {
		return level;
	}

	public int getXp() {
		return xp;
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

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int takeDammage(int dammage) {
		hp -= dammage;
		return hp;
	}

	// returns true if hero levels up
	public boolean gainXp(int xp) {
		int levelBefore = level;
		this.xp += xp;
		while (xp > xpNeeded) {
			levelUp();
		}
		return levelBefore != level;
	}

	private int xpToLevelUp(int lvl) {
		return lvl * 1000 + (lvl - 1) * 450;
	}

	protected void levelUp() {
		level++;
		xpNeeded = xpToLevelUp(level);
	}

}
