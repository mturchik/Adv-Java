package composition.sample1;

/**
 *
 * @author jlombardo
 */
public class Major {
    private Sargeant sarg;
    
    public Major() {
        sarg = new Sargeant();
    }
    
    public PrivateFirstClass findPrivateRyan() {
        PrivateFirstClass pfc = sarg.findPrivateRyan();
        return pfc;
    }
}
