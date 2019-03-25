package M.turchik.source;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * The Ticket Class holds the relevant ticket information including the time in, time out, the fee due, whether the ticket was lost,
 * as well as the total number of vehicles served.
 * @author Mark Turchik
 * @version 1.0 - First Release by Mark Turchik
 */
public class Ticket {
    private final Calendar inTime;
    private final Calendar outTime;
    private double fee;
    private boolean lost;
    private static int vehicleNumber = 0;

    /**
     * Default Constructor generates a blank Calendar for the in and out times as well as the blanket $5 fee.
     */
    public Ticket(){
        this.inTime = Calendar.getInstance();
        this.outTime = Calendar.getInstance();
        this.fee = 5;
        this.lost = false;
        vehicleNumber++;
    }

    /**
     * Detailed Constructor generates a Ticket based on previously known information, typically from the previously made file.
     * @param inTime Recorded time Ticket got checked in of Garage
     * @param outTime Recorded time Ticket got checked out of Garage
     * @param fee $ Amount due
     */
    public Ticket(Calendar inTime, Calendar outTime, double fee) {
        this.inTime = inTime;
        this.outTime = outTime;
        this.fee = fee;
        lost = fee == 25;
        vehicleNumber++;
    }

    /**
     * Generates a random time between 7am and Noon for the Ticket checkIn Calendar
     */
    public void checkIn(){
        GarageCalendar date = new GarageCalendar(1);
        inTime.setTime(date.calendar.getTime());
    }

    /**
     * Generates a random time between 1pm and 11pm for the Ticket checkOut Calendar
     */
    public void checkOut(){
        GarageCalendar date = new GarageCalendar(2);
        outTime.setTime(date.calendar.getTime());
    }

    /**
     * Calculates the total Fee due based on the inTime and outTime currently on the ticket.
     */
    public void calculateFee(){
        double hoursStayed = outTime.get(Calendar.HOUR_OF_DAY) - inTime.get(Calendar.HOUR_OF_DAY);
        double minutesStayed = outTime.get(Calendar.MINUTE) - inTime.get(Calendar.MINUTE);
        double timeStayed = hoursStayed + (minutesStayed / 60);
        for(int i = 3; i < timeStayed; i++){
            fee++;
        }
        if(fee > 15){
            fee = 15;
        }
    }

    /**
     * Returns the Fee listed on the Ticket
     * @return fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * Marks ticket as 'lost' and sets the fee to the default of $25
     */
    public void lost(){
        fee = 25;
        lost = true;
    }

    /**
     * Returns whether the ticket has been lost or not as a true or false
     * @return lost
     */
    public boolean isLost() {
        return lost;
    }

    /**
     * Static method to get the number of vehicles served(Or total tickets created)
     * @return vehicleNumber
     */
    public static String getVehicleNumber(){
        return Integer.toString(vehicleNumber);
    }

    /**
     * Prints a graphical display of the all Ticket information.
     * If the ticket was lost, state it was lost.
     * Otherwise, state the inTime and outTime on the ticket.
     * Always give the total Fee due on the ticket.
     */
    public void print(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMM'-'d HH:mm a", Locale.ENGLISH);
        System.out.println("==============================");
        System.out.println("===Receipt===Vehicle #: " + vehicleNumber);
        System.out.println("==============================");
        if(lost) {
            System.out.println("=TICKET LOST==================");
        }else{
            System.out.println("=IN>  " + sdf.format(inTime.getTime()));
            System.out.println("=OUT> " + sdf.format(outTime.getTime()));
        }
        System.out.println("==============================");
        System.out.println("=Fee Due: $" + fee);
        System.out.println("==============================");
    }

    /**
     * Prints an output of the vehicleNumber as well as the time the ticket was checked In.
     */
    public void printIn(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMM'-'d HH:mm a", Locale.ENGLISH);
        System.out.println("==============================");
        System.out.println("===Vehicle #: " + vehicleNumber);
        System.out.println("==============================");
        System.out.println("=IN>  " + sdf.format(inTime.getTime()));
        System.out.println("==============================");
    }

    /**
     * Returns a comma seperated string of the inTime, outTime, and Fee such that the data can be instantiated in the next session.
     * @return inTime + , + outTime + , + fee
     */
    @Override
    public String toString(){
        return inTime.getTime() + "," + outTime.getTime() + "," + fee;
    }
}
