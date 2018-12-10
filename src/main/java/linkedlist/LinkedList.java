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
        while (curr != null) {
            if (curr.next == null) {
                curr.next = newNode;

                break;
            }
            curr = curr.next;
        }

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
        while( curr != null ) {

            if( curr.next.data == value) {

                Node newNode = new Node(newVal);
                newNode.next = curr.next;
                curr.next = newNode;


                break;
            }
            curr = curr.next;
        }

    }

    public void insertAfter(int value, int newVal) {


        Node curr = this.head;
        while( curr != null ) {

            if( curr.data == value) {
                Node newNode = new Node(newVal);

                newNode.next = curr.next;
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

    public static LinkedList merge(LinkedList listA, LinkedList listB) {
        LinkedList answer = new LinkedList();
        if (listA.head == null && listB.head == null)
            return null;
        if (listA.head == null)
            return listB;
        if (listB.head == null)
            return listA;
        answer.head = listA.head;
        Node nextFromOne = listA.head.next;
        answer.head.next = listB.head;
        Node nextFromTwo = listB.head.next;
        Node lastInAnswer = answer.head.next;


        while(nextFromOne != null || nextFromTwo != null) {
            if(nextFromOne != null) {
                lastInAnswer.next = nextFromOne;
                lastInAnswer = lastInAnswer.next;
                nextFromOne = nextFromOne.next;
            }

            if(nextFromTwo != null) {
                lastInAnswer.next = nextFromTwo;
                lastInAnswer = lastInAnswer.next;
                nextFromTwo = nextFromTwo.next;
            }
        }
        return answer;
    }
}
