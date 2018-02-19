import java.util.Random;

public interface Task {
    void execute();
}

class FirstTask implements Task {
    String message;
    FirstTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Task1 message: " + this.message);
    }
}

class SecondTask implements Task {
    Integer randomNo;
    SecondTask() {
        Random generator = new Random();
        this.randomNo = generator.nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("Task 2 random: " + this.randomNo);
    }
}

class ThirdTask implements Task {
    int globalCounter = 0;

    @Override
    public void execute() {
        globalCounter++;
        System.out.println("Task 3 cnt: " + this.globalCounter);
    }
}
