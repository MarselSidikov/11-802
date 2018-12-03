package ru.itis;

import ru.itis.pattern.ConcreteStrategy1;
import ru.itis.pattern.ConcreteStrategy2;
import ru.itis.pattern.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy2());

        context.contextMethod();
    }
}
