package example3;

import javax.swing.*;

/**
 * This class demonstrates a problem that is more common that most people
 * realize ... incorrect or inappropriate logic. Here the author uses an incorrect
 * formula for an adjusted dog's age. (See explanation below).
 *    
 * Mistakes like these are easily missed and very difficult to discover because they
 * do not cause the program to crash or produce runtime errors. These are 
 * called "logic errors" and no amount of documentation will reveal the problem.
 * The only way anyone would know a mistake was made, is to examine the source
 * code. This is often not available, or if it is, not worth of examination
 * because we assume the logic is correct. Notice the documentation is correct
 * below, but for some reason, the implementation is not.
 */
public abstract class Dog {
    private int realAge;
  
    /**
     * Gets a dog's adjusted age -- the age by which we measure how a dog feels
     * and behaves -- by taking the animal's real age in years and 
     * multiplying that value by 5 to represent a dog's adjusted age,
     * based on the fact that dogs age at 5x the rate of humans (some people say
     * that dogs age at 7x the rate of humans, but your instructor thinks that
     * number is too high).
     * 
     * Said another way, a dog's life is 1/5th that of a 
     * human. Therefore, it is common to adjust the age of a dog by a factor of 
     * 5 to represent how old the dog feels and behaves. A 15-year-old 
     * (real years) dog will feel like and exhibit behaviors of a 75-year old 
     * (e.g., arthritis, less stamina and muscle, etc.)
     * 
     * @return the adjusted age of the dog. BUT NOTICE THAT THE AUTHOR OF
     * THIS CLASS MADE A BIG MISTAKE -- THE FORMULA IS VERY WRONG! THIS IS
     * GOING TO BE A PROBLEM FOR THE AUTHOR OF THE LABRADOR CLASS WHO PROGRAMS
     * A TEST BASED ON THE ASSUMPTION THAT THE FORMULA FOR ADJUSTED AGE IS
     * CORRECT.
     */
//    public int getAdjustedAge() {
//        return realAge * 15;
//    }
    public int getAdjustedAge() {
        return realAge * 7;
    }

    /**
     * Sets a dog's age in real years (non-adjusted).
     * 
     * @param realAge - the real number of years the animal has been alive.
     */
    public void setRealAge(int realAge) {
        this.realAge = realAge;
    }
 
    /**
     * Get the age of the dog in actual years (non-adjusted)
     * @return the real age of the dog
     */
    public int getRealAge() {
        return realAge;
    }


}
