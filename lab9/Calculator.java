public class Calculator {
    public static Integer add(Integer a, Integer b) {
        if (Integer.MAX_VALUE - a > b) {
            throw new OverflowException("overflow");
        }
        return a + b;
    }

    public static Integer divide(Integer a, Integer b) {
        return a/b;
    }

    public static Integer average(Collection<Integer> c) {
        Integer sum;
        for(Integer i : c) {
            sum = Calculator.add(sum, i);
        }
        sum = Calculator.divide(sum, c.size());

        return sum;
    }
}
