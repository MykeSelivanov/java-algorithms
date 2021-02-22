package tasks.easy;

import utils.MyLinkedList;

import java.util.ArrayList;
import java.util.List;

// TODO You're given a head of a Singly Linked List whose nodes are in sorted order with respect to their values.
//  Write a function that returns a modified version of the Linked List that doesn't contain any nodes with duplicate values.
//  The Linked List should be modified in place (i.e. you shouldn't create a brand new list), and the modified Linked List
//  should still have its nodes sorted with respect to their values.
//  Each LinkedList node has an integer value as well as next node pointing to the next node in the list or to null if tail
//  Input: linkedList = 1 -> 1 -> 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6
//  Output: linkedList = 1 -> 3 -> 4 -> 5 -> 6
public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.addLast(1);
       myLinkedList.addLast(1);
       myLinkedList.addLast(3);
       myLinkedList.addLast(4);
       myLinkedList.addLast(4);
       myLinkedList.addLast(4);
       myLinkedList.addLast(5);
       myLinkedList.addLast(6);
       myLinkedList.addLast(6);
       myLinkedList.printLinkedList();


    }

    public static MyLinkedList removeDuplicatesFromLinkedList(MyLinkedList listWithDupes){

    }



}
