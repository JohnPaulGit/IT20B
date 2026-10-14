/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT20B;

/**
 *
 * @author admin
 */
public class StackLinkedList {

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;

// Constructor
    public StackLinkedList() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {

// Create a new node
        Node newNode = new Node(value);

// Connect the new node to the current top
        newNode.next = top;

// Make the new node the new top
        top = newNode;

        System.out.println(value + " pushed into the stack.");
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
// Store the value of the top node
        int value = top.data;

// Move top to the next node
        top = top.next;

        return value;
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;

        System.out.println("Stack elements:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
// Create a stack
        StackLinkedList stack = new StackLinkedList();

// Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

// Display stack
        stack.display();

// View top element
        System.out.println("Top element: " + stack.peek());

// Remove an element
        System.out.println("Removed: " + stack.pop());

// View top again
        System.out.println("Top element: " + stack.peek());

// Display stack again
        stack.display();
    }
}
