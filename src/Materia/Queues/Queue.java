package Materia.Queues;

import java.util.NoSuchElementException;
import Materia.Models.Node;
public class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }
    
    public Node dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia.");
        }
        Node node = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return node;
        
    }

    public Node peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        // System.out.println();
    }

    public int getSize() {
        return size;
    }
}
