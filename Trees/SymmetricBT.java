/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    //  public TreeNode invertTree(TreeNode A) {

    //      if (A == null)
    //         return A;
    //     TreeNode current= new TreeNode(A.val);
    //     TreeNode left = invertTree(A.left);
    //     TreeNode right = invertTree(A.right);
 
    //     current.left = right;
    //     current.right = left;
 
    //     return current;
    // }
    public boolean isEqual(TreeNode A, TreeNode B){
        if(A==null && B==null){
            return true;
        }
       
        if(A!=null && B!=null && (A.val==B.val) ){
            boolean childCheck1=isEqual(A.left,B.right);
            boolean childCheck2=isEqual(A.right,B.left);
            return childCheck1 && childCheck2;
        }
        else{
        return false;
        }
    }
    public int isSymmetric(TreeNode A) {
       // TreeNode invertedTree=invertTree(A);
        if(isEqual(A,A)){
            return 1;
        }
        return 0;

    }
}
