package lab.visitor;

public class Employee implements Visitable {
    protected String name;
    protected float salary;
    protected float extraHours;

    public Employee(final String newName, final float newSalary) {
        this.name = newName;
        this.salary = newSalary;
    }

    public Employee(final String newName, final float newSalary, final float newExtraHours) {
        this.name = newName;
        this.salary = newSalary;
        this.extraHours = newExtraHours;
    }

    public final String getName() {
        return name;
    }

    public final float getSalary() {
        return salary;
    }

    public final float getExtraHours() {
        return extraHours;
    }

    public final void setExtraHours(final int newExtraHours) {
        this.extraHours = newExtraHours;
    }

    @Override
    public void accept(final Visitor v) {
        v.visit(this);
    }
}
