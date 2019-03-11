package composition.sample1;

/**
 *
 * @author jlombardo
 */
public class PrivateFirstClass {
    private String name;
    
    public PrivateFirstClass(String n) {
        name = n;
    }
    
    
    public PrivateFirstClass findPrivateRyan() {
        // pretend we found him!
        PrivateFirstClass pfc = new PrivateFirstClass("Private Ryan");
        return pfc;
    }
    
    public String getName() {
        return name;
    }
}
