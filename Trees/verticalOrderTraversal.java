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
    public class TreeNodePair{
        TreeNode node;
        int level;
        TreeNodePair(TreeNode n,int x){
            level=x;
            node=n;
        }
    } 
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        HashMap<Integer,ArrayList<Integer>> hm= new HashMap();
        int maxVerticalLevel=0;
        int minVerticalLevel=0;
        int currentLevel=0;
        Queue<TreeNodePair> q= new LinkedList<TreeNodePair>();
        TreeNodePair rootPair= new TreeNodePair(A,0);
        int currVerticalLevel=0;
        q.add(rootPair);
        while(q.size()>0){
            int count= q.size();

            for(int i=0;i<count;i++){
                //get first element of queue
                TreeNodePair currPair= q.poll();
                currVerticalLevel=currPair.level;

                //update current level's list
                ArrayList<Integer> currList=hm.getOrDefault(currPair.level,new ArrayList<Integer>());
                currList.add(currPair.node.val);
                hm.put(currVerticalLevel, currList);

                //update max and min veetical level values
                maxVerticalLevel=Math.max(maxVerticalLevel,currPair.level);
                minVerticalLevel=Math.min(minVerticalLevel,currPair.level);

                if(currPair.node.left!=null){
                    q.add(new TreeNodePair(currPair.node.left,currVerticalLevel-1));
                }

                if(currPair.node.right!=null){
                    q.add(new TreeNodePair(currPair.node.right,currVerticalLevel+1));
                }



            }


        }
          ArrayList<ArrayList<Integer>> ans= new ArrayList();

            for(int i=minVerticalLevel;i<=maxVerticalLevel;i++){
                ans.add(hm.get(i));
            }
            return ans;


    }
}
