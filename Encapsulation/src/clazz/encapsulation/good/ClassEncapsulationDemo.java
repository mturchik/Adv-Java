package clazz.encapsulation.good;

/**
 * This demo is an example of Class encapsulation, where entire classes of 
 * objects are hidden (encapsulated) from the calling code. 
 * 
 * This hiding of other classes reduces dependencies that limit flexibility. It 
 * also makes the calling code (the code in this class) simpler by hiding 
 * details of how the work is performed. "Principle of Least Knowledge" is an 
 * important design principle that states that any given class should know the 
 * least possible about other classes in the system.
 * 
 * Think about how you use your real Car. You don't have to know how a Car 
 * works to start the car. You just have to know that you must turn the key. All 
 * off the other technical details (there are many!!) are hidden (encapsulated) 
 * by that key switch. You know as little as possible about how the rest of 
 * the car works.
 * 
 * @author jlombardo
 */
public class ClassEncapsulationDemo {
    public static void main(String[] args) {
        Car car = new Car(6);
        car.start();
        
        
        
        
        
        
        
        
        CarReportService carServ = new CarReportService(car);
        System.out.println("Information about your car:");
        carServ.produceEngineType();
        carServ.produceRunningStatus();
        
        car.turnOff();
        carServ.produceRunningStatus();
        
    }
}
