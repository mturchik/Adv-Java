package composition.sample1;

/**
 *
 * @author jlombardo
 */
public class Colonel {
    private Major major;
    
    public Colonel() {
        major = new Major();
    }
    
    public PrivateFirstClass findPrivateRyan() {
        PrivateFirstClass pfc = major.findPrivateRyan();
        return pfc;
    }
    
}
