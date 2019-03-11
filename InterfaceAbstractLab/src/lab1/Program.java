package lab1;

public class Program {

    public static void main(String[] args) {
        /* The use of super classes allows for the flexibile addition of new courses while making sure that previous classes
         * still share the common attributes and methods.
         */

        /* Declaring all courses as the parent class of 'course' makes the objects flexible, but disallows easy access to the course-specific attribute
         * of prerequisites. While it's possible to store it in the parent class, as not all children make use of it, I view it as a waste to do so.
         */
        Course introProgramming = new IntroToProgrammingCourse("Intro to Programming", "330", 2);
        Course introJava = new IntroJavaCourse("Intro to Java Programming", "331", 3, "Intro to Programming");
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java Programming", "332", 4, "Intro to Java Programming");
        System.out.println(introProgramming.printCourse());
        System.out.println(introJava.printCourse());
        System.out.println(advancedJava.printCourse());
    }

}
