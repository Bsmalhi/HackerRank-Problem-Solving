/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     Node currentA = headA;
     Node currentB = headB;
    // Node newNode = new Node();
    
    if(currentA == null){
        return currentB; 
    }
    if(currentB == null){
        return currentA;
    }
    
    if(currentA.data < currentB.data){
        currentA.next = MergeLists(currentA.next, currentB);
        return currentA;
    }else{
        currentB.next = MergeLists(currentA, currentB.next);
        return currentB;
    }


}
