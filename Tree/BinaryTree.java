// tree is full or not
//swap left right
//findout the right most node of left tree
//findout left most node of right sub tree
//
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
    public String toString() {  //Inorder
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

    public static void preOrder(BinaryTree BTree) {
        if (BTree==null) {
                return;
        }

        System.out.println(BTree.root);
        preOrder(BTree.left);
        preOrder(BTree.right);
    }
    public static void PostOrder(BinaryTree Btree){
        if (Btree==null) {
            return ;
        }
        PostOrder(Btree.left);
        PostOrder(Btree.right);
        System.out.println(Btree.root);
    }

    public boolean isLeaf() {
        if (left == null && right == null)
            return true;
        return false;

    }

    public int size() {
        if (left == null && right == null)
            return 1;
        if (left == null)
            return 1 + right.size();
        return 1 + left.size() + right.size();
    }

    public int height() {
        if (root == null)
            return -1;
        int leftn = 0, rightn = 0;
        if (left != null)
            leftn = 1 + left.height();
        if (right != null)
            rightn = 1 + right.height();
        return leftn > rightn ? leftn : rightn;
    }

    public boolean contains(Object t) {
        if (root == t)
            return true;
        boolean present = false;
        if (left != null) {
            if (left.toString().contains(t.toString()))
                return true;
            present = left.contains(t);
        }
        if (right != null) {
            if (right.toString().contains(t.toString()))
                return true;
            present = right.contains(t);
        }
        return present;
    }

    public static void main(String[] args) {

        BinaryTree treeD = new BinaryTree("D");

        BinaryTree treeE = new BinaryTree("E");
        BinaryTree treeB = new BinaryTree("B");
        BinaryTree treeC = new BinaryTree("C", treeD, treeE);
        BinaryTree tree = new BinaryTree("A", treeB, treeC);
        // System.out.println(tree);
        //preOrder(tree); // A , B , C , D , E
        PostOrder(tree); // B ,D,E,C,A
    }
}
