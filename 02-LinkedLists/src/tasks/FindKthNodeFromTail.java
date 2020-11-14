package tasks;

//TODO
// Finding the Kth node from the end in one pass where you don’t know the size of the list.

import utils.MyLinkedList;

public class FindKthNodeFromTail {
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
        System.out.println(findKthNodeFromTail(mylinkedList, 3).value);


    }

    public static MyLinkedList.Node findKthNodeFromTail(MyLinkedList listToExtractKthNode, int k) throws Exception {

        if (listToExtractKthNode.isEmpty()) throw new Exception("List is empty!");
        try {
            var kThPoint = listToExtractKthNode.first;
            var endPoint = listToExtractKthNode.first;
            int i = 0;

            while (i < k  || endPoint.next != null) {
                endPoint = endPoint.next;
                i++;
                if (i > k) {
                    kThPoint = kThPoint.next;
                }
            }
            return kThPoint;
        } catch (Exception e) {
            System.out.println("Your list size is lees than k, returning last Node in list");
            return listToExtractKthNode.last;
        }

    }

}
