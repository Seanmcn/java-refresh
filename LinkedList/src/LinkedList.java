/**
 * The Singly linked list class
 */
class LinkedList {
    private Node head;

    /**
     * Instantiates a new Linked list.
     */
    LinkedList() {
        this.head = null;
    }

    /**
     * Add to the start of the linked list.
     *
     * @param data the data
     */
    void addToStart(Object data) {
        Node current = this.getFirst();
        this.head = new Node(data, current);
    }

    /**
     * Add to end of the linked list
     *
     * @param data the data
     */
    void addToEnd(Object data) {
        Node current = this.getLast();
        current.next = new Node(data, null);
    }

    private Node getFirst() {
        return this.head;
    }

    private Node getLast() {
        Node current = head;
        while (current.next != null)
            current = current.next;
        return current;
    }

    /**
     * Gets the first element in the linked list.
     *
     * @return the first element
     */
    Object getFirstElement() {
        Node first = this.getFirst();
        return first.data;
    }

    /**
     * Gets the last element in the linked list
     *
     * @return the last element
     */
    Object getLastElement() {
        Node last = this.getLast();
        return last.data;
    }

    private Node get(int index) {
        if (index <= 0) {
            return null;
        }

        Node current = this.head;
        for (int i = 1; i < index; i++) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * Gets the data from the linked list from an index.
     *
     * @param index the index
     * @return the data
     */
    Object getData(int index) {
        Node current = this.get(index);
        if (current != null) {
            return current.data;
        } else {
            return null;
        }
    }

    /**
     * Remove an element from the linked list by index.
     *
     * @param index the index
     */
    void remove(int index) {
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
}

/**
 * The type Node.
 */
class Node {
    /**
     * The data that is stored in this node, can be any type.
     */
    Object data;
    /**
     * The reference to the next node in the linked list.
     */
    Node next;

    /**
     * Instantiates a new Node.
     *
     * @param data the data
     * @param next the next
     */
    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}