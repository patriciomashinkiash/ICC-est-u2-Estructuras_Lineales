package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {
    public Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!inputStack.isEmpty()) {
            int temp = inputStack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                inputStack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        return tempStack;
    }

    public String processAndSortStack(int[] values) {
        Stack<Integer> stack = new Stack<>();

        for (int value : values) {
            stack.push(value);
        }

        Stack<Integer> sortedStack = sortStack(stack);

        return stackToString(sortedStack);
    }

    private static String stackToString(Stack<Integer> stack) {
        return stack.toString();
    }
}
