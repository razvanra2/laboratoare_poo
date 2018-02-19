
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MySet {

    Set<Student> set = new LinkedHashSet<Student>();

    void add(Student student) {
        if (set.contains(student)) {
            System.out.println("Element deja existent in Set!");
        } else {
            set.add(student);
        }
    }
}
