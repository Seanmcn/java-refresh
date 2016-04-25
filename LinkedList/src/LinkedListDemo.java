/**
 * Demo for creating singly linked list.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToStart("GETS DELETED"); // Should be removed [2]
        list.addToStart("One");
        list.addToEnd(2);
        list.addToEnd("Three");
        list.addToEnd("Four");
        list.addToEnd(5);
        list.addToEnd("GETS DELETED"); // Should be removed [7]
        list.addToEnd(6);

        Object firstElement = list.getFirstElement();
        Object lastElement = list.getLastElement();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " +lastElement);

        list.remove(7);
        list.remove(2);

        System.out.println("\nThe List:");

        for(int i = 1; i < 7; i++) {
            Object current = list.getData(i);
            System.out.println(current);
        }
    }
}
