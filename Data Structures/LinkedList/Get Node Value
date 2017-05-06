/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node currentA = head;

    int i = 0;
    
    while(currentA != null){
        currentA = currentA.next;
        i++;
    }
    
    i = (i - n);
    
    while( --i>0){  // --i pre decrement to avoid null pointer exception beacause head points to first value in list
        head = head.next;
    }
    
    return head.data;
    


}
