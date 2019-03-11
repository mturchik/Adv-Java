package clazz.encapsulation.good;

/**
 * In this good example, notice that the Car talks to the engine so that
 * the Startup class does not need to do this. We're hiding the details
 * of how the engine works by encapsulating those details here.
 *
 * @author jlombardo
 */
public class Car {
    // NO magic numbers -- use constants
    private static final int MIN_CYL = 4;
    private static final int MAX_CYL = 12;
    
    private CarReportService reportService;

    private String engineType;
    // This is good compostion -- the engine object is a component of the Car object
    // It's used correctly here. Car delegates to Engine and the Engine itelf
    // and its functions are hidden from the Startup class (or any other class)
    // resulting in good encapsulation.
    private Engine engine;

    // Arguments validated and sensible default applied if illegal
    // Use of constants make change easier and less error prone.
    // Furthermore, using a custom constructor guarantees that the
    // number of cylinders for the engine is set. We can reduce the
    // number of setter method needed if we use custom constructor arguments,
    // which also promotes reliability. But don't use more than three or four.
    public Car(int numOfCylinders) {
        reportService = new CarReportService(this);
        if(numOfCylinders < MIN_CYL || numOfCylinders > MAX_CYL) {
            // if illegal use default
            engine = new Engine(MIN_CYL);
            engineType = "V" + MIN_CYL;
        } else {
            engine = new Engine(numOfCylinders);
            engineType = "V" + numOfCylinders;
        }
    }

    // Car delegates to engine
    public void start() {
        engine.startEngine();
        reportService.produceEngineType();
    }

    // Car delegates to engine
    public void turnOff() {
        engine.stop();
    }

    public String getEngineType() {
        return engineType;
    }

    public boolean isRunning() {
        return engine.isRunning();
    }

}
