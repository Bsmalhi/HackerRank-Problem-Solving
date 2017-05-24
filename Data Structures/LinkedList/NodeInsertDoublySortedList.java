/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
  Node newNode = new Node();
    newNode.data = data;
   Node current = head; 
    
    if(head==null){
        head = newNode;
        return head;
    }
    // if current.next
    while(current != null){ //while not null increment the current to next node
        
        if(current.data >= data ){      
          newNode.prev = current.prev; 
          newNode.next = current;
          current.prev = newNode;
            if(newNode.prev == null){
                return newNode;
            }else{
                newNode.prev.next = newNode;
                return head;
            }
        }else if(current.next == null){
            newNode.next = null;
            newNode.prev = current;
            current.next = newNode;
            return head;
        }
        current = current.next;
    }
    
    return head;
    
}
