package fr.mle_moni.models;

import java.util.ArrayList;

import fr.mle_moni.helpers.Alea;

public class Map {
	// '-' = empty, 'o' = monster, 'x' = hero
	private ArrayList<ArrayList<Character>> map = new ArrayList<ArrayList<Character>>();

	private int mapSize;

	public Map(int heroLevel) {
		int loopTurnsWithoutMonsters = 0;
		mapSize = calculateMapSize(heroLevel);
		map.ensureCapacity(mapSize);
		for (int y = 0; y < mapSize; y++) {
			map.add(new ArrayList<Character>());
			map.get(y).ensureCapacity(mapSize);
			for (int x = 0; x < mapSize; x++) {
				loopTurnsWithoutMonsters++;
				char tile = '-';
				// n% chance to generate a monster on a tile
				int n = 0 + loopTurnsWithoutMonsters * 2;
				if (Alea.randomBetween(0, 100) < n) {
					tile = 'o';
					loopTurnsWithoutMonsters = 0;
				}
				map.get(y).add(tile);
			}
		}
	}

	private int calculateMapSize(int level) {
		return (level - 1) * 5 + 10 - (level % 2 == 1 ? 1 : 0);
	}

	public void printMap(Hero hero) {
		map.get(hero.getPosY()).set(hero.getPosX(), 'x');
		int mapSize = map.size();
		for (int y = 0; y < mapSize; y++) {
			for (int x = 0; x < mapSize; x++) {
				System.out.print(map.get(y).get(x) + " ");
			}
			System.out.println("");
		}
	}

	public int getMapSize() {
		return mapSize;
	}

}
