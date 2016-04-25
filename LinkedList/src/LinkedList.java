/*
 * Creating a single linked list from scratch.
 */
public class LinkedList<AnyType> {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToStart(AnyType data) {
        Node current = this.getFirst();
        this.head = new Node(data, current);
    }

    public void addToEnd(AnyType data) {
        Node current = this.getLast();
        current.next = new Node(data, null);
    }

    public Node getFirst() {
        return this.head;
    }

    public Node getLast() {
        Node current = head;
        while (current.next != null)
            current = current.next;
        return current;
    }

    public Object getFirstElement() {
        Node first = this.getFirst();
        return first.data;
    }

    public Object getLastElement() {
        Node last = this.getLast();
        return last.data;
    }

    public Node get(int index) {
        if (index <= 0)
            return null;

        Node current = this.head;
        for (int i = 1; i < index; i++) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    public Object getData(int index) {
        Node current = this.get(index);
        return current.data;
    }

    public void remove(int index) {
        if (index <= 0) {
            return;
        }

        Node current = this.head;
        Node remove = this.get(index);

        for (int i = 1; i < index; i++) {
            if (current.next == null) {
                return;
            }
            if (current.next == remove) {
                current.next = remove.next;
                return;
            }
            current = current.next;
        }
    }

    private class Node {
        private AnyType data; // The data that is stored in this node, can be any type.
        private Node next; // The reference to the next node in the linked list.

        private Node(AnyType data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}