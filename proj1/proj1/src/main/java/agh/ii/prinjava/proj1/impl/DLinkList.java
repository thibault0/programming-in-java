package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> head;
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        Node(T elem){
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void addFirst(int T elem){
        Node<T> new_node = new Node<T>(T elem);

        if (isEmpty()){
            tail = new_node;
        }else {
            head.previous = new_node;
        }
        new_node.next = head;
        head = new_node;
        length++;
    }

    public void addEnd(int T elem){
        Node<T> new_node = new Node<T>(T elem);

        if (isEmpty()){
            head = new_node;
        }else {
            tail.next = new_node;
            new_node.previous = tail;
        }
        tail = new_node;
        length++;
    }

    public Node<T> removeFirst(){
        Node<T> temp = head;

        if (head == tail){
            tail == null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node<T> removeLast(){
        Node<T> temp = tail;

        if (head == tail){
            head == null;
        }else{
            head.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

}
