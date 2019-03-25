package M.turchik.test;

import org.junit.Test;
import M.turchik.source.Ticket;
import M.turchik.source.Ledger;

import static org.junit.Assert.assertTrue;

public class TicketTest {
    @Test
    public void testFee(){
        Ledger ledger = new Ledger();
        for (Ticket t :
                ledger.getLedger()) {
            assertTrue("Fee must be greater than 0. ", t.getFee() > 0);
        }
    }

    @Test
    public void testLost(){
        Ledger ledger = new Ledger();
        for (Ticket t :
                ledger.getLedger()) {
            assertTrue("Lost tickets must have a $25 fee. ", t.isLost() && t.getFee() == 25);
        }
    }
}
