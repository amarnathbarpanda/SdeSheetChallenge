import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class MergeTwoLL {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if(first == null)
            return second;
        if(second == null)
            return first;
        LinkedListNode<Integer> t1 = first, t2 = second;
        LinkedListNode<Integer> head = null, tail = null;
        
        if(t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        
        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            tail.next = t1;
        }else{
            tail.next = t2;
        }
        return head;
        
	}
}
