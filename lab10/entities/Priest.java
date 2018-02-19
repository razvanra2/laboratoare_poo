package entities;

import game.World;

public class Priest extends Hero {


    @Override
    public String toString() {
        String output = new String("");
        output += "Priest ";
        output += name + " ";
        output += posx + " " + posy;

        return output;
    }

    public void attack() {
        System.out.println("Priest attacking");
    }
}
//additional attack: magicAttack
