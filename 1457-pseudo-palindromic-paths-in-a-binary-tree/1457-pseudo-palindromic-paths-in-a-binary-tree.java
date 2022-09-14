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
    int ans =0;
    public int pseudoPalindromicPaths (TreeNode root) {
        Set<Integer> nodes = new HashSet<>();
        fun(root, nodes);
        return ans;
    }
    public void fun(TreeNode cur, Set<Integer> nodes){
        if(cur == null) return;
        if(nodes.contains(cur.val)){
            nodes.remove(cur.val);
        }
        else{
            nodes.add(cur.val);
        }
        if(cur.left == null && cur.right==null){
            if(nodes.size()<=1) ans++;
        }
        fun(cur.left, new HashSet(nodes));
        fun(cur.right, new HashSet(nodes));
    }
}