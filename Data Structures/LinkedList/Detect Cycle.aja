/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node cur = head;
    if( head == null) return false;
    
    while(head.next != null && head!=null){
        head = head.next;
        cur = cur.next.next;
        
        if(head == null || cur == null){
            return false;
        }
        if(head == cur){
            return true;
        }
    }
    return false;
}
