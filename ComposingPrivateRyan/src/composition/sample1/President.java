package composition.sample1;

/**
 *
 * @author jlombardo
 */
public class President {
    public static void main(String[] args) {
        General general = new General();
        PrivateFirstClass pRyan = general.findPrivateRyan();
        System.out.println("Found " + pRyan.getName());
    }
}
