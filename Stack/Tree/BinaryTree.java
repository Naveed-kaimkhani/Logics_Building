public class BinaryTree {
    Object root;
    BinaryTree left, right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public Object getRight() {
        return right;
    }

    public Object getLeft() {
        return left;
    }

    public Object getRoot() {
        return root;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer("");
        if (left != null) {
            str.append(left + ",");
        }
        str.append(root);
        if (right != null) {
            str.append("," + right);

        }
        return str + "";
    }

    public static void main(String[] args) {

        BinaryTree treeD = new BinaryTree("D");

        BinaryTree treeE = new BinaryTree("E");
        BinaryTree treeB = new BinaryTree("B");
        BinaryTree treeC = new BinaryTree("C", treeD, treeE);
        BinaryTree tree = new BinaryTree("A", treeB, treeC);
        System.out.println(tree);
    }
}
