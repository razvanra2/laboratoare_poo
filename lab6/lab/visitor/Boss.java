package lab.visitor;

import java.util.LinkedList;

public class Boss extends Employee {
    protected float bonus;
    protected LinkedList<Visitable> subordinatesList;

    public Boss(final String name, final float salary, final float newBonus) {
        super(name, salary);
        this.bonus = newBonus;
        this.subordinatesList = new LinkedList<Visitable>();
    }

    public Boss(final String name,
                final float salary,
                final float extraHours,
                final float newBonus) {
        super(name, salary, extraHours);
        this.bonus = newBonus;
        this.subordinatesList = new LinkedList<Visitable>();
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(final float newBonus) {
        this.bonus = newBonus;
    }

    public final LinkedList<Visitable> getSubordinates() {
        return this.subordinatesList;
    }

    public final void addSubordinate(final Visitable subordinate) {
        subordinatesList.add(subordinate);
    }
    
    @Override
    public void accept(final Visitor v) {
        v.visit(this);
    }
}
