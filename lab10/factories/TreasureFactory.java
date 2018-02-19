package factories;

import java.util.Random;

import entities.Treasure;


/**
 * Builds random treasure objects. Hides the treasure creation mechanism using
 * a factory method.
 *
 */
public class TreasureFactory {
	private final String [] names = {"Sword of Justice",
			"Leg of St Andrew",
			"Rabbit's Foot",
			"5-leaf Clover",
	"Shield of the Wise"};

	private final String [] lore = {"it looks quite old",
			"you've heard of this before",
	"tales of this legendary item are told in each tavern"};

	public static final TreasureFactory FACTORY = new TreasureFactory();

	private TreasureFactory() {

	}
	public Treasure createTreasure() {
		Random randomNumber = new Random();
		System.out.println("Creating treasure");
		int randInt1 = randomNumber.nextInt(4);
		int randInt2 = randomNumber.nextInt(2);
		System.out.println(randInt1 + " " + randInt2);
		String randName = names[randInt1];
		String randLore = lore[randInt2];
		return new Treasure(randName, randLore);
	}

	public static TreasureFactory getInstance() {
		return FACTORY;
	}
}
