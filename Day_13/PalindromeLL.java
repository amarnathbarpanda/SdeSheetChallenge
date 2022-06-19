import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class PalindromeLL {

    //Brute force: tc = O(n), sc = O(n) 

    // public static boolean isPalindrome(LinkedListNode<Integer> head) {
    //     // Write your code here!
    //     ArrayList<Integer> arr = new ArrayList<Integer>();
    //     LinkedListNode<Integer> temp = head;
        
    //     while(temp != null){
    //         arr.add(temp.data);
    //         temp = temp.next;
    //     }
        
    //     int start = 0;
    //     int end = arr.size() - 1;
        
    //     while(start < end){
    //         if((int)arr.get(start) != (int)arr.get(end))
    //             return false;
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }

    //OR

	// public static boolean isPalindrome(LinkedListNode<Integer> head) {
	// 	// Write your code here!
    //    Stack<Integer> st = new Stack<>();

    //     // Creating temprary Node.
    //     LinkedListNode<Integer> temp = head;

    //     while (temp != null) {

    //         // Add the current node value to stack.
    //         st.push(temp.data);

    //         // Move current pointer to next node.
    //         temp = temp.next;
    //     }

    //     while (head != null) {

    //         // Get the top most element of stack.
    //         Integer top = st.pop();

    //         if (!top.equals(head.data)) {
    //             return false;
    //         }

    //         head = head.next;
    //     }

    //     return true;
        
	// }
        
    //Optimal : tc = O(n), sc = O(1);

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
        if(head == null||head.next == null) 
            return true;
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = revLL(slow.next);
        slow = slow.next;
        LinkedListNode<Integer> dummy = head;

        while(slow != null && dummy != null) {
            if(!dummy.data.equals(slow.data)) return false;
            dummy = dummy.next;
            slow = slow.next;
        }
        
        return true;
	}
    public static LinkedListNode<Integer> revLL(LinkedListNode<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        
        LinkedListNode<Integer> prev = null, next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
