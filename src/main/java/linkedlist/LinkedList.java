package linkedlist;

import com.sun.jmx.snmp.SnmpMsg;
import linkedlist.Node;

public class LinkedList {
    public Node head;
    public Node tail;
    public Node curr;


    //create empty linked list
    public LinkedList() {
        this.head = null;


    }

    public void insert(int value) {
        Node curr = new Node (value, this.head);

        this.head = curr;

    }

    public boolean includes(int value) {
        Node current = this.head;
        while(current.next != null) {
            if (current.data == value) {
                return true;
            } else {
                current = current.next;

            }

        }
        return false;
    }
    public void print(){
        Node current = this.head;
        while(current.next != null){

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
