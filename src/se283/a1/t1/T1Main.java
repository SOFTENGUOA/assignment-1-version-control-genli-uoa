package se283.a1.t1;

import java.lang.reflect.Method;
import java.util.*;

/**
 * SE283 Assignment 1 Task 1 Main - Instructions 
 * 
 * This class should be implemented to accept the user input 
 * through args[] and delegate the reflection functionality to class Reflector. 
 * 
 * You may implement additional classes if you wish, but this class should be the main program entry
 * point.
 * 
 * You must STAGE, COMMIT and PUSH your changes every time you are 
 * "done" (see the "definition of done" in Agile/Scrum/XP) with writing/changing this class, i.e. 
 * after successfully completing Task 1, Task 2 and Task 3, respectively
 * You may COMMIT and PUSH prematurely too i.e. before each task is completed, but 
 * you "must" COMMIT and PUSH to the remote repo after finishing each of the A1 tasks.
 * 
 * @author Author Name: Gen Li Author UPI: gli030
 * @version Date: 10/08/2021
 */

public class T1Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Reflector reflector = new Reflector();

        try {
            System.out.print("Fully Qualified Class Name: ");
            Object object = reflector.createObject(input.nextLine());

            List<Method> publicParameterlessMethods = reflector.getPublicParameterlessMethods(object);

            while (true) {
                System.out.println("Names and Values of Public Fields");
                for (Map.Entry<String, Object> nameAndValueOfField : reflector.getNamesAndValuesOfPublicFields(object).entrySet()) {
                    System.out.println("\t" + nameAndValueOfField.getKey() + ":" + nameAndValueOfField.getValue());
                }

                System.out.println("Public Parameterless Methods");
                for (Method method : publicParameterlessMethods) {
                    System.out.println("\t" + method);
                }

                System.out.print("Method Name: ");
                String methodName = input.nextLine();
                for (Method method : publicParameterlessMethods) {
                    if (method.getName().equals(methodName)) {
                        Object returnValue = method.invoke(object);
                        if (returnValue != null) {
                            System.out.println("Return Value: " + returnValue);
                        }
                        continue;
                    }
                }
                System.out.println("A method named " + methodName + " is not in class " + object.getClass().getName() + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
