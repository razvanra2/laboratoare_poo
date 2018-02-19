package lab.visitor;
import java.util.LinkedList;
/**
 * Visitor for tree traversal - separate the concerns: a visitor for data
 * operations (e.g. compute average percentage) and this visitor for traversing
 * the nodes and applying the operation visitor.
 */
class TreeVisitor implements Visitor {

    private Visitor baseVisitor;

    TreeVisitor(final Visitor newBaseVisitor) {
        this.baseVisitor = newBaseVisitor;
    }

    @Override
    public void visit(final Employee e) {
        System.out.println(e.getName());
    }

    @Override
    public void visit(final Boss b) {
        LinkedList<Visitable> hisSubordinates = b.getSubordinates();
        if (!hisSubordinates.equals(null)) {
            for (int i = 0; i < hisSubordinates.size(); i++) {
                Visitable tempRef = hisSubordinates.get(i);
                tempRef.accept(this);
            }
        }
        System.out.println(b.getName());

    }

    @Override
    public void visit(final Intern i) {
        System.out.println(i.getName());
    }

    public Visitor getBaseVisitor() {
        return baseVisitor;
    }
}
