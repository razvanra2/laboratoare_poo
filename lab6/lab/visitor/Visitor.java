package lab.visitor;

public interface Visitor {

    void visit(Employee e);

    void visit(Boss b);

    void visit(Intern i);
}
