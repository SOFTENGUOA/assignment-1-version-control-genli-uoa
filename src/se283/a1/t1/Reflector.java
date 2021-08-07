package se283.a1.t1;

import java.lang.reflect.Field;
import java.util.HashMap;

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
    public Object createClass(String fullyQualifiedClassName)
        throws ClassNotFoundException, 
            IllegalAccessException,
            IllegalArgumentException,
            InstantiationException,
            InvocationTargetException,
            NoSuchMethodException,
            SecurityException {
        return Class.forName(fullyQualifiedClassName)
            .getConstructor()
            .newInstance();
    }

    public HashMap<String, String> getNamesAndValuesOfFields(Object object) throws SecurityException {
        HashMap<String, String> namesAndValuesOfFields = new HashMap<>();
        for (Field field : object.getClass().getFields()) {
            namesAndValuesOfFields[field.getName()] = field.get(object);
        }
        return namesAndValuesOfFields;
    }
}
