// package user_input_in_java;

import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
         
        // int insideUserValue;

        // System.out.println("hello boss give us your input");
        // insideUserValue = userInput.nextInt();

        String name;
        System.out.println("br give me your name:");
        name = userInput.nextLine();

        // int numbers = 1234;
        // System.out.println(" user er input value holo  = " + insideUserValue);
        System.out.println(" user er input name  = " + name);

    }

}
