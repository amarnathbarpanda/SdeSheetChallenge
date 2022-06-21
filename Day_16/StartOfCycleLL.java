import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class StartOfCycleLL 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
//         Brute force: tc = O(n), sc = O(n)
//         HashSet<Node> st = new HashSet<>();
//         Node temp = head;
//         while(temp != null){
//             if(st.contains(temp)){
//                 return temp;
//             }
//             st.add(temp);
//             temp = temp.next;
//         }
        //-----------------------------
//         Optimal: tc = O(n), sc = O(1)
        if(head == null)
            return head;
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        Node dummy = head;
        
        while(slow.next != null){
            if(slow == dummy)
                return dummy;
            slow = slow.next;
            dummy = dummy.next;
        }
        
        return null;
    }
}