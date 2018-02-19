package lab.visitor;

/**
 * Visitor for printing an employee's data. Applies the operation only on objects
 * that implement Visitable, currently Employee and Boss.
 */
class RevenueVisitor implements Visitor {

    @Override
    public void visit(final Employee e) {
        System.out.println(e.getName() + " " + e.getSalary());
    }

    @Override
    public void visit(final Boss b) {
        System.out.println(b.getName() + " " + (b.getSalary() + b.getBonus()));
    }

    @Override
    public void visit(final Intern i) {
        System.out.println(i.getName() + " " + i.getSalary());
    }
}
