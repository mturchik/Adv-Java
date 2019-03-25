package M.turchik.source;

public class CheckIn extends Machine{

    @Override
    public void access() {
        System.out.print("===Grand View Parking Garage==\n" +
                "=1) Check In\n" +
                "=2) Close Garage\n" +
                "=>");
        String input = keyboard.nextLine().toLowerCase();
        switch (input) {
            case "1":
            case "in":
            case "check in":
                ledger.createTicket();
                ledger.inTicket();
                Garage.fill();
                break;
            case "2":
            case "close":
            case "close garage":
                ledger.printTotal();
                Garage.close();
                break;
            default:
                System.out.println("===Unacceptable Input");
        }
    }
}
