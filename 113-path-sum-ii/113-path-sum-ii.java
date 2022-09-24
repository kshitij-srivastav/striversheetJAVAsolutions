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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        vpathSum(root, targetSum,ans , new ArrayList<>());
        return ans;
    }
    
    public void vpathSum(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> sAns) {
        if(root == null) return ;
        if(root.left == null && root.right == null){
            if(targetSum - root.val == 0){
                sAns.add(root.val);
                List<Integer> base = new ArrayList<>(sAns);
                sAns.remove(sAns.size()-1);
                ans.add(base);
            }
            return ;
        }
        sAns.add(root.val);
        vpathSum(root.left, targetSum-root.val, ans, sAns);
        vpathSum(root.right, targetSum-root.val, ans, sAns);
        sAns.remove(sAns.size()-1);
    }
}