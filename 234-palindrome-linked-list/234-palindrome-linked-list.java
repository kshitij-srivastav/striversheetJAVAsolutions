/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode fast = head, slow=head;
			Stack<Integer> stk = new Stack<Integer>();
			stk.push(slow.val);
			while(fast!=null && fast.next!=null){
				fast=fast.next.next;
				slow=slow.next;
				stk.push(slow.val);
			}
	        stk.pop();
			if(fast!=null)
				slow=slow.next;
			while(!stk.isEmpty()){
				if(stk.pop()!=slow.val)
					return false;
				slow=slow.next;
			}
			return true;
    }
}