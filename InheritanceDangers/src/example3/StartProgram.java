package example3;

import javax.swing.*;

/**
 * This is the start class for example3. Notice that it falsely concludes
 * that a 5-year-old dog is elderly. Why? See the Dog and Labrador documentation
 * for an explanation.
 */
public class StartProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        int theAge = 5;
        lab.setRealAge(theAge);
        if(lab.isOld()) {
            JOptionPane.showMessageDialog(null, "Your " + theAge + "-year-old dog is elderly!");
        } else {
             JOptionPane.showMessageDialog(null, "Your " + theAge + "-year-old dog is a youngster!");
       }
    }

}
