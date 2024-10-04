public class DoublyLL {
    Node head;
    Node tail;

    DoublyLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int value) {
        Node x = new Node(value);
        if (head == null) {
            head = x;
            tail = x;
        } else {
            x.next = head;
            head.prev = x;
            head = x;
        }
    }

    public void insertLast(int value) {
        Node x = new Node(value);
        if (tail == null) {
            head = x;
        } else {
            x.prev = tail;
            tail.next = x;
        }
        tail = x;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public DoublyLL removeRange(Node x1, Node x2) {
        DoublyLL newList = new DoublyLL();
        newList.head = x1;
        newList.tail = x2;

        if (x1.prev != null) {
            x1.prev.next = x2.next;
        } else {
            head = x2.next;
        }

        if (x2.next != null) {
            x2.next.prev = x1.prev;
        } else {
            tail = x1.prev;
        }

        x1.prev = null;
        x2.next = null;

        return newList;
    }

    public void splice(Node x, DoublyLL L2) {
        if (L2.head == null) {
            return;
        }

        L2.tail.next = x.next;
        if (x.next != null) {
            x.next.prev = L2.tail;
        }

        x.next = L2.head;
        L2.head.prev = x;

        if (x == tail) {
            tail = L2.tail;
        }

        L2.head = null;
        L2.tail = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
