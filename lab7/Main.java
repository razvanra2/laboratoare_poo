
import java.util.*;

public class Main {

    public static void main(String[] args) {
        MySet mySet = new MySet();

//        mySet.add(new Student("Danut", 10f));
//        mySet.add(new Student("Andrei", 9f));
//        mySet.add(new Student("abc", 1f));
//        mySet.add(new Student("def", 7f));

        Set<Student> set = new LinkedHashSet<>();

//        set.add(new Student("Danut", 10f));
//        set.add(new Student("Andrei", 9f));
//        set.add(new Student("abc", 1f));
//        set.add(new Student("def", 7f));
//
//        for (Student student : set) {
//            System.out.println((Object)student.equals(student));
//        }

        Gradebook gradebook = new Gradebook(new GpaComparator());
        gradebook.add(new Student("danut", 10f));
        gradebook.add(new Student("Andrei", 9f));
        gradebook.add(new Student("bbc", 10f));
        gradebook.add(new Student("def", 10f));

//        for (Map.Entry<Integer, List<Student>> medie : gradebook.entrySet()) {
//            System.out.println(medie.getKey());
//        }

//        for (Map.Entry<Integer, List<Student>> medie : gradebook.entrySet()) {
//            System.out.println(medie.getKey());
//            Collections.sort(medie.getValue());
//            for (Student student : medie.getValue()) {
//                System.out.println(student.nume);
//            }
//        }

    }
}
