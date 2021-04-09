package fr.mle_moni.controllers;

import fr.mle_moni.models.Elf;
import fr.mle_moni.models.Hero;
import fr.mle_moni.models.Map;

public class Game {
	private Hero hero;
	private Map map = new Map(1);

	public Game() {
		hero = new Elf("Adwonno", map.getMapSize());
		map.printMap(hero);
	}

}
