package lab_6;
import lab_6.Stack;
public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> stack  = new Stack<Integer>(1);
        System.out.println("constructor");
        stack.print();
        System.out.println("push elements");
        for (int index = 0; index < 10; index += 1)
            stack.push(index);

        stack.print();
        int b = stack.pop();
        System.out.println("deleted element: " + b);
        stack.print();
    }
}
