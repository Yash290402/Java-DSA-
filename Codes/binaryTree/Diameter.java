
import java.util.*;

public class Diameter {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int lf = getHeight(root.left);
        int rf = getHeight(root.right);

        return Math.max(lf, rf) + 1;
    }

    public static int diameter(Node root) { // o(n^2)
        if (root == null) {
            return 0;
        }

        int ldiam = diameter(root.left);
        int rdiam = diameter(root.right);

        int lh = getHeight(root.left);
        int rh = getHeight(root.right);

        int selfdaimeter = lh + rh + 1;

        return Math.max(rdiam, Math.max(ldiam, selfdaimeter));

    }

    static class Info {
        int daim;
        int ht;

        public Info(int daim, int ht) {
            this.daim = daim;
            this.ht = ht;
        }
    }


    //this is better approach than above one because this help to reducs time complexity
    public static Info diameter2(Node root) {   //o(n)

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int daim = Math.max(Math.max(leftInfo.daim, rightInfo.daim), leftInfo.ht + rightInfo.ht + 1);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(daim, ht);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // int daimteroftree = diameter(root);
        // System.out.println(daimteroftree);

        
        System.out.println(diameter2(root).daim);
    }
}
