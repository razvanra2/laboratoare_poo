package lab.visitor;
import java.util.LinkedList;
/**
 * Visitor for finding if the average number of extra hours for bosses is higher
 * than the one for employees.
 * <p>
 * Interns are not taken into consideration.
 */
class MostHardworkingEmployeeFinder implements Visitor {
    private double employeesHours;
    private double bossesHours;
    private int employeesCnt;
    private int bossesCnt;

    private Visitor baseVisitor;

    MostHardworkingEmployeeFinder(final Visitor newBaseVisitor) {
        this.baseVisitor = newBaseVisitor;
        this.employeesHours = 0;
        this.bossesHours = 0;
        this.employeesCnt = 0;
        this.bossesCnt = 0;
    }

    @Override
    public void visit(final Employee e) {
        this.employeesCnt++;
        this.employeesHours += e.getExtraHours();
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
        this.bossesCnt++;
        this.bossesHours += b.getExtraHours();
    }

    @Override
    public void visit(final Intern i) {
        // nothing to do here, move along
    }

    public boolean isBossHardWorking() {
        double avgBossesHours = bossesHours / bossesCnt;
        double avgEmployeesHours = employeesHours / employeesCnt;
        System.out.println(avgBossesHours);
        System.out.println(avgEmployeesHours);
        if(avgEmployeesHours < avgBossesHours) {
            return true;
        }
        return false;
    }
}
