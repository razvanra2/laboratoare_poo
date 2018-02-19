package commands;

import entities.Hero;

public class MoveCommand implements Command {

	Hero hero;
	Hero.Direction direction;

	public MoveCommand(Hero hero, Hero.Direction direction) {
		this.hero = hero;
		this.direction = direction;
	}

	@Override
	public void undo() {
		if(direction == Hero.Direction.N) {
			hero.move(Hero.Direction.S);
		}
		if(direction == Hero.Direction.W) {
			hero.move(Hero.Direction.E);
		}
		if(direction == Hero.Direction.E) {
			hero.move(Hero.Direction.W);
		}
		if(direction == Hero.Direction.S) {
			hero.move(Hero.Direction.N);
		}

	}

	@Override
	public void execute() {
		hero.move(direction);
	}

    // TODO implement the move command
    /*  - MoveCommand(Hero, Direction)
        - void undo()
        - void execute()
        - maybe helper method for undo ?
    */
}
