package ru.itis;

/**
 * 11.02.2019
 * PrimitiveMapImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class PrimitiveMapImpl<K, V> implements Map<K, V> {

    private static class Entry<E, Y> {
        E key;
        Y value;

        public Entry(E key, Y value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry entries[];
    private int count;

    public PrimitiveMapImpl() {
        entries = new Entry[10];
        count = 0;
    }

    @Override
    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);

        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        this.entries[count] = entry;
        count++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                return (V)entries[i].value;
            }
        }
        return null;
    }

}
