package lab_1;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("string0;");

        String s1 = "str";
        s1+= "ing1;";
        System.out.println(s1);

        String s2 = "string ";
        s2 += 2;
        s2 += ";";
        System.out.println(s2);

        if(s2!=s1)
            System.out.println("s1 isn't equal to s2");

        String s3 = "string3";
        if(s3 == "string3")
            System.out.println("s3 = string3");
        if(!s3.equals((s1)))
            System.out.println("s3 isn't equal to s1");

        String s4 = null;
        String s5 = "";
        if(s5 == s4)
            System.out.println("s5 is null");
        else
            System.out.println("s5 is not null");

        String s6 = "STRING6";
        System.out.println(s6);
        if(s6.equalsIgnoreCase(s3))
            System.out.println("s6 has the same letter sequence as s3");

        String s7 = "   string7   ";
        System.out.println("s7.length(): " + s7.length());
        System.out.println("s7.trim().length(): " + s7.trim().length());

        String s8 = s7.substring(1,s7.length() - 1);
        System.out.println("s8.length() : " + s8.length());

        System.out.println(String.join(",", "comma", "separated", "notation"));

    }
}