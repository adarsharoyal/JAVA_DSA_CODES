    package DSA;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    class BinaryTree {
        Node root;

        public void insert(int data) {
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
            } else if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
            return root;
        }

        public void inorder() {
            inorderRec(root);
        }

        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }
    }

     class Tree {
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.insert(41);
            tree.insert(12);
            tree.insert(53);
            tree.insert(34);
            tree.insert(15);
            tree.insert(76);
            tree.inorder();
        }
    }
