package strategies;

import entities.Monster;
import entities.Hero;
import entities.Treasure;
public class DefenseStrategy implements Strategy {

	//TODO Implement constructor with a Hero as argument
	Hero hero;
	public DefenseStrategy(Hero h) {
		hero = h;
	}
	public void attack(Monster m) {
		for (Treasure t : hero.getInventory()) {
			Monster target = hero.getTarget();
			if (t.getDamageType() == hero.getDamageType()) {
				hero.setHP(hero.getHP() +  t.getHpBoost());
				return;
			}
		}
		for (Treasure t : hero.getInventory()) {
			Monster target = hero.getTarget();
			if (t.getDamageType() == target.getWeakness()) {
				hero.setHP(hero.getHP() + hero.getBaseBoost());
				return;
			}
		}
//		hero.getTarget().setHP(hero.getTarget().getHP() - hero.getBaseDamage());
	}

}
