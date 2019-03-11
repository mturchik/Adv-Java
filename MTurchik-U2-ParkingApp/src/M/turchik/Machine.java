package M.turchik;

import java.util.Scanner;

abstract class Machine implements Usable {
    final Scanner keyboard = new Scanner(System.in);
    static final Ledger ledger = new Ledger();
}
