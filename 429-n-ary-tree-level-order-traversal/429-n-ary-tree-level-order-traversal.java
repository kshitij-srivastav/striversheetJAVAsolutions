class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();

		if(root== null){
            return result;
        }
        
        Queue<Node> q1= new LinkedList<>();
        q1.add(root);
		
        while(q1.size() != 0){
            int n= q1.size();
            List<Integer> temp= new ArrayList<>();
			
            for(int i=0; i<n; i++){
                Node n1= q1.remove();
                temp.add(n1.val);
                
                for(Node p: n1.children){
                    q1.add(p);
                }
            }
            result.add(temp);
        }
        return result;
    }
}