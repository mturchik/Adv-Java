package method.encap.demo.good;

/**
 * This example fixes the problems in example1 and follows good encapsulation.
 * Notice the properties are declared private and most methods are also private.
 * Only a small number of methods are public, hiding the private helper methods.
 * This makes the class easier to use. Finally, method arguments are tested
 * for validity before values are copied into properties.
 *
 * @author jlombardo
 */
public class MethodEncapsulationDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cake cake = new Cake();

        // Simple now -- only one method to understand. Other methods are
        // hidden away (encapsulated) by this method.
        cake.make(2);
    }

}
