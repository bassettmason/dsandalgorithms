package linkedlist;

import com.sun.jmx.snmp.SnmpMsg;
import linkedlist.Node;

public class LinkedList {

    public Node head;




    //create empty linked list
    public LinkedList() {
        this.head = null;


    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;

        this.head = newNode;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        Node curr = head;
        while(curr!=null)
            if (curr.next == null) {
                curr.next = newNode;


            }
            curr = curr.next;

    }

    public boolean includes(int value) {
        Node curr = this.head;
        while(curr != null) {
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

            System.out.print(curr.data + "\n");
            curr = curr.next;
        }
    }
    public void insertBefore(int value, int newVal) {
        Node curr = this.head;
        while( curr.next != null ) {

            if( curr.next.equals(value)) {

                Node newNode = new Node(newVal);
                curr.next = newNode;

                break;
            }


            curr = curr.next;
        }

    }

    public void insertAfter(int value, int newVal) {


        Node curr = this.head;
        while( curr.next != null ) {

            if( curr.equals(value)) {
                Node newNode = new Node(newVal);
                curr.next = newNode;


                break;
            }


            curr = curr.next;
        }

    }

}
