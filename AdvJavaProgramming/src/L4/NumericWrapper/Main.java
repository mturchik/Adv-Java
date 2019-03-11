package L4.NumericWrapper;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //Numeric Wrapper Classes
    //
    //    Create a class that includes a main method that asks the user for a number.
    //    The code should then determine which data type that uses the least amount of memory the number fits into.
    //    The name of the data type should be printed out.

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = keyboard.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z!@#$%^&*(),./<>?{}]");
        while(pattern.matcher(input).find()){
            System.out.println("That's not a number! This is a number: ");
            input = keyboard.nextLine();
        }
        int intIn = Integer.parseInt(input);
        switch(bestType(intIn)){
            case "Byte":
                System.out.println("A Byte is needed.");
                break;
            case "Short":
                System.out.println("A Short is needed.");
                break;
            case "Int":
                System.out.println("An Int is needed.");
                break;
            case "Long":
                System.out.println("A Long is needed.");
                break;
            default:
        }
    }

    public static String bestType(int in){
        String result = "";
        if(in >= -128 && in <= 127){
            result = "Byte";
        }else if(in >= (-2 * 10e15) && in <= (2 * 10e15 - 1)){
            result = "Short";
        }else if(in >= (-2 * 10e31) && in <= (2 * 10e31 - 1)){
            result = "Int";
        }else if(in >= (-2 * 10e63) && in <= (2 * 10e63 - 1)){
            result = "Long";
        }
        return result;
    }
}
