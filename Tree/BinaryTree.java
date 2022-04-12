import java.lang.annotation.Retention;

import javax.naming.spi.ObjectFactory;

/* Binary Search Tree:
            For each key in the tree. 
            all the key in its left subtree are less than 
            and all the keys in the right subtree are greater. 
 */

 // replace with the most smallest left element of right sub tree
 //find closest larger ancestor
 public class BinaryTree {
    Object root;
    BinaryTree left, right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public static void swap(BinaryTree Btree) {
        Btree.setRight(Btree.left);
        Btree.setLeft(Btree.right);

        System.out.println("Tree after Swaped");
        System.out.println(Btree.toString());
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
    public String toString() { // Inorder
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
        if (BTree == null) {
            return;
        }

        System.out.println(BTree.root);
        preOrder(BTree.left);
        preOrder(BTree.right);
    }

    public static boolean isFull(BinaryTree BTree) {
        if (BTree == null) {
            return true;
        }

        if (BTree.right == null && BTree.left == null) {
            return true;
        }
      return isFull(BTree.left) && isFull(BTree.right);

    }

    public static void PostOrder(BinaryTree Btree) {//left right root
        if (Btree == null) {
            return;
        }
        PostOrder(Btree.left);
        PostOrder(Btree.right);
        System.out.println(Btree.root);
    }

    public static void RightmostNode_Of_LeftSubTree(BinaryTree Btree) {
       //  BinaryTree leftOFBtree=Btree.left;
        if (Btree.right == null) {
            System.out.println(Btree.root);
            return;
        }
        RightmostNode_Of_LeftSubTree(Btree.right);
    }

    public static void LeftmostNode_Of_RightSubTree(BinaryTree Btree) {
        // BinaryTree rightOFBtree=Btree.right;
        if (Btree.left == null) {
            System.out.println(Btree.root);
            return;
        }
        LeftmostNode_Of_RightSubTree(Btree.left);
    }

    public static int CountNodes(BinaryTree Btree) {
        if (Btree == null) {
            return 0;
        }
        int rightCount = CountNodes(Btree.right);
        int leftCount = CountNodes(Btree.left);
        return rightCount + leftCount + 1;
    }

    public static int  SumNodes(BinaryTree Btree) {
        if (Btree == null) {
            return 0;
        }
        int rightsum = SumNodes(Btree.right);
        int leftsum = SumNodes(Btree.left);
        return rightsum+leftsum+Integer.parseInt(Btree.root.toString());
    }

    //leaf of a tree is a node with no children
    public boolean isLeaf() {
        if (left == null && right == null)
            return true;
        return false;

    }
//size of a tree is the number of nodes in the tree
    public int size() {
        if (left == null && right == null)
            return 1;
        if (left == null)
            return 1 + right.size();
        return 1 + left.size() + right.size();
    }

    //height of a tree is the number of edges on the longest path from the root to a leaf
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
// public void insertion(BinaryTree t, int key) {
//     if (t==null) {
        
//     }
//     if (key<root.key) {
        
//     }
//     if (key>root.key) {
        
//     }
// }
// public boolean search(BinaryTree t, Object key) {
//     if (t==null) {
//         return false;
//     } 
//     if (Integer.parseInt(key.toString())<Integer.parseInt(t.root.toString())) {
//        return search(t.left, key);
//     }
//     else (Integer.parseInt(key.toString())>Integer.parseInt(t.root.toString())) {
//         //go right
//        return search(t.right, key);
//     }
//     return false;
// }
  //  
public static void main(String[] args) {

        BinaryTree teD = new BinaryTree();
        BinaryTree treeX = new BinaryTree("X");
        BinaryTree treeD = new BinaryTree("D"); //    A */
        BinaryTree treeE = new BinaryTree("E"); // B       C
        BinaryTree treeB = new BinaryTree("B"); //       D   E
        BinaryTree treeC = new BinaryTree("C", treeD, treeE);
        BinaryTree tree = new BinaryTree("A", treeB, treeC);
       
        // preOrder(tree); // A , B , C , D , E
        // PostOrder(tree); // B ,D,E,C,A
        // System.out.println(CountNodes(tree));
       // RightmostNode_Of_LeftSubTree(tree.left);
        // LeftmostNode_Of_RightSubTree(tree.right);
    }
}