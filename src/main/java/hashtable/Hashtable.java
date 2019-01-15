package hashtable;

import java.util.LinkedList;

import java.util.ArrayList;
// From https://github.com/ishaan007/Data-Structures/blob/master/HashMaps/HashNode.java
public class Hashtable<K, V> {


    public ArrayList<HashNode<K, V>>bucket=new ArrayList<>();

    int numBuckets=16;
    int size;

    public Hashtable() {
        for(int i=0;i<numBuckets;i++)
        {
            bucket.add(null);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int getHash(K key){
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;

    }

    private int getBucketIndex(K key) {
        int hashCod=key.hashCode();
        return hashCod%numBuckets;
    }

    public V find(K key) {
        int index=getBucketIndex(key);
        HashNode<K, V> head=bucket.get(index);
        while(head!=null) {
            if(head.key.equals(key))
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
//    public V remove(K key)
//    {
//        int index=getBucketIndex(key);
//        HashNode<K, V>head=bucket.get(index);
//        if(head==null)
//        {
//            return null;
//        }
//        if(head.key.equals(key))
//        {
//            V val=head.value;
//            head=head.next;
//            bucket.set(index, head);
//            size--;
//            return val;
//        }
//        else
//        {
//            HashNode<K, V>prev=null;
//            while(head!=null)
//            {
//
//                if(head.key.equals(key))
//                {
//                    prev.next=head.next;
//                    size--;
//                    return head.value;
//                }
//                prev=head;
//                head=head.next;
//            }
//            size--;
//            return null;
//        }
//    }
    public void add(K key,V value) {

        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);
        HashNode<K, V> toAdd = new HashNode<>();
        toAdd.key = key;
        toAdd.value = value;
        if (head == null) {
            bucket.set(index, toAdd);
            size++;

        } else {
            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value;
                    size++;
                    break;
                }
                head = head.next;
            }
            if (head == null) {
                head = bucket.get(index);
                toAdd.next = head;
                bucket.set(index, toAdd);
                size++;
            }
        }
        if ((1.0 * size) / numBuckets > 0.7) {
            //do something
            ArrayList<HashNode<K, V>> tmp = bucket;
            bucket = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            for (int i = 0; i < numBuckets; i++) {
                bucket.add(null);
            }
            for (HashNode<K, V> headNode : tmp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }


        }


    }

    public boolean contains(K key){
        int bucketIndex = getHash(key);
        HashNode<K, V> current = bucket.get(bucketIndex);

        while (current != null) {
            if (current.key.equals(key))
                return true;
            current = current.next;
        }
        return false;
    }
}
