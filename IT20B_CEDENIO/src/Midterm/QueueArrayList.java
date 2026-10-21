/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IT20B;

/**
 *
 * @author admin
 */
public class QueueArrayList {

    private int[] queue = new int[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear++;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int value = queue[front];
        front++;
        size--;
        return value;
    }

  
    public static void main(String[] args) {
        QueueArrayList q = new QueueArrayList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
    
}
