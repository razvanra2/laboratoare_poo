
public class Student implements Comparable {
    String nume;
    float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return nume + " " + medie;
    }

    @Override
    public int hashCode() {
        int result = (int)(100 * medie);
        for (int i = 0; i < nume.length(); ++i) {
            result += nume.charAt(i);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return this.nume.compareTo(((Student)o).nume);
    }
}
