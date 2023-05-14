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
    private int getIndex(K key) {
        int hashCode = key.hashCode(); // Get the hash code of the key
        int index = hashCode % table.length;
        return index;
    }
    public void put(K key, V value) {
        if (key == null) {
            return;
        }
        int index = getIndex(key);//Get the index of the bucket
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) { // Check if the key already exists in the bucket
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value of a key
                return;
            }
        }
        bucket.add(new Entry<K, V>(key, value)); // Add a new entry
        size++;
    }
    public void remove(K key) {
        if (key == null) {
            return;
        }
        int index = getIndex(key); // Get the index of the bucket
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry); // Remove the entry if the key is exists
                size--;
                return;
            }
        }
    }


}




