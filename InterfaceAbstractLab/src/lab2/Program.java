package lab2;

public class Program {
    public static void main(String[] args) {
        /* The main pro of using this type of architecture is being able to be strict in making each class that
         * implements the interface have all the methods, with the ability to have their own modifications to
         * how the method is defined. This is a rough method without applying a parent class to have the
         * common/generalized method definitions as there is plenty of repitition between all three courses,
         * which would only get worse as more courses are added.
         */

        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "330", 2, "N/A");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java Programming", "331", 3, "Intro to Programming");
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java Programming", "332", 4, "Intro to Java Programming");
        System.out.println(introProgramming.printCourse());
        System.out.println(introJava.printCourse());
        System.out.println(advancedJava.printCourse());
    }
}
