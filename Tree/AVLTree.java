public class AVLTree {
    private int key,height;
    private AVLTree left,right;
    public static final AVLTree NIL=new AVLTree();
    private AVLTree (){
        left=right=this;
        height=-1;
    }
    private AVLTree (int key, AVLTree left,AVLTree right){
        this.key=key;
        this.left=left;
        this.right=right;
        height =1+Math.max(left.height, right.height);
    }
}
