// MECE 603
// ID No. 202484848
// Description: Assignment 3 (Exercise 1.d) solution

public class Main {
    public static void main(String[] args) {
        /* Create new doubly linked list and fill it by different numbers */
        DoublyLL L1 = new DoublyLL();
        L1.insertFirst(17);
        L1.insertFirst(91);
        L1.insertLast(32);
        L1.insertLast(48);
        L1.insertFirst(55);
        L1.insertLast(69);
        L1.insertLast(77);

        /* Print this DoublyLL */
        System.out.print("Original List: ");
        L1.printList();

        /* Delete the first element */
        L1.deleteFirst();
        System.out.print("After deleting first: ");
        L1.printList();

        /* Delete the last element */
        L1.deleteLast();
        System.out.print("After deleting last: ");
        L1.printList();

        /* Create the second doubly linked list and fill it by different numbers */
        DoublyLL L2 = new DoublyLL();
        L2.insertFirst(85);
        L2.insertLast(24);
        L2.insertLast(145);

        /* Splice L2 into L1 after L1's head */
        L1.splice(L1.head, L2);
        System.out.print("After splicing L2 into original: ");
        L1.printList();

        /* Example of using remove range method */
        System.out.print("Before removing range: ");
        L1.printList();
        DoublyLL L3 = L1.removeRange(L1.head.next, L1.tail.prev);
        System.out.print("After removing range: ");
        L1.printList();
        System.out.print("New List (removed range): ");
        L3.printList();
    }
}