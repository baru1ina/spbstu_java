package lab_4;

public class Main {
    public static void main(String[] args)
    {
        int i = 2;
        //int i = 1;
        short s = 2;
        byte b = 3;
        char c = 'c';
        String str = "hello world";

        switch(i)
        {
            case 1 -> System.out.println("i = 1");
            case 2 -> System.out.println("i = 2");
            default -> System.out.println("no int i in switch");
        }
        switch(s)
        {
            case 2 -> System.out.println("s = 2");
            case 3 -> System.out.println("s = 3");
            default -> System.out.println("no short s in switch");
        }
        switch(b)
        {
            case 3 -> System.out.println("b = 3");
            case 4 -> System.out.println("b = 4");
            default -> System.out.println("no byte b in switch");
        }
        switch(c)
        {
            case 'c' -> System.out.println("c = c");
            case 'C' -> System.out.println("c = C");
            default -> System.out.println("no char c in switch");
        }
        switch (str) {
            case "hello":
                System.out.println("str = hello");
                break;
            case "world":
                System.out.println("str = world");
                break;
            default:
                System.out.println("no string str in switch");
                break;
        }
    }
}
