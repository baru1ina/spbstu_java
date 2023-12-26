package lab_9;

import lab_9.MyClass;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        try {
            MyClass templateClass = new MyClass("val", 0);
            String class_name = templateClass.getClass().getName();
            System.out.println("class name: " + class_name);
            Class<?> instance = Class.forName(class_name);
            Constructor<?> constructor = instance.getConstructor(String.class, int.class);
            Object myClass = constructor.newInstance("data", 1);

            Method method1 = instance.getMethod("print");
            Method method2 = instance.getMethod("getVal");
            Method method3 = instance.getMethod("increaseCount", int.class);
            Method method4 = instance.getMethod("switchFlag", int.class);

            method1.invoke(myClass);
            method3.invoke(myClass, 2);
            method4.invoke(myClass, 0);
            method1.invoke(myClass);

            Object val = method2.invoke(myClass);
            System.out.println("val = " + val);

//            Method method5 = instance.getMethod("PRINT");
//            method5.invoke(myClass);

            Class<?> instance1 = Class.forName("CLASS");
            Constructor<?> constructor1 = instance1.getConstructor(String.class, int.class);
            Object myClass1 = constructor1.newInstance("data", 1);
            method1.invoke(myClass1);
        }
        catch (ClassNotFoundException e) {
            System.err.println("no class found: " + e.getMessage());
        }
        catch (NoSuchMethodException e) {
            System.err.println("no method found: " + e.getMessage());
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.err.println("creation error: " + e.getMessage());
        }
    }
}
