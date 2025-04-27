import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tree_structure {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public tree_structure() {
        this.root = createTree();
    }

    public Node createTree() {
        Node nn = new Node();
        int item = sc.nextInt();
        nn.val = item;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }

        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        String s = "<--" + root.val + "-->";
        if (root.left != null) {
            s = root.left.val + s;
        } else {
            s = "." + s;
        }
        if (root.right != null) {
            s = s + root.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        display(root.left);
        display(root.right);
    }

    public boolean find(int tar) {
        return find(root, tar);
    }

    private boolean find(Node root, int tar) {
        if (root == null) {
            return false;
        }
        if (root.val == tar) {
            return true;
        }
        boolean left = find(root.left, tar);
        boolean right = find(root.right, tar);
        return left || right;
    }

    public int max() {
        return max(root);
    }

    private int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int l = max(root.left);
        int r = max(root.right);
        return Math.max(root.val, Math.max(l, r));
    }

    public void preOrder() {
        preOrder(root);
        System.out.println(); // Add new line after printing
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); // Added space between values
        preOrder(root.left);
        preOrder(root.right);
    }

    public void levelOrder() { // Changed return type to void
        levelOrder(root);
    }

    private void levelOrder(Node root) { // Changed return type to void
        if (root == null) return;

        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            Node rv = Q.poll();
            System.out.print(rv.val + " "); // Changed println to print with space
            if (rv.left != null) {
                Q.add(rv.left);
            }
            if (rv.right != null) {
                Q.add(rv.right);
            }
        }
        System.out.println(); // Add new line after printing
    }

    public int maxDepth() {
        return maxDepth(root);
    }

    private int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int lht = maxDepth(root.left);
        int rht = maxDepth(root.right);
        return Math.max(lht, rht) + 1;
    }
}