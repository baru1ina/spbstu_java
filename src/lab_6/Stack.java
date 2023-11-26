package lab_6;
import java.util.Arrays;
public class Stack<T> {
    private int capacity = 0;
    private T[] vals;

    private T top;
    public Stack(int i)
    {
        capacity = i;
        vals = (T[]) new Object[i];
        top = null;
    }
    public boolean isEmpty()
    {
        return top != null;
    }
    public void push(T x) {
        if (capacity == vals.length)
            vals = Arrays.copyOf(vals, 2 * vals.length);

        vals[capacity] = x;
        capacity++;
    }
    public T pop()
    {
        if(!isEmpty()) {
            capacity--;
            T tmp = vals[capacity];
            vals[capacity] = null;
            return tmp;
        }
        System.out.println("Stack is empty");
        return null;
    }
    public void print()
    {
        if(!isEmpty())
            for(int i = 0; i < capacity; i++)
                System.out.println("[" + i + "]: " + vals[i]);
    }

}
