package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MyLinkedList {

    public class Node {
        public Object value;
        public Node next;

        public Node(Object value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    public int size;

    public MyLinkedList() {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    public boolean isEmpty() { return first == null; }

    public int getSize() { return this.size; }

    public Node getPrevious(Node node) {
        if (isEmpty()) throw new NoSuchElementException("Your list is empty");
        if (first == node) throw new NoSuchElementException("There is no previous node for the first one");
        var current = first;
        var previous = first;
        while (current != null) {
            if (current == node) return previous;
            previous = current;
            current = current.next;
        }
        return previous;
    }

    public void addFirst(Object value){
        var node = new Node(value);
        System.out.println("Adding |" + value + "| as a first Node");
        if (isEmpty()) first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(Object value){
        var node = new Node(value);
        System.out.println("Adding |" + value + "| as a last Node");
        if (isEmpty()) first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Your list is empty");
        System.out.println("Deleting first Node |" + first.value + "|");
        if (first == last) first = last = null;
        else {
            var subsequent = first.next;
            first.next = null;
            first = subsequent;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Your list is empty");
        System.out.println("Deleting last Node |" + last.value + "|");
        if (first == last) first = last = null;
        else {
            var previous = first;
            var current = first;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            last = previous;
        }
        size--;
    }

    public int indexOf(Object item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(Object item){
        var current = first;
        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public List toArrayList() {
        if (isEmpty()) throw new NoSuchElementException("Your list is empty");
        List list = new ArrayList();
        var current = first;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list;
    }

    public void printLinkedList() {
        if (isEmpty()) throw new NoSuchElementException("Your list is empty");
        var current = first;
        while (current != null) {
            if (current.next == null) System.out.println("|" + current.value + "|");
            else {
                System.out.print("|" + current.value + "| -> ");
            }
            current = current.next;
        }
    }


}
