import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();
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
}
