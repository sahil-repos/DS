//Print nodes at distance K from the root node
//if K=0+> root.data

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     // Recursive function to print right view of a binary tree.
     
     void helper(Node root,int k,int currentLevel,ArrayList<Integer> ans){
          if(root==null){
              return;
          }
          if(currentLevel==k){
              ans.add(root.data);
              return;
          }
          helper(root.left,k,currentLevel+1,ans);
          helper(root.right,k,currentLevel+1,ans);
     }
     
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
           ArrayList<Integer> ans= new ArrayList();
          helper(root,k,0,ans);
          return ans;
         
     }
}
