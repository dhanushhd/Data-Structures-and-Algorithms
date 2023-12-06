package com.example.dhanush.dsa;

public class LinkedListDemo {

    class Node {
        String data;
        Node next = null;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head=null;


    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            System.out.println("head was null");
            return;
        }

        newNode.next = head; 
        head = newNode;
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        if(head == tail) {
            System.out.print("head and tail are equal for the data" + data);
            head.next = newNode;
            tail= newNode;  
        return;     }

        tail.next = newNode;
        tail = newNode;
    }

    Node tail;

    public void printlist() {
        if(head == null) {
            System.out.println("node is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->" );
            current = current.next;
        }

        System.out.println("Null");

        return;
        
    }

    // public static void main(String[] args) {
    //     LinkedListDemo link = new LinkedListDemo();
    //     link.addlast("dhanush");
    //     link.addlast("diganth");
    //     link.addFirst("rekha");
    //     link.printlist();
    // }


    
}
