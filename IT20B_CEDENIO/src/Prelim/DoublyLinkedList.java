/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author admin
 */


/**
 *
 * @author admin
 */
public class DoublyLinkedList {

    class Node{
    
    int data;
    Node next;
    Node previous;
    
    
    Node (int data) {
    this.data = data;
    this.previous = null;
    this.next = null;
    }
  }
 ////////////////////////////////////////////////////////////////
   
    Node head;
  void add( int data ) {
      Node newNode = new Node(data);
      if (head == null){
      head = newNode;
      return;
      }
      Node current = head;
      while (current.next != null){
      current = current.next;
    }
      current.next = newNode;
      newNode.previous = current;
}
  
/////////////////////////////////////////////////////////////////
 
  void display(){
      Node current = head;
      
      while (current != null) {
          System.out.print(current.data + " <-> ");
          current = current.next;
      }
      System.out.println("null");
  }
  
/////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
          DoublyLinkedList list = new DoublyLinkedList();
          
          list.add(20);
          list.add(80);
          
          list.display();
    }
}
