package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {
    private Node top;
    private int size;
    // Nodo en la cima de nuestra pila

    // Creamos la pila con la cima nula o vacia
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    // Metodo qe retira el nodo de la cima
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    // Metodo que retorna el valor del node de la cima
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        // System.out.println();
    }

    // Metodo que retorna el tamaño de la pila
    // Complejidad es de O(n) a O(1)

    /*
     * public int getSize() {
     * int size = 0;
     * Node current = top;
     * while (current != null) {
     * size++;
     * current = current.getNext();
     * }
     * return size;
     * }
     */

    public int getSize() {
        return size;
    }

}
