
import java.util.Comparator;

public class GpaComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (int) (o2 - o1);
    }
}
