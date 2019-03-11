package clazz.encapsulation.good;

/**
 * This class is also hidden (encapsulated).
 * 
 * @author jlombardo
 */
public class Engine {
    private int cylinderCount;
    private boolean running;

    // No validation necessary because it's done in Car
    public Engine(int numOfCylinders) {
        cylinderCount = numOfCylinders;
    }

    public void startEngine() {
        if(!running) {
            running = true;
        }
        // check oil
    }

    public void stop() {
        if(running) {
            running = false;
        }
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public boolean isRunning() {
        return running;
    }


}
