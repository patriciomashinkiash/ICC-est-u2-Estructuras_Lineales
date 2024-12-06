package Materia.Stacks;

import java.util.EmptyStackException;
import Materia.Models.NodeGeneric;

public class StackGeneric<T> {
    private NodeGeneric<T> top; // Nodo Generico
    private int size; // Variable tamanio O(1)

    // Crea una Pila instanciando el nodo Top como null y el tamanio en 0
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    // Metodo para agregar un elemento a la pila
    public void push(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    // Metodo para retirar un elemento de la Pila
    public T pop() {
        if (isEmpty()) { // Si la Pila esta vacia
            throw new EmptyStackException(); // Lanza una Excepcion
        }
        T value = top.getValue(); // Obtiene el valor del top
        top = top.getNext(); // El nodo Top serA el siguiente
        size--; // Decrementa el tamanio
        return value; // retorna el valor
    }

    

    public NodeGeneric<T> popNode() {
        if (isEmpty()) { // Si la Pila esta vacia
            throw new EmptyStackException(); // Lanza una Excepcion
        }
        NodeGeneric<T> value = top; // Obtiene el valor del top
        top = top.getNext(); // El nodo Top serA el siguiente
        size--; // Decrementa el tamanio
        return value; // retorna el valor
    }

    // Metodo que retorna el valor a la cima
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        NodeGeneric<T> current = top;
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

