package fr.mle_moni.models;

import fr.mle_moni.helpers.Alea;
import fr.mle_moni.helpers.NameGenerator;

public class Weapon extends Artefact {
	public Weapon(boolean b) {
		super("useless sword");
	}

	public Weapon() {
		super(NameGenerator.generateWeaponName());
		attack = Alea.randomBetween(1, 40);
	}
}
