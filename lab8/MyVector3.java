public class MyVector3 implements Sumabil {
    int value1;
    int value2;
    int value3;

    MyVector3() {
        value1 = 0;
        value2 = 0;
        value3 = 0;
    }
    void set(int nv1, int nv2, int nv3) {
        value1 = nv1;
        value2 = nv2;
        value3 = nv3;
    }
    public void addValue(Sumabil other) {
        if(other instanceof MyVector3) {
            MyVector3 _other = (MyVector3) other;
            value1 += _other.value1;
            value2 += _other.value2;
            value3 += _other.value3;
        }
    }

    public void print() {
        System.out.println(value1 + " " + value2 + " " + value3);
    }
}
