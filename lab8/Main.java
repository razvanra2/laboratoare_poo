import java.util.*;
public class Main {
    public static <T extends Sumabil> T addAll(Collection<T> c) {
        if (c.size() != 0) {
            int cnt = 0;
            T firstElement = (T)(c.toArray())[0];
            for(T e : c) {
                if(cnt!= 0)
                    firstElement.addValue(e);
                cnt++;
            }
            return firstElement;
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("=== EX 1 ===");
        MyHashMap<Student> myHashMap = new MyHashMap<Student>();
        myHashMap.put(new Student("Razvan", 10), "Razvan");
        myHashMap.put(new Student("Luca", 3), "Luca");
        myHashMap.put(new Student("Andrei", 2), "Andrei");
        myHashMap.put(new Student("Bogdan", 4), "Bogdan");
        myHashMap.put(new Student("Alex", 1), "Alex");

        Student myStudent = myHashMap.get("Razvan");
        System.out.println("Student is: " + myStudent.toString());

        System.out.println("=== EX 2 ===");
        MyMatrix m1 = new MyMatrix();
        MyMatrix m2 = new MyMatrix();

        int[][] _m1 = new int[4][4];
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                _m1[i][j] = i + j;
            }
        }
        int[][] _m2 = new int[4][4];
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                _m2[i][j] = i - j;
            }
        }

        m1.set(_m1);
        m2.set(_m2);

        Collection<MyMatrix> matrixCollection = new ArrayList<MyMatrix>();
        matrixCollection.add(m1);
        matrixCollection.add(m2);

        MyVector3 v1 = new MyVector3();
        MyVector3 v2 = new MyVector3();
        v1.set(1,2,3);
        v2.set(4,5,6);
        Collection<MyVector3> vectorCollection = new ArrayList<MyVector3>();
        vectorCollection.add(v1);
        vectorCollection.add(v2);
        m1 = addAll(matrixCollection);
        v1 = addAll(vectorCollection);
        v1.print();
        m1.print();
    }
}
