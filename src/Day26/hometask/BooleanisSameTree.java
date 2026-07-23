package Day26.hometask;

import javax.swing.tree.TreeNode;

class Solution {
    public static boolean isSameTree(Tree p, Tree q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p=val != q.val) return false;

        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    static void main() {

        Tree t1 = new Tree();

        Tree t2= new Tree();

       isSameTree(t1,t2);


    }

}

class Tree{

    Node root;

  private  static class Node{
        int val;
        Node left;
        Node right;



        Node(int value){

            this.val =value;



        }

    }

}

