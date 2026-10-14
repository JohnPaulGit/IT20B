package IT20B;

public class Stack_Array_List {

    private int[] stack;
    private int top;
    private int capacity;

    public Stack_Array_List(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public void push(int value) {

        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into the stack.");
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        int value = stack[top];
        top--;

        return value;
    }

    public static void main(String[] args) {
        // Create a stack with capacity of 5
        Stack_Array_List stack = new Stack_Array_List(5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

// Display stack
        stack.display();

        System.out.println();

// View top element
        System.out.println("Top element: " + stack.peek());

        System.out.println();

// Remove an element
        System.out.println("Removed: " + stack.pop());

        System.out.println();

// View top again
        System.out.println("Top element: " + stack.peek());

        System.out.println();

// Display stack again
        stack.display();
    }

}
