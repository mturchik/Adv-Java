package method.encap.demo.poor;

/**
 * This is an example of a program that violates encapsulation rules. Proper
 * encapsulation means that classes should have only private properties, with
 * public getter and/or setter methods for accessibility. Furthermore, setter
 * methods or any methods that have arguments should test the validity of
 * those arguments before setting the internal property. Finally, not all
 * methods in a class need to be public. Some methods can be thought of as
 * helper methods that can be used by other primary methods. In this case, the
 * helper method should be declared private while the primary method may be
 * declared public. Finally, there should only be a few methods that are public,
 * with the vast majority of methods declared private. This simplifies the
 * programming interface to the class.
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cake cake = new Cake();

        // why do we need 4 methods to do what one method could do?
        cake.quantity = -1; // shouldn't be able to do this, but because
                            // it's public, we can!
        cake.gatherIngredients(2);
        cake.mixIngredients();
        cake.bake();
        cake.takeFromOvenAndLetCool();
    }

}
