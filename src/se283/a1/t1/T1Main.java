package se283.a1.t1;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Scanner;

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
 * @version Date: 07/08/2021
 */

public class T1Main {
    private static final String MENU = "1. Choose a class, view its public fields and methods, and execute one of the methods.\n2. Quit.";
    private static final Scanner input = new Scanner(System.in);
    private static final Reflector reflector = new Reflector();

	public static void main(String[] args) {
        while (true) {
            System.out.println(MENU);
            System.out.print("Choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    executeChoiceOne();
                    break;
                case "2":
                    return;
                default:
                    System.err.println(choice + " is an invalid choice.");
            }
        }
    }
    
    private static void executeChoiceOne() {
        try {
            System.out.print("Fully Qualified Class Name: ");
            Object object = reflector.createObject(input.nextLine());
            printNamesAndValuesOfPublicFields(object);
            printPublicParameterlessMethods(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void printNamesAndValuesOfPublicFields(Object object) {
        System.out.println("Names and Values of Public Fields");
        try {
            for (Map.Entry<String, Object> nameAndValueOfField : reflector.getNamesAndValuesOfPublicFields(object).entrySet()) {
                System.out.println("\t" + nameAndValueOfField.getKey() + ":" + nameAndValueOfField.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printPublicParameterlessMethods(Object object) {
        System.out.println("Public Methods");
        try {
            for (Method method : reflector.getPublicParameterlessMethods(object)) {
                System.out.println("\t" + method);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
