/*
Reverse a doubly linked list. To reverse a doubly linked list using iteration or recursion.

Input Format

Original list : 5 -> 4 -> 3 -> 2 -> 1 -> null

Constraints

.

Output Format

Reversed list : 1 -> 2 -> 3 -> 4 -> 5 -> null

Sample Input 0

5 -> 4 -> 3 -> 2 -> 1 -> null
Sample Output 0

1 -> 2 -> 3 -> 4 -> 5 -> null
*/
import java.io.*;
import java.util.*;

public class Solution {
  
    Node head;
    static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            prev=null;
            next=null;
            data=d;
        }

    }
    void insertAtStart(int new_data)
        {
            Node new_node=new Node(new_data);
            new_node.next=head;
            new_node.prev=null;
            if(head!=null)
            {
                head.prev=new_node;
            }
            head=new_node;
        }
    
    public void display(Node node)
    {
        //forward direction
        Node last=null;
        while(node!=null)
        {
            last=node;
            node=node.next;
        }
        while(last!=null)
        {
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Solution l1=new Solution();
        for(int i=1;i<=5;i++)
        {
            l1.insertAtStart(i);
        }
        l1.display(l1.head);
        /* Enter your code here
}
    . Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}