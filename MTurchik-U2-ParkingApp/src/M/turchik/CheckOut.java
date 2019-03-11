package M.turchik;

public class CheckOut extends Machine{

    @Override
    public void access() {
        System.out.print("===Grand View Parking Garage==\n" +
                "==============================\n" +
                "=1) Check out\n" +
                "=2) Lost Ticket\n" +
                "=>");
        String input = keyboard.nextLine().toLowerCase();
        switch (input) {
            case "1":
            case "out":
            case "check out":
                ledger.outTicket();
                Garage.empty();
                break;
            case "2":
            case "lost":
            case "lost ticket":
                ledger.lostTicket();
                Garage.empty();
                break;
            default:
                System.out.println("===Unacceptable Input");
        }
    }
}
