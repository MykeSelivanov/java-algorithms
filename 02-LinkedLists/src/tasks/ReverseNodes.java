package tasks;

//TODO
// Reversing the nodes of a singly linked lists in one pass

import utils.MyLinkedList;

public class ReverseNodes {
    public static void main(String[] args) throws Exception {
        var mylinkedList = new MyLinkedList();
        mylinkedList.addLast(1);
        mylinkedList.addLast(2);
        mylinkedList.addLast("hey");
        mylinkedList.addFirst(345.6);
        mylinkedList.addFirst("123abc");
        mylinkedList.addLast("tree");
        System.out.println();

        mylinkedList.printLinkedList();
        reverseNodes(mylinkedList);
        mylinkedList.printLinkedList();


    }

    public static MyLinkedList reverseNodes(MyLinkedList listToReverse) throws Exception {

        if (listToReverse.isEmpty()) throw new Exception("List is Empty");
        if (listToReverse.first == listToReverse.last) throw new Exception("There is only 1 Node in the list, nothing to reverse");

        MyLinkedList.Node current = listToReverse.first;
        MyLinkedList.Node previous = null;
        MyLinkedList.Node subsequent;

        while (current != null) {

            subsequent = current.next;
            current.next = previous;
            previous = current;
            current = subsequent;

        }
        listToReverse.first = previous;

        return listToReverse;
    }

}
