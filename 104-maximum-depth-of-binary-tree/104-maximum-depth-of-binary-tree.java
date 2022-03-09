/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Queue<TreeNode> Q = new LinkedList<>();
    int depth = 0;
        
    public int maxDepth(TreeNode root) {
        if(root == null)    return 0;
        Q.add(root);
        bfs();
        return depth;
    }
    
    private void bfs(){
        while(!Q.isEmpty()){
            int size = Q.size();
            depth++;
            for(int i=0;i<size;i++){
                TreeNode t = Q.poll();
                if(t.left != null){
                    Q.add(t.left);
                }
                if(t.right != null){
                    Q.add(t.right);
                }
            }
        }
    }
}