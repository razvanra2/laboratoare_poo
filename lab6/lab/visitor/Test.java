package lab.visitor;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;

public final class Test {

    private Test() {
    }

    private static void test1() {

        List<Employee> employees = new LinkedList<Employee>();
        employees.add(new Employee("Bob", 200));
        employees.add(new Employee("Trudy", 900));
        employees.add(new Boss("Alice", 10000, 42));

        Visitor v = new RevenueVisitor();
        for (Employee e : employees) {
            e.accept(v);
        }
    }

    private static void test2() {
        Boss ceo = new Boss("Dr", 10000, 2, 42);
        Boss boss = new Boss("River", 9000, 7, 20);

        boss.addSubordinate(new Employee("Amy", 2500, 10));
        boss.addSubordinate(new Employee("Rory", 2000, 5));

        ceo.addSubordinate(new Employee("Clara", 2200, 0));
        ceo.addSubordinate(boss);

        Visitor v = new RevenueVisitor();
        TreeVisitor treeVisitor = new TreeVisitor(v);
        ceo.accept(treeVisitor);

        MostHardworkingEmployeeFinder extraHoursVisitor =
        new MostHardworkingEmployeeFinder(treeVisitor);
        ceo.accept(extraHoursVisitor);

        System.out.format("The %s are the most hardworking\n",
                extraHoursVisitor.isBossHardWorking() ? "bosses " : "employees");
    }

    private static void test3() {
        Boss ceo = new Boss("Dr", 10000, 200, 42);
        Boss boss = new Boss("River", 9000, 7, 20);

        boss.addSubordinate(new Employee("Amy", 2500, 10));
        boss.addSubordinate(new Employee("Rory", 2000, 5));
        boss.addSubordinate(new Intern("Razvan", 6));
        ceo.addSubordinate(new Employee("Clara", 2200, 0));
        ceo.addSubordinate(boss);

        Visitor v = new RevenueVisitor();
        MostHardworkingEmployeeFinder extraHoursVisitor =
                new MostHardworkingEmployeeFinder(v);
        TreeVisitor treeVisitor = new TreeVisitor(v);
        ceo.accept(treeVisitor);
        ceo.accept(extraHoursVisitor);

        System.out.format("The %s are the most hardworking\n",
                extraHoursVisitor.isBossHardWorking()
                        ? "bosses "
                        : "employees");
    }

    private static void test4() {

        Path startingDir = Paths.get(".");
        FilesCounter counter = new FilesCounter();
    }

    public static void main(final String[] args) {

        System.out.println("---------- Ex. 1 ----------");
        test1();
        System.out.println("---------- Ex. 2 ----------");
        test2();
        System.out.println("---------- Ex. 3 ----------");
        test3();
        System.out.println("---------- Ex. 4 ----------");
        test4();
    }
}
