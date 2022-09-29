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
    
    class Node{
        TreeNode node;
        int level;

        public Node(TreeNode node, int level){
            this.node= node;
            this.level = level;
        }
        
        public int getLevel(){
            return this.level;
        }
        
        public int getValue(){
           return this.node.val;
        }
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;
        
        Map<Integer, List<Node>> map = new TreeMap<>();
        vt(root, 0, 0, map);
        
        for(List<Node> list : map.values()){
          List<Integer> newlist = list.stream()
              .sorted(Comparator.comparing(Node::getLevel)
                    .thenComparing(Node::getValue))
              .map(Node::getValue)
              .toList();
            
            result.add(newlist);
        }
    
       return result; 
    }
    
    void vt(TreeNode root, int path, int level, Map<Integer,List<Node>> map) {
        
        if(root == null) return;
        
        map.computeIfAbsent(path, k -> new ArrayList<Node>()).add(new Node(root, level));
        
        vt(root.left, path-1, level+1, map);
        vt(root.right, path+1, level+1, map);
        
    }  
}