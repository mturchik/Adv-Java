package M.turchik.source;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * The Ledger Class holds an ArrayList of Tickets, allows creation of new tickets, and saving of tickets to a file.
 * @author Mark Turchik
 * @version 1.0 - First Release by Mark Turchik
 */
public class Ledger {
    private final List<Ticket> ledger = new ArrayList<Ticket>();
    private final File file = new File("TicketLedger.csv");

    /**
     * Default constructor initializes the Ticket List 'ledger' from the saved file by reading ticket information
     * from the file and creating Tickets to populate the ArrayList
     */
    public Ledger(){
        try{
            Scanner input = new Scanner(file);
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] lineInfo = line.split(",");
                Calendar newIn = Calendar.getInstance();
                newIn.setTime(sdf.parse(lineInfo[0]));
                Calendar newOut = Calendar.getInstance();
                newOut.setTime(sdf.parse(lineInfo[1]));
                ledger.add(new Ticket(newIn, newOut, Double.parseDouble(lineInfo[2])));
            }
            input.close();
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a new Ticket and adds it to the end of the ledger List
     */
    public void createTicket(){
        ledger.add(new Ticket());
    }

    /**
     * Checks the last ticket made in, and prints the time for the user.
     */
    public void inTicket(){
        ledger.get(ledger.size() - 1).checkIn();
        ledger.get(ledger.size() - 1).printIn();
    }

    public void outTicket(){
        ledger.get(ledger.size() - 1).checkOut();
        ledger.get(ledger.size() - 1).calculateFee();
        ledger.get(ledger.size() - 1).print();
        saveTickets();
    }

    public void lostTicket(){
        ledger.get(ledger.size() - 1).lost();
        ledger.get(ledger.size() - 1).print();
        saveTickets();
    }

    private void saveTickets(){
        try{
            PrintWriter output = new PrintWriter(file);
            for (Ticket toSave : ledger) {
                output.println(toSave.toString());
            }
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printTotal(){
        int numNorm = 0;
        int paidNorm = 0;
        int numLost = 0;
        int paidLost = 0;
        for (Ticket t :
                ledger) {
            if (t.isLost()) {
                numLost++;
                paidLost += t.getFee();
            }else{
                numNorm++;
                paidNorm += t.getFee();
            }
        }
        System.out.println("==============================");
        System.out.println("===Tickets to date: " + Ticket.getVehicleNumber());
        System.out.println("==============================");
        System.out.println("===$" + paidNorm + " was collected from " + numNorm + " tickets.");
        System.out.println("===$" + paidLost + " was collected from " + numLost + " tickets.");
        System.out.println("==============================");
        System.out.println("===$" + (paidLost + paidNorm) + " collected overall.");
        System.out.println("==============================");
    }
}
