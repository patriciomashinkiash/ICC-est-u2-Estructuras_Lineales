package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {
    private Node top;// Nodo en la cima de nuestra pila

    // Creamos la pila con la cima nula o vacia
    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    // Metodo qe retira el nodo de la cima
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
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

}
