import java.util.* ;
import java.io.*; 
/*  

    Following is the representation of the Singly Linked List node

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

*/

public class CycleDetectionLL {
    
    public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
        
//         Approach 1: Using HashSet tc = O(n), sc = O(n);
        
//         HashSet<Node<Integer>> st = new HashSet<>();
//         Node<Integer> temp = head;
//         while(temp != null){
//             if(st.contains(temp))
//                 return true;
//             st.add(temp);
//             temp = temp.next;
//         }
        
        //===========================
//         Optimal: Using slow and fast pointers
        if(head.next == null)
            return false;
        Node<Integer> slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
        
    }
}