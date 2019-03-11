package composition.sample1;

/**
 * A simple example of how objects delegate work to other objects.
 * @author jlombardo
 */
public class StartFindingPrivateRyan {
    public static void main(String[] args) {
        // Need to give order to general to find private ryan. To do this
        // we need a general object
        General general = new General();
        
        // Now give the order
        PrivateFirstClass ryan = general.findPrivateRyan();
        
        // if found, prove it!
        System.out.println("Found " + ryan.getName());
    }
}
