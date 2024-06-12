import java.util.*;

public class heightofTree {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int getHeight(node root) {
        if (root == null) {
            return 0;
        }

        int lf = getHeight(root.left);
        int rf = getHeight(root.right);

        return Math.max(lf, rf) + 1;
    }

    public static int countofnode(node root) {
        if (root == null) {
            return 0;

        }

        int leftcount = countofnode(root.left);
        int rightcount = countofnode(root.right);

        return leftcount + rightcount + 1;
    }

    public static int sumofnode(node root) {
        if (root == null) {
            return 0;
        }

        int sumofleft = sumofnode(root.left);
        int sumofright = sumofnode(root.right);

        return sumofleft + sumofright + root.data;
    }

    public static void main(String[] args) {

        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);

        root.left.left = new node(4);
        root.left.right = new node(5);

        root.right.left = new node(6);
        root.right.right = new node(7);

        int height = getHeight(root);
        System.out.print(height);

        System.out.println();

        int count = countofnode(root);
        System.out.print(count);

        System.out.println();

        int sum=sumofnode(root);
        System.out.print(sum);

    }
}
