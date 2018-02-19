package lab.visitor;

//TODO make Intern visitable
public final class Intern implements Visitable{

    private String name;
    private int duration;  // in months
    private int salary;
    private int extraHours;

    public Intern(final String newName, final int newDuration) {
        this.name = newName;
        this.duration = newDuration;
        this.salary = 0;
        this.extraHours = 0;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getSalary() {
        return 0;
    }

    @Override
    public void accept(final Visitor v) {
        v.visit(this);
    }
}
