
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Gradebook extends TreeMap<Integer, List<Student>> {

    public Gradebook(Comparator<Integer> comparator) {
        super(comparator);
    }

    public void add(Student student) {
        int medieRotunjita = Math.round(student.medie);
        List<Student> list;
        if (this.containsKey(medieRotunjita)) {
            list = this.get(medieRotunjita);
            list.add(student);
        } else {
            list = new ArrayList<>();
            list.add(student);
        }
        this.put(medieRotunjita, list);
    }
}
