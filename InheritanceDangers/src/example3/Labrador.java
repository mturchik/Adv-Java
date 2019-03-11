package example3;

/**
 * This class inherits all the properties and methods of the Dog class and
 * does so invisibly. By that I mean you are not required to redeclare all
 * of the methods you are inheriting (as you would if these were abstract
 * methods). Instead, you just automatically have access to Dog's methods. 
 * But what you don't know can hurt you. And unless you read the documentation 
 * for these methods, you may reach the wrong conclusions about what they do 
 * and how they do it.
 * 
 * Here the author creates a method isOld(), which attempts to determine whether
 * a particular Labrador is old or young based on its adjusted age, which it 
 * retrieves using the inherited method getAdjustedAge(). However, what the 
 * author doesn't know is that the Dog author implemented this method to adjust 
 * the real age of the dog by a factor of 15. That adjustment is too large! 
 * It should be 5x, not 15x.
 * 
 * In this case the program will report that a Labrador of real age = 5 is elderly,
 * when in fact a 5-year-old dog is not elderly, even if we adjust the age by 5, as
 * is commonly done, producing a result of 25. But because the inherited method
 * erroneously adjusts by a factor of 15, the isOld() method in the Labrador
 * class (see below) reports that the dog is elderly!
 * 
 * This happened because we inherited bad code and made assumptions about what
 * an inherited method actually returned. Can you see how problematic and difficult
 * this is to solve? Imagine more complex code. No wonder bugs slip through unnoticed!
 * And it gets worse. Imagine there were hundreds of subclasses of Dog -- each
 * using the inherited method getAdjustedAge() inappropriately. Assuming you would even
 * recognized the problem, you would have hundreds of edits to make.
 * 
 * This problem could have been prevented if the author of the Dog class had
 * written better code. However, a more fool-proof idea is to make the 
 * getAdjustedAge() method abstract in the Dog class. Of course, since Dog was
 * declared abstract, the temptation is to produce reusable code. That's fine
 * as long as the code is good code. An alternative would have been to declare
 * Dog as an interface and leave the implementation of getAdjustedAge up to the 
 * authors of Labrador and others. The key is not whether the Dog class is
 * declared as an abstract class or an inteface. They key is to declare
 * getAdjustedAge() abstract.
 */
public class Labrador extends Dog {

    public boolean isOld() {
        boolean isOld = false;
        
        // This logic assumes the adjusted age was calculated correctly.
        // If we have a dog whose age is 5 actual years, then assuming a standard
        // formula of 5 * 5 = 25 adjusted years, this test should result in 
        // the dog being characterized as young. But that's not what happens!
        // Pity the programmer who inherits code they don't understand!
        if(getAdjustedAge() >= 60) {
            isOld = true;
        }
        
        return isOld;
    }
}
