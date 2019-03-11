package clazz.encapsulation.good;

import javax.swing.JOptionPane;

/**
 * This class is entirely hidden from the startup class and the Car class, 
 * therfore, it can be changed without causing harm to other classes.
 * 
 * @author jlombardo
 */
public class CarReportService {
    private Car car;
    
    public CarReportService(Car car) {
        this.car = car;
    }
    
    public void doOutput(String msg) {
        //System.out.println(msg);
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public void produceRunningStatus() {
        JOptionPane.showMessageDialog(null,"Car running status: " + car.isRunning());
    }
    
    public void produceEngineType() {
        System.out.println("Engine Type: " + car.getEngineType());
    }
}
