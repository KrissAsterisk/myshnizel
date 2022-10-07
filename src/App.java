import helpers.ConsoleColours;
import helpers.InputReader;

import java.awt.event.InputEvent;


public class App
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
        String userName;
        userName = InputReader.getString("Gimme your name chief: ");
        System.out.println("Sup' "+userName);
        int favoriteNumber;
        favoriteNumber = InputReader.getInt("Type in your favorite number: ");
        System.out.println("Sick, I like "+favoriteNumber+" too");

    }
    public static void Calculate(){
        System.out.println("Calculating Rectangle");
        int length, height;
        length = InputReader.getInt("Gimme the length of rectangle in cm: ");
        height = InputReader.getInt("What is the height? in cm: ");
        
    }
}
