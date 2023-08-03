package circularlinkedtry;
 
import java.util.*;
 
class GFG{
 
static class Node {
    int data;
    Node next;
 
    Node(int data)
    {
        this.data = data;
        next = null;
    }
};
 
static Node head = null;
static class Cyclelinkedlist {
    void insert(int value)
    {
        Node newNode = new Node(value);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }
 
    boolean detectLoop()
    {
        Node slowPointer = head,
             fastPointer = head;
 
        while (slowPointer != null
               && fastPointer != null
               && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer)
                return true;
        }
 
    return false;
    }
}
 
public static void main(String[] args)
{
    Cyclelinkedlist l1 = new Cyclelinkedlist();
    // inserting new values
    l1.insert(10);
    l1.insert(20);
    l1.insert(30);
    l1.insert(40);
    l1.insert(50);
 
    Node temp = head;
    while (temp.next != null)
        temp = temp.next;
 
    temp.next = head;
 
    
 
    if (l1.detectLoop())
        System.out.print("Loop exists in the Linked List" +"\n");
    else
        System.out.print("Loop exists in the Linked List" +"\n");
 
}
}