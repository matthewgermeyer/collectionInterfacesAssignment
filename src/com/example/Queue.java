package com.example;

import java.util.LinkedList;
import java.util.List;


public class Queue<E> {

    public List<E> qoo = new LinkedList<>();

    public void add(E e) {
        qoo.add(e);
    }

    public E remove() {
        if (qoo.isEmpty()) {
            return null;
        }
        return qoo.remove(0);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "qoo=" + qoo +
                '}';
    }
}
/*
In main call the method to write to the queue and then the method to read from the queue in a loop.

Queue is a linked list:

Linked List Methods ():

boolean	add(E e)
Appends the specified element to the end of this list.


void	add(int index, E element)
Inserts the specified element at the specified position in this list.

	remove()
Retrieves and removes the head (first element) of this list.

E	remove(int index)
Removes the element at the specified position in this list.

boolean	remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present.

E	removeFirst()
Removes and returns the first element from this list.
 */