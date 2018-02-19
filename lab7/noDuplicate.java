import java.util.*;

class NoDuplicateList {

    Collection names = new ArrayList();
    boolean add(String newName) {
        if(names.contains(newName)) {
            System.out.println("ERROR: NAME ALREADY IN LIST");
            return false;
        } else {
            names.add(newName);
            System.out.println("NAME " + newName + " ADDED");
        }
        return true;
    }
    public static void main(String[] args) {
        NoDuplicateList myList = new NoDuplicateList();
        boolean added;
        added = myList.add("Andrei");
        added = myList.add("Ion");
        added = myList.add("Dan");
        added = myList.add("Andrei");
        added = myList.add("Razvan");

    }
}
