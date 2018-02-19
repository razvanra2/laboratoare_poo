public class Main{
    public static void main(String[] args) {
        System.out.println("***EX 1***");

        FirstTask task1 = new FirstTask("Hello, World!");
        SecondTask task2 = new SecondTask();
        ThirdTask task3 = new ThirdTask();

        task1.execute();
        task2.execute();
        task3.execute();

        System.out.println("***EX 2***");

        Queue myQueue = new Queue();
        myQueue.push(task1);
        myQueue.push(task2);
        myQueue.pop();
        myQueue.push(task3);
        myQueue.push(task1);
        Stack myStack = new Stack();
        myStack.transferFrom(myQueue);
        myStack.push(task1);
        myStack.push(task2);
        myStack.push(task3);
        myStack.pop();
        myStack.push(task2);

        System.out.println("***EX 3***");
        Container ifQ = IFactory.createContainer(Strategy.FIFO);
        Container ifS = IFactory.createContainer(Strategy.LIFO);

        System.out.println("***EX 4 & EX 5***");
        System.out.println("Creating task runner...");
        AbstractTaskRunner myTaskRunner =
        new AbstractTaskRunner(Strategy.FIFO);
        System.out.println("Adding tasks...");
        myTaskRunner.addTask(task1);
        myTaskRunner.addTask(task2);
        myTaskRunner.addTask(task3);
        System.out.println("Executing tasks...");
        myTaskRunner.executeAll();
    }
}
