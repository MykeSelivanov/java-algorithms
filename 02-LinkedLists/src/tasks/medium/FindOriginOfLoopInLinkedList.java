package tasks.medium;
// TODO Write a function that takes in the head of a Singly Linked List that contains a loop
//  (in other words, the list's tail node points to some node in the list instead of None / null).
//  The function should return the node (the actual node--not just its value) from which the loop originates in constant space.
//  Each LinkedList node has an integer value as well as a next node pointing to the next node in the list.
//  Input: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
//                             ^         V
//                             9 <- 8 <- 7
//  Output: the node with value 4

import utils.MyLinkedList;

public class FindOriginOfLoopInLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        var temp = myLinkedList.last;
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.last.next = temp;

        System.out.println(originOfTheLoopByDistance(myLinkedList).value);



    }

    // Based on distance method
    public static MyLinkedList.Node originOfTheLoopByDistance(MyLinkedList myLinkedList){

        var fast = myLinkedList.first;
        var slow = myLinkedList.first;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        slow = myLinkedList.first;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    // Using

}
