import java.util.LinkedList;
import java.util.Arrays;
public class MyHashTable<K, V> {

    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

}




