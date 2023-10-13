import java.util.*;
/*
 * Write a java program that maintains a separate linked list denoting marks of students from two divisions. Perform the following operations on Linked List: 

    Merge both the list 
    Sort 
    Minimum and maximum
    Split failed and passed 
    Count number of students getting above 90 marks
*/

public class Five {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(90);
        linkedList.add(98);
        linkedList.add(94);
        linkedList.add(33);
        linkedList.add(10 + 4);
        linkedList.add(20 + 4);
        linkedList.add(40 + 4);
        linkedList.add(90 + 4);
        linkedList.add(98 + 4);
        linkedList.add(94 + 4);
        linkedList.add(33 + 4);

        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.add(15);
        linkedList2.add(25);
        linkedList2.add(45);
        linkedList2.add(95);
        linkedList2.add(95);
        linkedList2.add(95);
        linkedList2.add(35);
        linkedList2.add(15 + 5);
        linkedList2.add(25 + 5);
        linkedList2.add(45 + 5);
        linkedList2.add(95 + 5);
        linkedList2.add(95 + 5);
        linkedList2.add(95 + 5);
        linkedList2.add(35 + 5);

        // Merge
        LinkedList<Integer> mergedList = (LinkedList<Integer>) linkedList.clone();
        mergedList.addAll(linkedList2);

        System.out.println(linkedList);
        System.out.println(linkedList2);
        System.out.println(mergedList);

        Collections.sort(mergedList);

        System.out.println("Min:" + mergedList.peekFirst());
        System.out.println("Max:" + mergedList.peekLast());

        LinkedList<Integer> passedCandidates = new LinkedList<Integer>();
        LinkedList<Integer> failedCandidates = new LinkedList<Integer>();

        for (int i : mergedList) {
            if (i < 40)
                failedCandidates.add(i);
            else
                passedCandidates.add(i);
        }

        System.out.println("Passed:" + passedCandidates);
        System.out.println("Failed:" + failedCandidates);

        LinkedList<Integer> toppers = new LinkedList<Integer>();
        for (int i : mergedList) {
            if (i > 90)
                toppers.add(i);
        }

        System.out.println("Num of Toppers: " + toppers.size());

    }
}