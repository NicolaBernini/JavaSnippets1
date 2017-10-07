// Solution to 
// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list?h_r=next-challenge&h_v=zen

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node in_wire_head, int in_wire_data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  Node t_wire_head = in_wire_head; 
  while(t_wire_head.next != null) t_wire_head=t_wire_head.next; 
  t_wire_head.next = new Node(); 
  t_wire_head.next.data = in_wire_data; 
  return in_wire_head; 
}


