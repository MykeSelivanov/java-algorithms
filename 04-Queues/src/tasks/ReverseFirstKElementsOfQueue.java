package tasks;

import utils.CustomQueue;

import java.util.Stack;

// TODO Given an integer K and a queue of integers, write code to reverse the order of the first K elements of the queue
//  -Input: Q= [10, 20, 30, 40, 50], K = 4
//  -Output: Q= [40,30, 20, 10,50]

public class ReverseFirstKElementsOfQueue {

    public static void main(String[] args) {

        CustomQueue myQueue = new CustomQueue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

       myQueue.printQueue();

       reverseFirstKElements(myQueue, 4);
        System.out.println();
       myQueue.printQueue();

    }

    public static CustomQueue reverseFirstKElements(CustomQueue queueToReverse, int k){
        if (k < 0 || k > queueToReverse.size())
            throw new IllegalArgumentException();

        Stack stack = new Stack();
        // Dequeue the first K elements from the queue
        // and push them onto the stack
        for (int i = 0; i < k; i++){
            stack.push(queueToReverse.dequeue());
        }
        // Enqueue the content of the stack at the
        // back of the queue
        while (!stack.isEmpty()){
            queueToReverse.enqueue(stack.pop());
        }
        // Add the remaining items in the queue (items
        // after the first K elements) to the back of the
        // queue and remove them from the beginning of the queue
        for (int i = 0; i < queueToReverse.size() - k; i++){
            queueToReverse.enqueue(queueToReverse.dequeue());
        }
        return queueToReverse;
    }

}
