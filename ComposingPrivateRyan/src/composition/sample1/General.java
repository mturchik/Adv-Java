package composition.sample1;

/**
 *
 * @author jlombardo
 */
public class General {
    private Colonel colonel;
    
    public General() {
        colonel = new Colonel();
    }
    
    public PrivateFirstClass findPrivateRyan() {
        PrivateFirstClass pfc = colonel.findPrivateRyan();
        return pfc;
    }
}
