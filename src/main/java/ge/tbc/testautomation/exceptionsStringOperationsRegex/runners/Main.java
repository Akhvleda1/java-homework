package ge.tbc.testautomation.exceptionsStringOperationsRegex.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.figures.Circle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            // Trying to invoke RadiusException
            Circle circle = new Circle(-5);

            // Trying to invoke LimitException
            Circle[] circles = new Circle[6];
            for (int i = 0; i < circles.length; i++){ // For creating multiple similar objects
                circles[i] = new Circle(i + 4); // 4 is an example so each object has diff radius
            }
        }catch (RadiusException | LimitException e){
            // Only one exception can occur at a time
            System.out.println(e.getMessage());
        }

        // String processing
        String txt = "Test Automation Bootcamp 12, 2025";
        System.out.println(txt.substring(5, 15).toLowerCase());
        String[] arr = txt.split(" ");
        for (String each: arr){
            System.out.println(each);
        }
        System.out.println("txt length: " + txt.length());
        System.out.println(txt.replaceAll(" ", "-"));

        // Regex validation
        String[] arrayOfNumbers = {"599-14-15-16", "555-21-23-45", "2311", "511-23-42-23", "555-24-24-25-3"};
        for (String each: arrayOfNumbers){
            if (phoneNumberValidation(each)){
                System.out.println("Number is valid");
            }else {
                System.out.println("Number is invalid");
            }
        }

    }

    private static boolean phoneNumberValidation(String phoneNumber){
        String phoneNumberPattern = ("^(555|595|592|599)\\d{6}$");
        Pattern patternCompiled = Pattern.compile(phoneNumberPattern);
        Matcher matcher = patternCompiled.matcher(phoneNumber.replaceAll("-", ""));
        return matcher.find();
    }
}
