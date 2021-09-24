package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedListService;

public class QueueService<T extends Comparable<T>>
{
    LinkedListService<T> linkedList = new LinkedListService<T>();
    //enqueue internally call append method in linked list
    public void enQueue(T data)
    {
        linkedList.append(data);
    }
    //method to print the queue
    public void print()
    {
        linkedList.display();
    }
}
