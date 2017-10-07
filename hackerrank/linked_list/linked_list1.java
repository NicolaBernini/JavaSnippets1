// Solution to 
// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list

/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 
    
void Print(Node in_wire_head) 
{
    while(in_wire_head != null)
    {
        System.out.println(in_wire_head.data); 
        in_wire_head = in_wire_head.next; 
    }
}
