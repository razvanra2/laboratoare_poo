package bash;

import java.nio.file.*;
import java.util.*;

public final class Bash {
    protected Path currentDirectory;
    protected StringBuffer history;

    protected CommandPublisher publisher;
    protected static final String EXIT = "exit";

    public Bash() {
        history = new StringBuffer();
        final String dir = System.getProperty("user.dir");
        currentDirectory = Paths.get(dir);

        publisher = new BashCommandPublisher();
        BashUtils.Echo myEcho = new BashUtils.Echo();
        publisher.subscribe(myEcho);

        BashUtils.Cd myCd = new BashUtils.Cd();
        publisher.subscribe(myCd);

        BashUtils.Ls myLs = new BashUtils.Ls();
        publisher.subscribe(myLs);

        BashUtils.History myHistory = new BashUtils.History();
        publisher.subscribe(myHistory);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine() ;

            if (input.equals("exit")) {
                break;
            } else {
                Bash thisBash = this;
                Thread thrd = new Thread() {
                    public void run() {
                        Command newCommand = new Command(input, thisBash);
                        publisher.publish(newCommand);
                    }
                };
                thrd.start();
            }
        }
    }

    class BashCommandPublisher implements CommandPublisher {
        ArrayList<CommandSubscriber> commandSubscribersList;
        BashCommandPublisher() {
            commandSubscribersList  = new ArrayList();
        }

        public void subscribe(CommandSubscriber subscriber) {
            commandSubscribersList.add(subscriber);
        }

        public void publish(Command command) {
            for (int i = 0; i < commandSubscribersList.size(); i++) {
                CommandSubscriber tempCommandRef =
                commandSubscribersList.get(i);
                tempCommandRef.executeCommand(command);
            }
        }

    }

}
