package observers;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import entities.*;
import game.World;
/**
 * Observer that prints the lore of a treasure when a hero discovers it.
 *
 */
public class TreasureDiscoverer implements Observer {


	public void update(Observable o, Object arg) {
		// TODO
		// check if any hero is in an area containing a treasure
		// print some message
		// remove treasure from map and
		// add to specific hero's inventory
		if (o instanceof World) {
			World w = (World) o;
			ArrayList<Hero> heroes = w.getParty();
			ArrayList<Treasure> treasures = w.getTreasures();

			for(Hero hero : heroes) {
				for(Treasure treasure : treasures) {
					int tx = treasure.getPosx();
					int ty = treasure.getPosy();

					int hx = treasure.getPosx();
					int hy = treasure.getPosy();

					if (tx == hx && ty == hy) {
						hero.collect(treasure);
						w.removeTreasure(treasure);
						break;
					}
				}
			}
		} else {
			return;
		}
	}
}
