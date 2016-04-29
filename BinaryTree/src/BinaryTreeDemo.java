/**
 * Basic Binary Tree Demo
 */
public class BinaryTreeDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BinaryTree Tree = new BinaryTree();

        Tree.createNode(99, "Ultralisk");
        Tree.createNode(30, "Queen");
        Tree.createNode(75, "Lurker");
        Tree.createNode(50, "Mutalisk");
        Tree.createNode(15, "Baneling");
        Tree.createNode(10, "Zergling");
        Tree.createNode(70, "Hydralisk");
        Tree.createNode(70, "Drone");

        System.out.println("-- In Order Traversal --\n");
        Tree.traverseAndPrint(Tree.root, "inOrder");

        System.out.println("\n-- Post Order Traversal --\n");
        Tree.traverseAndPrint(Tree.root, "postOrder");

        System.out.println("\n-- Pre Order Traversal --\n");
        Tree.traverseAndPrint(Tree.root, "preOrder");

        System.out.println("\n-- getNode(75) --");
        System.out.println(Tree.getNode(75));
    }
}
