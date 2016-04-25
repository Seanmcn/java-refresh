/**
 * Demo for creating singly linked list.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToStart(2);
        list.addToStart("One");
        list.addToEnd("Three");
        list.addToEnd("Four");
        list.addToEnd(5);

        Object firstElement = list.getFirstElement();

        Object lastElement = list.getLastElement();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " +lastElement);


        Object One = list.get(1);
        Object Two = list.get(2);
        Object Three = list.get(3);
        Object Four = list.get(4);
        Object Five = list.get(5);

        System.out.println("\nThe List:");
        System.out.println(One);
        System.out.println(Two);
        System.out.println(Three);
        System.out.println(Four);
        System.out.println(Five);
    }
}
