//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表 
// 👍 342 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curNode;
        if (head == null ){
            return null;
        } else {
            curNode = head;
        }
        delduplicate(curNode);
        return head;

    }
     public void delduplicate(ListNode curNode) {
         if (curNode != null  && curNode.next != null) {
             if (curNode.val == curNode.next.val) {
                 ListNode temp = curNode.next;
                 curNode.next = temp.next;
             }else{
                 curNode = curNode.next;
             }

             deleteDuplicates(curNode);
     }


    }
}
//leetcode submit region end(Prohibit modification and deletion)
