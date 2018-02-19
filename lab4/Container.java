import java.util.*;
public interface Container {
    Task pop();
    void push(Task task);
    int size();
    boolean isEmpty();
    void transferFrom(Container container);
}

class Stack implements Container {
    ArrayList<Task> list = new ArrayList<Task>();

    public Task pop() {
        System.out.println("popping from queue...");
        int lastAddedPoz = list.size() - 1;
        Task popped = list.remove(lastAddedPoz);
        return popped;
    }

    public void push(Task newTask) {
        System.out.println("pushing in stack...");
        list.add(newTask);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return (list.size() == 0);
    }

    public void transferFrom(Container Container) {
        System.out.println("transfering elements...");
        while(Container.size() != 0) {
            Task temp = Container.pop();
            this.push(temp);
        }
    }
}

class Queue extends Stack {

    public Task pop() {
        System.out.println("popping from queue...");
        Task popped = list.remove(0);
        return popped;
    }

    public void push(Task newTask) {
        System.out.println("pushing in queue...");
        list.add(newTask);
    }
}
