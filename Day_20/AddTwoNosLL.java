import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class AddTwoNosLL {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        
//         Brute force: Elementary Maths
//          T. C = O(max(m,n)). Assume that m and n represent the length of l1 and l2 respectively, the algorithm above iterates at most max(m,n) times.
//         S.C =  O(max(m,n)). The length of the new list is at most max(m,n)+1.
        
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        
        LinkedListNode ansHead = null, ansTail = null, temp1 = head1, temp2 = head2;
        int carry = 0;
        while(temp1 != null || temp2 != null || carry == 1){
            int res = 0;
            if(temp1 != null)
                res += temp1.data;
            if(temp2 != null)
                res += temp2.data;
            res += carry;
            
            int num = res % 10;
            carry = res / 10;
            LinkedListNode newNode = new LinkedListNode(num);
            newNode.next = null;
            if(ansHead == null){
                ansHead = newNode;
                ansTail = newNode;
            }
            else{
                ansTail.next = newNode;
                ansTail = newNode;
            }
            if(temp1 != null)
                temp1 = temp1.next;
            if(temp2 != null)
            temp2 = temp2.next;
        }
        return ansHead;
    }
}