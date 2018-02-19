package factories;

import entities.*;

public class HeroFactory {

	public static final HeroFactory FACTORY = new HeroFactory();

	private HeroFactory() {
	}

	public Hero createHero(Hero.Type type) {
		if (type.equals(Hero.Type.PRIEST)) {
			return new Priest();
		}
		if (type.equals(Hero.Type.WARRIOR)) {
			return new Warrior();
		}
		if (type.equals(Hero.Type.MAGE)) {
			return new Mage();
		}

		return null;
	}

	public static HeroFactory getInstance() {
		return FACTORY;
	}
}
