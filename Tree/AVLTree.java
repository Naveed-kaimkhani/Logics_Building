//make a tree

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
    public int size(){
        if (this==NIL) return 0;
        return 1+left.size()+right.size();
    }
    public String toString(){
        if(this==NIL)return " ";
        return left+" "+key+" "+right;
    }
    public boolean add(int key) {
        int oldsize=size();
        grow(key);
        return size()>oldsize;
    }
public AVLTree grow(int key){
    if (this=NIL) {
     return new AVLTree(key);   
    }
    if(key==this.key)return this;
    if(key<this.key)left=left.grow(key);
    else right=right.grow(key);
    rebalance();
    height=1+Math.max(left.height, right.height);
    return this;
}
private void rotateleft(){
    left=new AVLTree(key,left,right.left);
    key=right.key;
    //right=right.key;
    right=right.right;
}
private void rotateRight(){
    right=new AVLTree(key,left.right,right);
    key=left.key;
    left=left.left;
}
}
