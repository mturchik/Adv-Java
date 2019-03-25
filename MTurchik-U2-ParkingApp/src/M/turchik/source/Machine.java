package M.turchik.source;

import java.util.Scanner;

public abstract class Machine implements Usable {
    final Scanner keyboard = new Scanner(System.in);
    static final Ledger ledger = new Ledger();
}
