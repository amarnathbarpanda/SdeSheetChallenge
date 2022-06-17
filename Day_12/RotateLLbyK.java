import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class RotateLLbyK {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head.next == null)
            return head;
        Node temp = head,temp1 = null;
        
        while(k > 0){
            if(temp.next.next == null){
                temp1 = temp.next;
                temp.next = null;
                temp = head;
                head = temp1;
                head.next = temp;
                k--;
                temp = head;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}