package ru.itis.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * 13.03.2019
 * SimpleStupidFramework
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleStupidFramework {
    public static <T> List<T>  getObjects(Class<T> aClass, int count) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            try {
                T newObject = aClass.newInstance();
                result.add(newObject);
            } catch (InstantiationException | IllegalAccessException e) {
                throw new IllegalStateException(e);
            }
        }
        return result;

    }
}
