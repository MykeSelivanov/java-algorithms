package utils;

import tasks.FindKthNodeFromTail;
import tasks.ReverseNodes;

public class LinkedListAppRunner {
    public static void main(String[] args) throws Exception {

        var mylinkedList = new MyLinkedList();
        mylinkedList.addLast(1);
        mylinkedList.addLast(2);
        mylinkedList.addLast("hey");
        mylinkedList.addFirst(345.6);
        mylinkedList.addFirst("123abc");
        mylinkedList.addLast("tree");


        mylinkedList.printLinkedList();

        ReverseNodes.reverseNodes(mylinkedList);
        mylinkedList.printLinkedList();

        mylinkedList.printLinkedList();
        System.out.println(FindKthNodeFromTail.findKthNodeFromTail(mylinkedList, 1).value);




    }



}
