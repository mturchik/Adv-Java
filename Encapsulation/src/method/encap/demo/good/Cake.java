package method.encap.demo.good;

import javax.swing.JOptionPane;

/**
 * This class is an abstraction of a real cake object. It demonstrates good
 * method encapsulation. Notice how helper methods are made private IF they
 * aren't needed anywhere else (maybe true, maybe not), and that these 
 * helper methods are called from a single parent methods, which controls
 * the order that things happen, which could be very important.
 * 
 * Also, notice that method parameters are validated, making those operations
 * more reliable.
 * 
 * @author jlombardo
 */
public class Cake {
    // Good encapsulation: private scope
    // property can only be referenced inside this class.
    private int quantity;

    // Good encapsulation: public getter and setter methods
    // control access to properties. Arguments are validated.
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0 || quantity > 10) {
            throw new IllegalArgumentException("quantity must be greater than 0...");
            //System.exit(1);
        }
        this.quantity = quantity;
    }

    // Good encapsulation: small number of public methods that use
    // large number of private helper methods. Simplifies the interface
    // to this class from other code.
    public void make(int quantity) {
        this.setQuantity(quantity);
        this.gatherIngredients();
        this.mixIngredients();
        this.bake();
        this.takeFromOvenAndLetCool();
    }

    
    // NOTE: we are still violating SRP because we are using output statements
    // which is not a responsibility of this class. However, to keep things
    // simple we'll use these as placeholders for real code that would be
    // here if we spent more time on the simulation.
    
    private void gatherIngredients() {
        System.out.println("Ingredients gathered");
    }

    private void mixIngredients() {
        System.out.println("Ingredients mixed");
    }

    private void bake() {
        System.out.println("Baking...");
    }

    private void takeFromOvenAndLetCool() {
        System.out.println("All done baking, removed from oven, cooling...");
    }
}
