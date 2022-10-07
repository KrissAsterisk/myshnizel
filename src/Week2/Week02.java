package Week2;

import helpers.InputReader;

public class Week02
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();


        int age = InputReader.getInt("What is your age? > ");
        if (age < 18) {
            System.out.println("You are not old enough to access this program");
            System.exit(0);
        } else {
            System.out.print("You are old enough to access this program, congrats :)");

        }
    }

    
}
