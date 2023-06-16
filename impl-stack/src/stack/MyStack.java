package stack;

import java.util.ArrayList;

/**
 * @author Aphelele Dumakude
 * @param <E>
 */
public class MyStack<E> {
    private final ArrayList<E> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    /**
     *
     * @return the top element in this stack
     */
    public E peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size()-1);
    }

    /**
     *
     * @return and removes the top element in this stack
     */
    public E pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    /**
     * Adds a new element to the top of this stack
     * @param element
     */
    public void push(E element) {
        stack.add(element);
    }

    /**
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     *
     * @return the number of elements in this stack
     */
    public int getSize() {
        return stack.size();
    }
    @Override
    public String toString() {
        return "stack: " + stack;
    }
}
