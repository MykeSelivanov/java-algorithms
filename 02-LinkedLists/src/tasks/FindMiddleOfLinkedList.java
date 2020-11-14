package tasks;

import utils.MyLinkedList;

import java.util.ArrayList;
import java.util.List;

//TODO
// Find the middle of a linked list in one pass. If the list has an even number of nodes, there would be two middle
// nodes. (Note: Assume that you don’t know the size of the list ahead of time.)

public class FindMiddleOfLinkedList {
    public static void main(String[] args) {
        var mylinkedList = new MyLinkedList();
        mylinkedList.addLast(1);
        mylinkedList.addLast(2);
        mylinkedList.addLast(3);
        mylinkedList.addLast(4);
        mylinkedList.addLast(5);
        mylinkedList.addLast(6);
        mylinkedList.addLast(7);

        System.out.println();

        mylinkedList.printLinkedList();
        System.out.println(getMiddleNodes(mylinkedList));


    }

    public static List getMiddleNodes(MyLinkedList myLinkedList){
        List middleNodes = new ArrayList();

        var current = myLinkedList.first;
        var middle = myLinkedList.first;
        var preMiddle = myLinkedList.first;
        int i = 0;

        while (current != null) {
            current = current.next;
            i++;
            if (( i % 2) == 0 ) {
                preMiddle = middle;
                middle = middle.next;
            }
        }

        if (i % 2 == 0) {
            middleNodes.add(preMiddle.value);
            middleNodes.add(middle.value);
        }
        if (i % 2 == 1) {
            middleNodes.add(middle.value);
        }
        return middleNodes;
    }

}
