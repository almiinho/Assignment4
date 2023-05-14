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
    private static class Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public MyHashTable() {
        table = new LinkedList[14]; // Creates a table with 14 linked lists
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<Entry<K, V>>(); // Commence every linked list into array
        }
        size = 0;
    }

}




