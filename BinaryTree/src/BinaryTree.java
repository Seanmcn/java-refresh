/**
 * Basic Binary Tree
 */
class BinaryTree {

    /**
     * The Root.
     */
    Node root;

    /**
     * Create node.
     *
     * @param key  the key
     * @param data the data
     */
    void createNode(int key, String data) {
        Node newNode = new Node(key, data);

        //  Root is null so newNode is root
        if (root == null) {
            this.root = newNode;
        } else {
            // Set currentNode to root as we start from here
            Node currentNode = root;
            // Setup parent to set later
            Node parent;

            // Loop through nodes until we find an empty currentNode
            while (true) {
                // Set parent to the current currentNode
                parent = currentNode;

                // If they key is less than the currentNode's key it belongs on the left
                if (key < currentNode.key) {

                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                // Otherwise the key belongs on the right
                else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * Gets node.
     *
     * @param key the key
     * @return the node
     */
    Node getNode(int key) {
        Node currentNode = root;
        while (currentNode.key != key) {

            // Search left?
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }

            // Fail-safe in case the key doesn't exist
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }

    /**
     * Traverse and print.
     * <p>
     * https://en.wikipedia.org/wiki/Tree_traversal#Pre-order
     * preOrder: starts with main node, cycles down on the left and then jumps up one parent at a time printing right.
     * inOrder: starts with smallest child and works its way up always printing next lowest value.
     * postOrder: starts with child on left, check left then right repeatedly.
     *
     * @param currentNode the current node
     * @param type        the type
     */
    void traverseAndPrint(Node currentNode, String type) {
        if (currentNode != null) {
            if (type.equals("preOrder")) {
                System.out.println(currentNode);
            }
            traverseAndPrint(currentNode.leftChild, type);
            if (type.equals("inOrder")) {
                System.out.println(currentNode);
            }
            traverseAndPrint(currentNode.rightChild, type);
            if (type.equals("postOrder")) {
                System.out.println(currentNode);
            }
        }
    }

}

/**
 * The Binary Tree Node.
 */
class Node {
    /**
     * The Key.
     */
    int key;
    private String data;

    /**
     * The Left child.
     */
    Node leftChild;
    /**
     * The Right child.
     */
    Node rightChild;

    /**
     * Instantiates a new Node.
     *
     * @param key  the key
     * @param data the data
     */
    Node(int key, String data) {
        this.key = key;
        this.data = data;
    }

    public String toString() {
        return key + " = " + data;
    }
}
