package composition.sample1;

/**
 *
 * @author jlombardo
 */
public class Sargeant {
    private PrivateFirstClass grunt;
    
    public Sargeant() {
        grunt = new PrivateFirstClass("Grunt");
    }
    
    public PrivateFirstClass findPrivateRyan() {
        PrivateFirstClass pfc = grunt.findPrivateRyan();
        return pfc;
    }
}
