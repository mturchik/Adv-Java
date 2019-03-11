package method.encap.demo.good;

import java.util.Scanner;

/**
 * Here are some simple demos of method encapsulation, where code is
 * modularized into separate methods, which can be reusable, and which 
 * reduce complexity in the parent method (the calling method). Notice how
 * helper methods are often private. It's just a question of whether you
 * want to provide direct access to these methods or not. In this case, the
 * methods should only be used by Used by produceCarInsuranceQuote2().
 * 
 * In addition, code in the helper methods can easily be changed without 
 * affecting the code in the parent method. Greater flexibility.
 * 
 * One problem with this class: it violates the Single Responsibility 
 * Principle. Can you identify why?
 * 
 * @author jlombardo
 */
public class MethodEncapsulationDemo2 {
    
    // No Ecapsulation, No reusable code, lots of complexity. Compare this
    // with the second version below. (Note: again we're using println
    // statements where they shouldn't be. Just ignore this for now because
    // we're focusing on other things.
    public void produceCarInsuranceQuote() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        if (age >= 16) {
            // old enough to drive
            System.out.print("\nWhat is the value of your Car? ");
            int carValue = scan.nextInt();
            if (carValue > 30_000) {
                System.out.println("\nYour insurance will cost you $"
                        + (carValue * 0.005) + " per month");
            } else {
                System.out.println("\nYour insurance will cost you $"
                        + (carValue * 0.003) + " per month");
            }

        } else {
            System.out.println("\nSorry you aren't old enough to drive so we cannot provide an insurance quote");
        }
    }

    // Some complexity hidden (encapsulated) by reusable methods
    public void produceCarInsuranceQuote2() {
        int age = getAge();
        boolean isOldEnoughToDrive = determineEligibility(age);
        if (isOldEnoughToDrive) {
            int carValue = getCurrentValueOfCar();
            produceCarQuote(carValue);
        } else {
            producePolicyDenialMessage();
        }
    }

    // Used by produceCarInsuranceQuote2()
    private int getAge() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        return age;
        
//        String result = JOptionPane.showInputDialog(null, "How old are you? ");
//        return Integer.parseInt(result);
    }

    // Used by produceCarInsuranceQuote2()
    private boolean determineEligibility(int age) {
        boolean isOldEnough = false;

        if (age >= 16) {
            isOldEnough = true;
        }

        return isOldEnough;
    }

    // Used by produceCarInsuranceQuote2()
    private int getCurrentValueOfCar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWhat is the value of your Car? ");
        int value = scan.nextInt();
        return value;
    }
    
    // Used by produceCarInsuranceQuote2()
    private void produceCarQuote(int carValue) {
        if (carValue > 30_000) {
            System.out.println("\nYour insurance will cost you $"
                    + (carValue * 0.005) + " per month");
        } else {
            System.out.println("\nYour insurance will cost you $"
                    + (carValue * 0.003) + " per month");
        }
    }
    
    // Used by produceCarInsuranceQuote2()
    private void producePolicyDenialMessage() {
        System.out.println("\nSorry you aren't old enough to drive so we cannot provide an insurance quote");
    }
    
    public static void main(String[] args) {
        MethodEncapsulationDemo2 app = new MethodEncapsulationDemo2();
        app.produceCarInsuranceQuote2();
    }
}
