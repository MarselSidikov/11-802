package ru.itis;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ReflectiveOperationException {
        Class humanClass = Human.class;
        System.out.println(humanClass.getName());

        Field fields[] = humanClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        Method methods[] = humanClass.getMethods();

        for (Method method : methods) {
            System.out.print(method.getReturnType() + " " + method.getName() + "(");
            Class parameters[] = method.getParameterTypes();
            for (Class parameterType : parameters) {
                System.out.print(parameterType.getName());
            }
            System.out.println(")");
        }

        Human human = (Human)humanClass.newInstance();

        human.makeOlder();
        System.out.println(human.age);

        Method methodFirst = humanClass.getMethod("makeOlder");
        Method methodSecond = humanClass.getMethod("makeOlder", int.class);
        
        methodFirst.invoke(human);
        methodSecond.invoke(human, 15);
        System.out.println(human.age);

        System.out.println(Integer.class);
        System.out.println(int.class);
        System.out.println(Integer.TYPE);

        System.out.println(human.getName());
        Field field = humanClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(human, "Марсель");
        System.out.println(human.getName());

        Constructor constructor = humanClass.getConstructor(String.class, int.class);
        Human adelya = (Human)constructor.newInstance("Аделя", 19);
        System.out.println(adelya.getName() + " " + adelya.age);

    }
}
