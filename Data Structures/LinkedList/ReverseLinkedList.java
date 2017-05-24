Node Reverse(Node head) {
     Node current = head;
     Node temp = null;
    Node prev = null;
    if(current == null){
        return head;
    }
    while(current != null){
        temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
       
    }
    head = prev;
    return head;
}
