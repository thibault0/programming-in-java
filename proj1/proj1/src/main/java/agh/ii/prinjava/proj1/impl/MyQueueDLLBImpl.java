package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    public Queue() {
        front = null;
        rear = null;
    }

    @Override
    public void enqueue(E x) {

        Node<T> temp = new Node<T>(E x);
        if(isEmpty()) {
            front = temp;
        }else {
            rear.next = temp;
        }
        rear = temp;
        numOfElems()++;
    }

    @Override
    public E dequeue() {


        int result = front.E_x;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        numOfElems()--;
        return result;
    }

    @Override
    public int numOfElems() {
        return 0;
    }

    @Override
    public E peek() {
        throw new IllegalStateException("To be implemented");
    }
}
