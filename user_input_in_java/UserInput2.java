// package  user_input_in_java;

import java.util.Scanner;//scanner ta java util theke import kora holo jevabe react e ekta component er sate arekta componente import exprot kroa hoi ovabe.

public class UserInput2 { //class
    public static void main (String[] args) {// main method

        double doubleNumberFromUser = 10;
Scanner userInput2 = new Scanner(System.in);// ei line diyei user theke input newa hi tobe scanner ta java util theke nite import korte hbe.



doubleNumberFromUser = userInput2.nextDouble();// user theke ei Scanner inputName er maddome input niye seta  (doubleNumberFromUser) ei variable e setup krote hobe.

System.out.println("user theke newa doubleNum input holo: " + doubleNumberFromUser);




    }
}
