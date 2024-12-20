import java.util.Scanner;

import Controller.MenuController;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();
        //runContactMannager();
        
        //runSignValidator();
        runStackSorter();
    }

    public static void runStack() {
        // Instanciar la clase
        Stack stack = new Stack();
        int ingresada = 10;

        // Agregar elementos a la pila
        stack.push(ingresada);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.print("PILA: ");
        stack.printStack();

        System.out.println("\nTamaño de la pila -> " + stack.getSize());

        // Mostrar valores
        System.out.println("\nCima    -> " + stack.peek());
        System.out.println("Retirar -> " + stack.pop());
        System.out.println("Cima    -> " + stack.peek());
        System.out.println("Retirar -> " + stack.pop());
        System.out.println("Cima    -> " + stack.peek());

        System.out.println("\nTamaño de la pila -> " + stack.getSize());
    }

    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1,"Home Page","/home"));
        router.push(new Pantalla(1,"Menu Page","/home/menu"));
        router.push(new Pantalla(1,"Users Page","/home/menu/users"));

        System.out.println("Esto en " + router.peek().getRuta());
        System.out.println("Regreso a " + ((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Esto en " + router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "home/menu/users/settings"));

        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.printStack();
    }

    public static void runQueue() {
        Queue cola = new Queue();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        cola.printQueue();

        System.out.println();
        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());

        System.out.println("El tamanio de la cola es: " + cola.getSize());

        
    }

    public static void runQueueGeneric() {
        QueueGeneric<Integer> cola = new QueueGeneric<>();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        cola.printQueue();

        System.out.println();
        System.out.println("Elemento al frente: " + cola.peek());
        System.out.println("Desencolando: " + cola.dequeue());
        System.out.println("Desencolando: " + cola.dequeue());
        System.out.println("Elemento al frente: " + cola.peek());

        System.out.println("El tamanio de la cola es: " + cola.getSize());
    }

    public static void runContactMannager() {
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

    public static void runSignValidator() {
        SignValidator sv = new SignValidator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese una cadena que contenga solo los caracteres '(', ')', '{', '}', '[' y ']':");
            String input = scanner.nextLine();

            if (!input.matches("[(){}\\[\\]]*")) {
                System.out.println("Un caracter ingresado no es correcto. Intente nuevamente.");
            } else {
                boolean result = sv.isValid(input);
                System.out.println("Output: " + result);
                break; 
            }
        }

        scanner.close();
    }

    public static void runStackSorter() {
        StackSorter ss = new StackSorter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del stack:");
        int size = scanner.nextInt();

        int[] values = new int[size];

        System.out.println("Ingrese los valores del stack uno por uno:");
        for (int i = 0; i < size; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        String sortedStack = ss.processAndSortStack(values);

        System.out.println("Pila ordenada: " + sortedStack);

        scanner.close();
    }
}