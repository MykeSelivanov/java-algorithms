package utils;

import java.util.NoSuchElementException;
import java.util.Stack;

public class CustomQueue <T> {

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node front;
    private Node back;
    private int size;

    public boolean isEmpty(){
        return front == null;
    }

    public T peek(){
        if (isEmpty()) throw new NoSuchElementException();
        return front.value;
    }

    public int size(){
        return size;
    }

    public void enqueue(T item){
        var node = new Node(item);

        if (isEmpty()) {
            front = back = node;
        } else {
            back.next = node;
            back = node;
            back.next = null;
        }
        size++;
    }

    public T dequeue(){
        T t;
        if (isEmpty()) throw new  NoSuchElementException();

        if (front == back) {
            t = front.value;
            front = back = null;
        } else {
            t = front.value;
            var beforeFront = front.next;
            front.next = null;
            front = beforeFront;
        }
        size--;
        return t;
    }

    public void addfront(T item) {
        var node = new Node(item);
        if (isEmpty())
            front = back = node;
        else {
            node.next = front;
            front = node;
        }
        size++;
    }

    public void removeBack() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (front == back)
            front = back = null;
        else {
            var previous = getPrevious(back);
            back = previous;
            back.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = front;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void printQueue(){
        var node = front;
        while (node != null){
            if (node == back) {
                System.out.print(back.value);
            } else {
                System.out.print(node.value + " -> ");
            }
            node = node.next;
        }
    }

}
