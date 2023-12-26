package lab_5;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("empty");
            return;
        }
        else {
            System.out.println("args:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + (i + 1) + "] = " + args[i]);
            }
        }
    }
}
