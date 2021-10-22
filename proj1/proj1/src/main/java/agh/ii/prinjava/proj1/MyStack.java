package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> { /*It s a abstract class that is used to group related methods with empty bodies*/
    E pop(); /*use to remove the latest element entered in the stack*/

    void push(E x); /*use to add a new element in the stack*/

    default boolean isEmpty() { /*use when there is no more space in the stack*/
        return numOfElems() == 0;
    }

    int numOfElems(); /*number of elements in the stack*/

    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
