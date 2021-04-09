package fr.mle_moni.models;

import fr.mle_moni.helpers.Alea;
import fr.mle_moni.helpers.NameGenerator;

public class Armor extends Artefact {

	public Armor(boolean b) {
		super("useless armor");
	}

	public Armor() {
		super(NameGenerator.generateArmorName());
		defense = Alea.randomBetween(1, 40);
	}
}
