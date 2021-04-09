package fr.mle_moni.models;

import fr.mle_moni.helpers.Alea;
import fr.mle_moni.helpers.NameGenerator;

public class Helmet extends Artefact {
	public Helmet(boolean b) {
		super("useless helmet");
	}

	public Helmet() {
		super(NameGenerator.generateHelmetName());
		hp = Alea.randomBetween(1, 70);
	}
}
