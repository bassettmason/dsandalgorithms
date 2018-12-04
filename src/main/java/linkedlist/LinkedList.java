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


        if (head == null) {
            head = tail = new Node(value, null);
            curr = head;
        }
        head = new Node(value, head);
        curr = head;


    }

    public void append(int value) {
        Node newNode = new Node(value, null);

        Node curr = head;
        while(curr!=null)
            if (curr.next == null) {
                curr.next = newNode;


            }
            curr = curr.next;

    }

    public boolean includes(int value) {
        Node curr = this.head;
        while(curr.next != null) {
            if (curr.data == value) {
                return true;
            }
            curr = curr.next;



        }
        return false;
    }
    public void print(){
        Node curr = this.head;
        while(curr != null){

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public void insertBefore(int value, int newVal) {

        while( curr.next != null ) {

            if( curr.next.equals(value)) {

                Node newNode = new Node(newVal, curr.next);
                curr.next = newNode;

                break;
            }


            curr = curr.next;
        }

    }

    public void insertAfter(int value, int newVal) {


        Node curr = head;
        while( curr.next != null ) {

            if( curr.equals(value)) {
                Node newNode = new Node(newVal, curr.next);
                curr.next = newNode;


                break;
            }


            curr = curr.next;
        }

    }

}
