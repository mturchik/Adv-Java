package M.turchik;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

@SuppressWarnings("ALL")
class Ticket {
    private final Calendar inTime;
    private final Calendar outTime;
    private double fee;
    private boolean lost;
    private static int vehicleNumber = 0;

    public Ticket(){
        this.inTime = Calendar.getInstance();
        this.outTime = Calendar.getInstance();
        this.fee = 5;
        this.lost = false;
        vehicleNumber++;
    }

    public Ticket(Calendar inTime, Calendar outTime, double fee) {
        this.inTime = inTime;
        this.outTime = outTime;
        this.fee = fee;
        lost = fee == 25;
        vehicleNumber++;
    }

    public void checkIn(){
        GarageCalendar date = new GarageCalendar(1);
        inTime.setTime(date.calendar.getTime());
    }

    public void checkOut(){
        GarageCalendar date = new GarageCalendar(2);
        outTime.setTime(date.calendar.getTime());
    }

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

    public double getFee() {
        return fee;
    }

    public void lost(){
        fee = 25;
        lost = true;
    }

    public boolean isLost() {
        return lost;
    }

    public static String getVehicleNumber(){
        return Integer.toString(vehicleNumber);
    }

    public void print(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMM'-'d HH:mm a", Locale.ENGLISH);
        if(lost) {
            System.out.println("==============================");
            //noinspection SpellCheckingInspection
            System.out.println("===Receipt===Vehicle #: " + vehicleNumber);
            System.out.println("==============================");
            System.out.println("=TICKET LOST==================");
            System.out.println("==============================");
            System.out.println("=Fee Due: $" + fee);
            System.out.println("==============================");
        }else{
            System.out.println("==============================");
            System.out.println("===Receipt===Vehicle #: " + vehicleNumber);
            System.out.println("==============================");
            System.out.println("=IN>  " + sdf.format(inTime.getTime()));
            System.out.println("=OUT> " + sdf.format(outTime.getTime()));
            System.out.println("==============================");
            System.out.println("=Fee Due: $" + fee);
            System.out.println("==============================");
        }
    }

    public void printIn(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMM'-'d HH:mm a", Locale.ENGLISH);
        System.out.println("==============================");
        System.out.println("===Vehicle #: " + vehicleNumber);
        System.out.println("==============================");
        System.out.println("=IN>  " + sdf.format(inTime.getTime()));
        System.out.println("==============================");
    }

    @Override
    public String toString(){
        return inTime.getTime() + "," + outTime.getTime() + "," + fee;
    }
}
