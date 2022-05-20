package dictionaryelev;

import com.ibm.jvm.DumpConfigurationUnavailableException;

import java.util.ArrayList;

public class DictionaryArrayList<K, V> implements Dictionary<K, V> {

    private ArrayList<Item>[] dictionary;
    private int size;

    public DictionaryArrayList() {
        dictionary = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            dictionary[i] = new ArrayList<>();
        }
    }

    @Override
    public V get(K key) {
        V value = null;
        int i = key.hashCode() % dictionary.length;

        for (Item item : dictionary[i]) {
            if (item.key.equals(key))
                value = item.value;
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        V old = null;
        int i = key.hashCode() % dictionary.length;

        if (!isEmpty()) {
            for (Item item : dictionary[i]) {
                if (item.key.equals(key)) {
                    old = item.value;
                    item.value = value;
                }
            }
            dictionary[i].add(new Item(key, value));
            size++;
        } else {
            dictionary[i].add(new Item(key, value));
            size++;
        }

        return old;
    }

    @Override
    public V remove(K key) { //Fik en ConcurrencyModificationException.
        V old = null;
        Item toremove = null;
        boolean found = false;
        int i = key.hashCode() % dictionary.length;
        if (!isEmpty()) {
                for (Item item : dictionary[i]) {
                    if (item.key.equals(key)) {
                        old = item.value;
                        toremove = item;
                    }
                }
            if (toremove != null) {
                if(toremove.key.equals(key)){
                    dictionary[i].remove(toremove);
                    size--;
                }
            }
        }
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    private class Item {
        K key;
        V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
