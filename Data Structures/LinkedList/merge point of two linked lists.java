/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    Node temp;
    if(headA == null || headB == null)
        return -1;
    
    while(headA !=null){
         temp = headB;
        while(temp != null){
            if(temp == headA){
                return headA.data;
            }
           temp = temp.next;
        }
        headA = headA.next;
    }
    return -1;

}
