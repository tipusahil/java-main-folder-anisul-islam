// package  user_input_in_java;

import java.util.Scanner;//scanner ta java util theke import kora holo jevabe react e ekta component er sate arekta componente import exprot kroa hoi ovabe.

public class UserInput2 { //class
    public static void main (String[] args) {// main method

        double doubleNumberFromUser = 10;
Scanner userInput2 = new Scanner(System.in);// ei line diyei user theke input newa hi tobe scanner ta java util theke nite import korte hbe.


System.out.println("user apnr doubleNum ta den: ");

doubleNumberFromUser = userInput2.nextDouble();// user theke ei Scanner inputName er maddome input niye seta  (doubleNumberFromUser) ei variable e setup krote hobe.
String output1 = String.format("user er input holo %.3f", doubleNumberFromUser);
// ekane format specifier maddome lika hoise & ekto dynamic howar jonno ((%.3f) lika hoise jetar kaj holo dosomik er pore kotogor bosbe eta define kroe dewa) 

System.out.println("user theke newa doubleNum input holo = " + output1 );

    }
}
