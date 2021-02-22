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

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class FindOriginOfLoopInLinkedList {
    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        var temp = myLinkedList.last;
        myLinkedList.addLast(0);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.addLast(123);
        myLinkedList.last.next = temp;

        System.out.println(originOfTheLoopByDistance(myLinkedList).value);

        System.out.println(originOfTheLoopWithHashing(myLinkedList).value);



    }

    // Based on distance method
    public static MyLinkedList.Node originOfTheLoopByDistance(MyLinkedList listWithLoop) throws Exception {
        if (listWithLoop.isEmpty()) throw new Exception("List is Empty");
        if (listWithLoop.first == listWithLoop.last) throw new Exception("There is only 1 Node in the list");

        var fast = listWithLoop.first;
        var slow = listWithLoop.first;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        slow = listWithLoop.first;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    // Using hashing
    public static MyLinkedList.Node originOfTheLoopWithHashing(MyLinkedList listWithLoop){
        Set<MyLinkedList.Node> nodesSet = new HashSet<>();
        var pointer = listWithLoop.first;

        while (pointer.next != null){
            if(nodesSet.contains(pointer.next)) return pointer.next;
            nodesSet.add(pointer);
            pointer = pointer.next;
            }
        throw new NoSuchElementException("There is no loop in this List");
        }
    }


