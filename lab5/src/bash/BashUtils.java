package bash;

import java.nio.file.*;
import java.util.*;
import java.io.File;
enum Commands {
    CD("cd"),
    LS("ls"),
    ECHO("echo"),
    HISTORY("history");

    private final String text;

    Commands(final String newText) {
        this.text = newText;
    }

    @Override
    public String toString() {
        return text;
    }
}

public class BashUtils {

    // Implement some inner classes here: Echo, Cd, Ls, History
    static class Echo implements CommandSubscriber {
        Echo() {

        }
        public void executeCommand(Command c) {
            String commandText = c.getCommand();
            if (commandText.startsWith("echo ")) {
                System.out.println(commandText.substring(5));
            }
        }
    }

    static class Cd implements CommandSubscriber {
        Cd() {

        }
        public void executeCommand(Command c) {
            String commandText = c.getCommand();
            if (commandText.startsWith("cd ")) {
                Bash executingBash = c.getBash();
                if(commandText.substring(3).equals("..")) {
                    String newPath = executingBash.currentDirectory.toString();
                    int slashPos = newPath.lastIndexOf("/");
                    newPath = newPath.substring(0, slashPos);
                    executingBash.currentDirectory =
                    Paths.get(newPath);
                    System.out.println("Current path: " + newPath);
                } else {
                    File folder = executingBash.currentDirectory.toFile();
                    File[] listOfFiles = folder.listFiles();

                    for(int i = 0; i < listOfFiles.length; i++) {
                        if (!listOfFiles[i].isFile()) {
                            String tempName = listOfFiles[i].getName();
                            if(tempName.equals(commandText.substring(3))) {
                                String newPath = executingBash.currentDirectory
                                + "/" + commandText.substring(3);
                                executingBash.currentDirectory =
                                Paths.get(newPath);
                                System.out.println("Current path: " + newPath);
                            } else {
                                //System.out.println("Cannot cd");
                            }
                        } else {
                            //System.out.println("Cannot cd");
                        }
                    }
                }
            }
        }
    }

    static class Ls implements CommandSubscriber {
        Ls() {

        }
        public void executeCommand(Command c) {
            String commandText = c.getCommand();
            if (commandText.startsWith("ls")) {
                Bash executingBash = c.getBash();
                File folder = executingBash.currentDirectory.toFile();
                File[] listOfFiles = folder.listFiles();

                for(int i = 0; i < listOfFiles.length; i++) {
                    String tempName = listOfFiles[i].getName();
                    System.out.println(tempName);
                }
            }
        }
    }
    static class History implements CommandSubscriber {
        History() {

        }
        public void executeCommand(Command c) {
            String commandText = c.getCommand();
            Bash executingBash = c.getBash();
            executingBash.history.append(c.getCommand() + " | " );
            if (commandText.startsWith("history")) {
                System.out.println(executingBash.history);
            }
        }
    }
}
