import java.util.LinkedList;
import java.util.Queue;



public class preorder {

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

    static class BinaryTree {
        static int idx = -1;

        public static node buildtree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            node newnode = new node(node[idx]); // create root node
            newnode.left = buildtree(node); // recursively call buildtree method
            newnode.right = buildtree(node); // recursively call buildtree method

            return newnode;
        }

        public static void pretraversal(node root) { // preorder

            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            pretraversal(root.left);
            pretraversal(root.right);

        }

        public static void Inorder(node root) { // inorder

            if (root == null) {
                return;
            }

            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);

        }

        public static void postorder(node root) { // postorder

            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level order traversal

        public static void levelorder(node root) {
            if (root == null) {
                return;
            }

            Queue<node> q = new LinkedList<>();

            q.add(root); // adding root node
            q.add(null);

            while (!q.isEmpty()) {

                node currnode = q.remove();

                if (currnode == null) {

                    System.out.println();

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currnode.data + " ");

                    if (currnode.left != null) {
                        q.add(currnode.left);

                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {

        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        node root = tree.buildtree(node);
        // System.out.println(root.data);

        System.out.print("Preorder Traversal: ");
        tree.pretraversal(root);

        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.Inorder(root);

        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(root);

        System.out.println();

        System.out.println("Levelorder Traversal: ");
        tree.levelorder(root);
    }
}
