/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
     Node currNode = head;

    
    if(head == null){
        return head;
    }
    
    while(currNode.next !=null){

      if(currNode.next.data == currNode.data){
        currNode.next = currNode.next.next;
    }else{
          currNode = currNode.next;
      }
    }
    
    return head;
}
