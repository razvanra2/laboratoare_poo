package observers;

/**
 * Observer that prints the game's world (the map with all the treasures,
 * heroes, obstacles)
 *
 */

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import entities.*;
import game.World;

public class WorldPrinter implements Observer {
	public static final int MAP_SIZE = 5;
	@Override
	public void update(Observable o, Object arg) {
		// TODO obtain the World's map, treasures and heroes
		// print the map
		// e.g.
		// 0  1  1  1  0
		// H  T  0  1  0
		// 0  0  T  0  0
		// 0  0  0  T  T
		// 0  T  0  0  0
		// T - treasure, H - hero, 1 - obstacle
		if (o instanceof World) {
			World w = (World) o;
			ArrayList<Hero> heroes = w.getParty();
			ArrayList<Treasure> treasures = w.getTreasures();
			int[][] map = w.getMap();

			for (Treasure treasure : treasures) {
				int tx = treasure.getPosx();
				int ty = treasure.getPosy();

				map[ty][tx] = 2;
			}

			for (Hero hero : heroes) {
				int hx = hero.getPosx();
				int hy = hero.getPosy();

				map[hx][hy] = 3;
			}

			for (int i = 0; i < MAP_SIZE; i++) {
				for (int j = 0; j < MAP_SIZE; j++) {
					if (map[i][j] == 0) {
						System.out.print(map[i][j] + " ");
					}
					if (map[i][j] == 1) {
						System.out.print(map[i][j] + " ");
					}
					if (map[i][j] == 2) {
						System.out.print("T ");
					}
					if (map[i][j] == 3) {
						System.out.print("H ");
					}
				}
				System.out.println();
			}

			for (int i = 0; i < MAP_SIZE; i++) {
				for (int j = 0; j < MAP_SIZE; j++) {
					if(map[i][j] == 2 || map[i][j] == 3) {
						map[i][j] = 0;
					}
				}
			}
		} else {
			return;
		}

	}

}
