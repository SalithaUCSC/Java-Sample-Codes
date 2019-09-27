package datastructures.linkedlist;

public class IntLinkedList {

    private Node head;

    public IntLinkedList(int item){
        head = new Node();
        head.value = item;
        head.next = null;
    }

    class Node{
        private int value;
        private Node next;
    }
}
