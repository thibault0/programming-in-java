package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> { /*It s a abstract class that is used to group related methods with empty bodies*/
    void enqueue(E x); /*use to add elemnts in the quueu */

    E dequeue(); /* use to to remove the element at the end of the queue*/

    default boolean isEmpty() {  /* use if there is no more place in the queue*/
        return numOfElems() == 0;
    }

    int numOfElems(); /*use to find the number of elements in the queue*/

    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
