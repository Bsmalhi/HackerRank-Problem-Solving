
/*
 Compare two linked lists A and B
 Return 1 if they are identical and 0 if they are not.
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */
int CompareLists(Node headA, Node headB) {
   Node currentA = headA;
    Node currentB = headB;
     
    if(headA == null){
        if(headB == null){
            return 1;
        }else{
            return 0;
        }
    }else if(headB==null){
        if(headA==null){
            return 1;
        }else{
            return 0;
        }
    }

    while(currentA.data == currentB.data){
        if(currentA.next == null ){
            if(currentB.next == null){
                return 1;
            }else{
                return 0;
            }
        }
        currentA = currentA.next;
        currentB = currentB.next;
    }
    
    return 0;
  
}
