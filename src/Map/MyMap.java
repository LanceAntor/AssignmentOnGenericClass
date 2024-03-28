package Map;

import java.util.ArrayList;

public class MyMap<K, V> {
    ArrayList<K> keys;
    ArrayList<V> values;

    public MyMap(ArrayList<K> keys, ArrayList<V> values) {
        this.keys = keys;
        this.values = values;
    }

    public void put(K key, V value){
        int index = keys.indexOf(key);
        if(index != -1){
            values.set(index,value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }
    public V get(K key){
        int index = keys.indexOf(key);
        if (index != -1){
            return values.get(index);
        } else {
            return null;
        }
    }
    public V remove(K key){
        int index = keys.indexOf(key);
        if(index != -1){
            keys.remove(key);
            return values.remove(index);
        } else {
            return null;
        }
    }
}
