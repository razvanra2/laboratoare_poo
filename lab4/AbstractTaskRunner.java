import java.text.SimpleDateFormat;
import java.util.Calendar;

class AbstractTaskRunner {
    Container myTaskContainer;
    int cnt;
    AbstractTaskRunner(Strategy chosenStrategy) {
        if(chosenStrategy == Strategy.FIFO) {
            myTaskContainer = IFactory.createContainer(Strategy.FIFO);
        } else {
            myTaskContainer = IFactory.createContainer(Strategy.LIFO);
        }
    }
    AbstractTaskRunner() {
        cnt = 0;
    }
    void addTask(Task newTask) {
        myTaskContainer.push(newTask);
    }
    void executeAll() {
        Atr2 CountTaskRunner = new Atr2();
        while(myTaskContainer.size() != 0) {
            Task tempTask = myTaskContainer.pop();
            tempTask.execute();
            Atr1.exectime();
            Atr3 whatever = new Atr3();
            CountTaskRunner.cnt();
        }
    }

    static void exectime(){}
}

class Atr1 extends AbstractTaskRunner {
    static void exectime() {
        Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println( "Task executed at: " +
            sdf.format(cal.getTime()) );
    }
}

class Atr2 extends AbstractTaskRunner {
    void cnt(){
        cnt++;
        System.out.println("Count Task Runner: " + cnt);
    }
}

class Atr3 extends Atr1 {
    Atr3() {
        try {
            Thread.sleep(1000); // miliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
