package hashtable;

public class HashNode<K,V> {

//from https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

    K key;
    V value;
    HashNode<K, V>next;
    public HashNode()
    {
        this.key=key;
        this.value=value;
    }



    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }



}
