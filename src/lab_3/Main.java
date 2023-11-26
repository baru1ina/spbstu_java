package lab_3;

public class Main {
    public static void main(String[] args) {

        System.out.println((true && false) || (true && !false));

        int x = 15, y = 8;

        System.out.println("min(x,y): " + (x < y ? x : y));
        System.out.println("max(x,y): " + (x > y ? x : y));

        int a = 9;
        int b  = 12;
        System.out.println("a = "  + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("~a: " + Integer.toBinaryString(~a));
        System.out.println("~b: " + Integer.toBinaryString(~b));
        System.out.println("a&b: " + Integer.toBinaryString(a&b));
        System.out.println("a|b: " + Integer.toBinaryString(a|b));
        System.out.println("aXORb: " + Integer.toBinaryString(a^b));

        int c = 6;
        int d = 2;
        int e = -4;
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));
        System.out.println("e = " + Integer.toBinaryString(e));
        System.out.println("c >> d: " + Integer.toBinaryString(c >> d));
        System.out.println("c >>> d: " + Integer.toBinaryString(e >>> d));
        System.out.println("c << d: " + Integer.toBinaryString(c << d));
    }
}
