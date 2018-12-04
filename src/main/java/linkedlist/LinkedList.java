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

    public void prepend(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = tail = newNode;
            curr = head;
        } else {
            head = new Node(value, head);
            curr = head;
        }

    }

    public void append(int value) {
        Node newNode = new Node(value, null);
        Node curr = head;
        while(curr!=null)
            if (curr.next == null) {
                curr.next = newNode;

            } else {
                curr = curr.next;
            }
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
    public void insertBefore(){

    }

}
