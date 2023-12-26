package lab_8;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;

public class Main
{
    public static void printClassName(Class<?> instance)
    {
        System.out.println("class name: " + instance.getName() + "\n");
    }
    public static void printClassModifier(Class<?> instance)
    {
        int mods = instance.getModifiers();
        System.out.print("class modifier: ");
        if (Modifier.isPublic(mods))
            System.out.print("public\n");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract\n");
        if (Modifier.isFinal(mods))
            System.out.print("final\n");
        System.out.println();
    }
    public static void printFields(Field[] fields)
    {
        for (var field : fields)
        {
            Class<?> fld = field.getType();
            System.out.println("field name : " + field.getName());
            System.out.println("field type : " + fld.getName() + "\n");
        }
        System.out.println();
    }
    public static void printClassFields(Class<?> instance)
    {
        Field[] fields = instance.getFields();
        printFields(fields);

        fields = instance.getDeclaredFields();
        printFields(fields);
    }

    public static void printConstructors(Constructor<?>[] constructors)
    {
        for (var constructor : constructors)
        {
            System.out.print("constructor " + constructor.getName() + "() fields: ");
            Class<?>[] params = constructor.getParameterTypes();
            for (var param : params)
                System.out.print("[" + param.getName() + "]  ");
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void printClassConstructors(Class<?> instance)
    {
        Constructor<?>[] constructors = instance.getConstructors();
        printConstructors(constructors);

        constructors = instance.getDeclaredConstructors();
        printConstructors(constructors);
    }
    public static void printMethods(Method[] methods)
    {
        for (var method : methods)
        {
            System.out.println("method name : " + method.getName());
            System.out.println("return type : " +
                    method.getReturnType().getName());

            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("parameters : ");
            for (var paramType : paramTypes)
                System.out.print(paramType.getName());
            System.out.println("\n");
        }
        System.out.println();
    }
    public static void printClassMethods(Class<?> instance)
    {
        Method[] methods = instance.getMethods();
        printMethods(methods);

        methods = instance.getDeclaredMethods();
        printMethods(methods);
    }
    public static void printClassInterfaces(Class<?> instance)
    {
        Class<?>[] interfaces = instance.getInterfaces();
        System.out.println("interfaces:\n");
        for (var _interface : interfaces)
            System.out.println("[ " + _interface.getName() + " ]  ");
    }
    public static void printClassInfo(Class<?> instance)
    {
        printClassName(instance);
        printClassModifier(instance);
        printClassConstructors(instance);
        printClassFields(instance);
        printClassMethods(instance);
        printClassInterfaces(instance);
    }

    public static void main(String[] args)
    {
        MyClass myClass = new MyClass("data", 100);
        Class<?> instance = myClass.getClass();
        printClassInfo(instance);
    }
}