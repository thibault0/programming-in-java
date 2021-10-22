package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    public Stack() {
        top = null;
        length = 0;
    }

    @Override
    public E pop() {

        int result = top.E x;
        top = top.next;
        length--;
        return result;
    }

    @Override
    public void push(E x) {
        Node<T> temp = new Node<T>(E x);
        temp.next = top;
        top = temp;
        length++;

    }

    @Override
    public int numOfElems() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public E peek() {
        return top.E x;
    }
}
