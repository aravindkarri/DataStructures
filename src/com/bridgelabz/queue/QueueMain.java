package com.bridgelabz.queue;

public class QueueMain
{
    public static void main(String args[])
    {
        QueueService<Integer> queue = new QueueService<Integer>();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.print();
    }
}

