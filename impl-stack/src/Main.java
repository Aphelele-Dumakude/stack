import stack.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Durban");
        stack.push("Pretoria");
        stack.push("Cape Town");
        stack.push("Kokstad");

        System.out.println(stack);
    }
}