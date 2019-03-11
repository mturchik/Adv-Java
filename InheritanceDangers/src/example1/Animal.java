package example1;

import javax.swing.*;

/**
 * This class represents the super class of all animals used in example1. It
 * was declared abstract so that you could not instantiate Animals directly.
 * Rather you are forced to instantiate specific types of animals, such as Cat,
 * Dog, etc. This is an appropriate use of an abstract class.
 * 
 * However, there is a problem in the design of this class. The author assumes
 * that subclass authors will want a JOptionPane to display spoken messages. The
 * author further assumes that the setSpokenMessage() method will be used BEFORE
 * calling speak(). That way, the animal will speak the appropriate message. 
 * Unfortunately, the sub class authors didn't always appreciate this and either
 * overrode the speak() method (because they could) or ignored the spokenMessage
 * property, or used the default implementation of speak(). Rarely were any
 * of these actions appropriate.
 */
public class Animal {
    String spokenMessage = "[mute]";
    
    public void speak() {
         JOptionPane.showMessageDialog(null, getSpokenMessage());
    }
    
    public void setSpokenMessage(String value) {
        spokenMessage = value;
    }
    
    // Should be consistent with what speak() says.
    public String getSpokenMessage() {
        return spokenMessage;
    }
}
