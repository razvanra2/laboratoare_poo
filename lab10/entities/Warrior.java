package entities;

import game.World;

public class Warrior extends Hero {


    @Override
    public String toString() {
        String output = new String("");
        output += "Warrior ";
        output += name + " ";
        output += posx + " " + posy;

        return output;
    }

    public void attack() {
        System.out.println("Warrior attacking");
    }
}
//additional attack: magicAttack
