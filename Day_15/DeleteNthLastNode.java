import java.util.* ;
import java.io.*; 
/****************************************************************
    
    Following is the structure of the Singly Linked List.
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class DeleteNthLastNode {
    public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
        // Write your code here.

        //Better approach: Two pointer tc = O(n), sc = O(1)
        LinkedListNode<Integer> start = new LinkedListNode<Integer>(-1);
        start.next = head;
        LinkedListNode<Integer> fast = start;
        LinkedListNode<Integer> slow = start;     

        for(int i = 1; i <= K; ++i)
            fast = fast.next;
    
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next != null)
        slow.next = slow.next.next;
        
        return start.next;
    }
}
