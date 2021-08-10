package se283.a1.t1;

import java.lang.reflect.*;
import java.util.*;

/**
 * SE283 Assignment 1 Task 1 Reflector - Instructions
 *  
 * This class should be implemented to contain the reflection functionality described in the
 * assignment hand-out. 
 * This class must be called by T1Main for executing the desired reflection for a given class e.g. class Counter. * 
 * All changes required for Task 1 must be performed on a new branch named "T1Branch". 
 * You can create this new branch from our IDE.
 * 
 * @author Author Name: Gen Li Author UPI: gli030
 * @version Date: 07/08/2021
 */

public class Reflector {
    public Object createObject(String fullyQualifiedClassName)
        throws ClassNotFoundException, 
            IllegalAccessException,
            IllegalArgumentException,
            InstantiationException,
            InvocationTargetException,
            NoSuchMethodException,
            SecurityException {
        if (fullyQualifiedClassName == null) {
            throw new NullPointerException("Argument fullyQualifiedClassName is null.");
        }

        return Class.forName(fullyQualifiedClassName)
            .getConstructor()
            .newInstance();
    }

    public HashMap<String, Object> getNamesAndValuesOfPublicFields(Object object)
        throws IllegalAccessException, SecurityException {
        if (object == null) {
            throw new NullPointerException("Argument object is null.");
        }

        HashMap<String, Object> namesAndValuesOfPublicFields = new HashMap<>();

        for (Field field : object.getClass().getFields()) {
            namesAndValuesOfPublicFields.put(field.getName(), field.get(object));
        }

        return namesAndValuesOfPublicFields;
    }

    public List<Method> getPublicParameterlessMethods(Object object) throws SecurityException {
        if (object == null) {
            throw new NullPointerException("Argument object is null.");
        }

        List<Method> methods = new ArrayList<>();

        for (Method method : object.getClass().getMethods()) {
            if (method.getParameterCount() == 0) {
                methods.add(method);
            }
        }

        return methods;
    }
}
