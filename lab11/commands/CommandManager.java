package commands;

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
public class CommandManager {

    Deque<Command> commandStack = new ArrayDeque<Command>();
    Deque<Command> redoStack = new ArrayDeque<Command>();
    // TODO
    /* - void undo()
       - void redo()
       - void executeCommand(Command c)
       - maybe check if undo() and redo() are available ?
             -> check GameState class, see the errors
       - keep track of the commands somehow
    */

    public void executeCommand(Command c) {
        commandStack.push(c);
        c.execute();
        redoStack.clear();
    }
    public void undo() {
        Command cmd = commandStack.pop();
        cmd.undo();
        redoStack.push(cmd);
    }
    public void redo() {
        Command cmd = redoStack.pop();
        cmd.execute();
        commandStack.push(cmd);
    }

    public boolean isUndoAvailable() {
        return !commandStack.isEmpty();
    }

    public boolean isRedoAvailable() {
        return !redoStack.isEmpty();
    }
}
