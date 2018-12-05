package linkedlist;

import com.sun.jmx.snmp.SnmpMsg;
import linkedlist.Node;

import java.util.Iterator;


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
    public int kth_from_end (int k) {
        Node curr = head;
        int count = 0;
        int total = 0;
        int returnNum = 0;
        int target = 0;

        while (curr != null) {
            total++;
            curr = curr.next;
        }

        target = (total - k)-1;

        curr= head;
        while (curr != null) {
            if(target == count) {
                returnNum = curr.data;


            }

            count++;

            curr = curr.next;
        }

        return returnNum;

    }
//

}
