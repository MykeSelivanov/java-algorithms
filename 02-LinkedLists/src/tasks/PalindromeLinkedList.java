package tasks;

//TODO
// Check the singly linked list if it is Palindrome (Without a stack)

import utils.MyLinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        var mylinkedList = new MyLinkedList();
        mylinkedList.addLast('c');
        mylinkedList.addLast('i');
        mylinkedList.addLast('v');
        mylinkedList.addLast('i');
        mylinkedList.addLast('c');

        mylinkedList.printLinkedList();

        System.out.println(checkIfLinkedListIsPalindrome(mylinkedList));


    }

    public static boolean checkIfLinkedListIsPalindrome(MyLinkedList listToCheck) {

        //get size of the list
        int size = listToCheck.getSize();

        //get the middle Node
        var middle = listToCheck.first;
        int iterations = size / 2;
        if (size % 2 == 0) iterations--;
        for (int i = 0; i < iterations; i++){
            middle = middle.next;
        }

        //reverse the List starting from the middle to point from tail to middle
        // in order to get first -> first.next -> middle <- last.next <- last
        var previous = middle;
        var current = middle;
        var subsequent = current.next;
        while (subsequent != null) {

            current = subsequent;
            subsequent = current.next;
            current.next = previous;
            previous = current;

        }

        //compare head vs tail till the middle
        var head = listToCheck.first;
        var tail = listToCheck.last;
        while (head != middle) {
            if (head.value == tail.value) {
                head = head.next;
                tail = tail.next;
                continue;
            }
            return false;
        }

        return true;
    }

}
