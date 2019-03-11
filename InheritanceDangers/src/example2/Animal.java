package example2;

import javax.swing.*;

/**
 * This class is the super class of all animal objects in this program.
 * It provides one method that all sub classes can use. Only problem is,
 * the method is poorly written.
 */
public abstract class Animal {
    
    /**
     * This method expects a String value as a parameter (message).
     * Just to be safe, it checks to make sure the incoming argument is a
     * String with a length greater than 0. Good idea! But the author forgot
     * to check for message == null. As a result, if message is null, the if
     * statement will error out with a NullPointerException. This means that
     * we tried to call a method length() that belongs to an object stored in
     * the message variable. But message == null. If that's so, we have no object,
     * and therefore cannot call a method that belongs to a non-existing object.
     * We are only allowed to call methods when we have real objects. Null means
     * we have no object. That's why we get NullPointerException. The message
     * variable contains a pointer to null, or nothing!
     * 
     * One more thing, do we always want the message displayed in a JOptionPane?
     * Here we have little choice.
     * 
     * @param message - a String value for a message to be spoken.
     */
    public void speak(String message) {
        // should check for null first: if(message == null || message.length() == 0)
        if(message.length() == 0) {  
            message = "[mute]";
        }
         JOptionPane.showMessageDialog(null, message);
    }
}
