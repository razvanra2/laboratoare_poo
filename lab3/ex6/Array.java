public class Array {
    static final int ERROR = Integer.MIN_VALUE;

    private int[] actualArray;

    public Array() {
        this(10);
    }

    Array(final int n) {
        actualArray = new int[n];
    }

    final int get(final int pos) {
        if (pos < 0 || pos >= actualArray.length) {
            return ERROR;
        }

        return actualArray[pos];
    }

    final int set(final int pos, final int val) {

        if (pos < 0 || pos >= actualArray.length) {
            return ERROR;
        }

        actualArray[pos] = val;

        return 0;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("[");

        for (int i = 0; i < actualArray.length; i++) {
            s.append(actualArray[i]).append(" ");
        }

        return s + "]";
    }

    public static void main(String[] args) {
        System.out.println("INH Q:");
        QueueInheritence QI = new QueueInheritence(5);
        QI.enqueue(1);
        QI.enqueue(2);
        QI.enqueue(3);
        QI.enqueue(4);
        QI.enqueue(5);
        QI.enqueue(6);
        System.out.println("Dequeuing one element");
        QI.dequeue();
        QI.enqueue(7);

        System.out.println("AGG Q:");
        AggregationQueue AQ = new AggregationQueue(5);
        AQ.enqueue(1);
        AQ.enqueue(2);
        AQ.enqueue(3);
        AQ.enqueue(4);
        AQ.enqueue(5);
        AQ.enqueue(6);
        System.out.println("Dequeuing one element");
        AQ.dequeue();
        AQ.enqueue(7);
    }
}

class QueueInheritence extends Array {
    private int capacity;
    private int front;
    private int rear;
    private int size;

    QueueInheritence(){
        super();
        this.capacity = 10;
        front = 0;
        rear = 9;
    }
    QueueInheritence(int newMax) {
        super(newMax);
        this.capacity = newMax;
        this.front = 0;
        this.rear = newMax - 1;
        this.size =  0;
    }

    boolean isFull() {
        return (this.size == this.capacity);
    }

    boolean isEmpty() {
        return (this.size == 0);
    }

    void enqueue(int item) {
        if (this.isFull()) {
            System.out.println("QUEUE IS FULL!");
        } else {
            this.rear = (this.rear + 1)%this.capacity;
            super.set(this.rear, item);
            this.size = this.size + 1;
            System.out.println("Enqueued " + item);
        }
    }

    int dequeue() {
        if(this.isEmpty()) {
            return ERROR;
        } else {
            int item = super.get(this.front);
            this.front = (this.front + 1)%this.capacity;
            this.size = this.size - 1;
            return item;
        }
    }
}

class AggregationQueue {
    private Array queueArray;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    AggregationQueue(){
        this.queueArray = new Array(10);
        this.capacity = 10;
        front = 0;
        rear = 9;
    }
    AggregationQueue(int newMax) {
        this.queueArray = new Array(newMax);
        this.capacity = newMax;
        this.front = 0;
        this.rear = newMax - 1;
        this.size =  0;
    }

    boolean isFull() {
        return (this.size == this.capacity);
    }

    boolean isEmpty() {
        return (this.size == 0);
    }

    void enqueue(int item) {
        if (this.isFull()) {
            System.out.println("QUEUE IS FULL!");
        } else {
            this.rear = (this.rear + 1)%this.capacity;
            queueArray.set(this.rear, item);
            this.size = this.size + 1;
            System.out.println("Enqueued " + item);
        }
    }

    int dequeue() {
        if(this.isEmpty()) {
            return queueArray.ERROR;
        } else {
            int item = queueArray.get(this.front);
            this.front = (this.front + 1)%this.capacity;
            this.size = this.size - 1;
            return item;
        }
    }
}
