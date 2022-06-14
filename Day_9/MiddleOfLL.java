import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class MiddleOfLL {
    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static Node findMiddle(Node head) 
    {
        if(head == null){
            return head;
        }
        Node fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(length(head)% 2 != 0)
            return slow;
        return slow.next;
    }
}