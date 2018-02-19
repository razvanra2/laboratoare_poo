package entities;

import game.World;

public class Mage extends Hero {


    @Override
    public String toString() {
        String output = new String("");
        output += "Mage ";
        output += name + " ";
        output += posx + " " + posy;

        return output;
    }

    public void attack() {
        System.out.println("Mage attacking");
    }
}
//additional attack: magicAttack
