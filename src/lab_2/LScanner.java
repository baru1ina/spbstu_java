package lab_2;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class LScanner {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // стандартный ввод

        System.out.print("String: ");
        String name = in.nextLine(); // считать строку

        System.out.println("Result = " + name);

        System.out.println();

        System.out.print("2 Words: ");
        String word1 = in.next(); // считать слова
        String word2 = in.next(); // считать слова

        System.out.println("Result = " + word1 + '|' + word2);


        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try
        {
            Scanner fin = new Scanner(Paths.get(dir + "\\src", "lab_2/file.txt"), "UTF-8");
            while(fin.hasNext())
            {
                String line = fin.nextLine();
                System.out.println(line);
            }
        }
        catch (NoSuchFileException e)
        {
            System.out.println("Exception 1: " + e);
        }
        catch (IOException e)
        {
            System.out.println("Exception 2: " + e);
        }
        catch (Exception e)
        {
            System.out.println("Exception 3: " + e);
        }

    }
}