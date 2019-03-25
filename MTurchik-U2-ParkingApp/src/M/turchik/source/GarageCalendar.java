package M.turchik.source;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class GarageCalendar{
    public final GregorianCalendar calendar;

    public GarageCalendar(int i) {
        switch(i){
            case 1:
                this.calendar = new GregorianCalendar();
                inRandomHour();
                inRandomMinute();
                break;
            case 2:
                this.calendar = new GregorianCalendar();
                outRandomHour();
                outRandomMinute();
                break;
            default:
                this.calendar = new GregorianCalendar();
        }
    }

    private void inRandomHour(){
        Random rng = new Random();
        calendar.set(Calendar.HOUR_OF_DAY,rng.nextInt(6) + 7);
    }

    private void outRandomHour(){
        Random rng = new Random();
        calendar.set(Calendar.HOUR_OF_DAY,rng.nextInt(11) + 13);
    }

    private void inRandomMinute(){
        Random rng = new Random();
        calendar.set(Calendar.MINUTE,rng.nextInt(60));
    }

    private void outRandomMinute(){
        Random rng = new Random();
        calendar.set(Calendar.MINUTE,rng.nextInt(60));
    }
}
