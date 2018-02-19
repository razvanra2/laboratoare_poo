package strategies;

import entities.Hero;
import entities.Monster;
import entities.Treasure;

public class AttackStrategy implements Strategy {
    Hero hero;
	public AttackStrategy(Hero h) {
	    hero = h;
	}
	@Override
	public void attack(Monster m) {
	    for (Treasure t : hero.getInventory()) {
	        Monster target = hero.getTarget();
	        if (t.getDamageType() == hero.getDamageType()) {
	            target.setHP(target.getHP() - 3 * t.getDmg());
	            return;
	        }
	    }
	    for (Treasure t : hero.getInventory()) {
	        Monster target = hero.getTarget();
	        if (t.getDamageType() == target.getWeakness()) {
	            target.setHP(target.getHP() - 2 * t.getDmg());
	            return;
	        }
	    }
	    hero.getTarget().setHP(hero.getTarget().getHP() - hero.getBaseDamage());
	}

}
