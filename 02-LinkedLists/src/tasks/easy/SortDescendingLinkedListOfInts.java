package tasks.easy;

//TODO
//  Sort the singly linked list of integers in descending order without using any sort algorithm

import utils.MyLinkedList;

public class SortDescendingLinkedListOfInts {
    public static void main(String[] args) {
        var mylinkedList = new MyLinkedList();
        mylinkedList.addLast(4);
        mylinkedList.addLast(8);
        mylinkedList.addLast(11);
        mylinkedList.addLast(3);
        mylinkedList.addLast(9);
        mylinkedList.addLast(7);
        System.out.println();

        mylinkedList.printLinkedList();
        sortLinkedListDesc(mylinkedList);
        mylinkedList.printLinkedList();


    }

    public static void sortLinkedListDesc(MyLinkedList listToSort) {

        var current = listToSort.first;
        MyLinkedList.Node subsequent;
        Object temp;

        while (current != null) {
            subsequent = current.next;
            while (subsequent != null) {
                if ((Integer) subsequent.value > (Integer) current.value) {
                    temp = current.value;
                    current.value = subsequent.value;
                    subsequent.value = temp;
                }
                subsequent = subsequent.next;
            }
            current = current.next;
        }

    }
}
