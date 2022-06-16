import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		
     //Brute force : tc = O(m*n), sc = O(1)   
//         while(secondHead != null){
//             LinkedListNode<Integer> temp = firstHead;
//             while(temp != null){
//                 if(temp == secondHead){
//                     return secondHead.data;
//                 }
//                 temp = temp.next;
//             }
//             secondHead = secondHead.next;
//         }
        
        //==============================
        // Better: tc = O(n + m), sc = O(n)
//         HashSet<LinkedListNode<Integer>> st = new HashSet<>();
//         LinkedListNode<Integer> temp = firstHead;
//         while(temp != null){
//             st.add(temp);
//             temp = temp.next;
//         }
        
//         while(secondHead != null){
//             if(st.contains(secondHead)) 
//                 return secondHead.data;
//             secondHead = secondHead.next;
//         }
        //=====================================

        // Optimal : tc = O(2max(length of list1,length of list2))+O(abs(length of list1-length of list2))+O(min(length of list1,length of list2)), sc = O(1)
        
        int len1 = length(firstHead);
        int len2 = length(secondHead);        
        
        int diff = len1 - len2;
        if(diff > 0){
            while(diff-- != 0)
                firstHead = firstHead.next;
        }else{
            while(diff++ != 0){
                secondHead = secondHead.next;
            }
        }
        
        while(secondHead != null){
            if(secondHead == firstHead)
                return firstHead.data;
            secondHead = secondHead.next;
            firstHead = firstHead.next;
        }
        
        
        return -1;
	}
    public static int length(LinkedListNode<Integer> head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}