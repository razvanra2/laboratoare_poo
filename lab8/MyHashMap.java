import java.util.*;
import java.math.*;
public class MyHashMap <T> {

    Vector<Entry> map = new Vector<Entry>(100);
    MyHashMap() {
        for(int i = 0; i < 100; i++) {
            map.add(new Entry());
        }
    }

    class Entry {
        T data;
        String key;
        Entry() {
            this.key = "";
        }
        Entry(T newData, String newKey) {
            this.data = newData;
            this.key = newKey;
        }

        void put(T newData, String newKey) {
            this.data = newData;
            this.key = newKey;
        }

        String getKey() {
            return this.key;
        }
        T getData() {
            return this.data;
        }
    }


    void put(T element, String key) {
        int hashResult = Math.abs(element.hashCode() % 100);
        Entry temp = new Entry(element, key);
        map.add(hashResult, temp);
        System.out.println("Added new element in hashtable at position: " + hashResult);
    }

    T get(String key) {
        for(Entry e : map) {
            if (e.getKey().equals(key)) {
                return e.getData();
            }
        }
        return map.get(0).getData();
    }

}
