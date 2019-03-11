package example1;
    
/**
 * This class inherits all the default behaviors (methods) from Animal.
 * However, the author recognized that Dog objects should bark, so to be able
 * to provide that behavior, the author chose to override the speak() method.
 * Certainly this solves the problem of not barking. However, the author of
 * this class chose to send the "bark" message to the console. Is this always
 * what we want? What if someone else wants to reuse the Dog class, but in a
 * GUI based program?
 * 
 * Furthermore the author of Dog forgot to copy the "bark" message into the
 * spokenMessage property by calling setSpokenMessage(). As result, the state
 * of the spokenMessage is inconsistent with the actual message spoken. If
 * another programmers references the a dog object and calls getSpokenMessage(),
 * the result will be "mute". Ooooops!
 */
public class Dog extends Animal {
    public void speak() {
         System.out.println("bark");
    }

}
