package clazz.encapsulation.poor;

/**
 *
 * @author jlombardo
 */
public class Engine {
    private int cylinderCount;
    private boolean running;

    // Is using the default constructor always a good idea?
    // What happens if setCylinderCount() is never called?
    public Engine() {
    }

    public void setCylinderCount(int value) {
        cylinderCount = value;
    }

    public void start() {
        if(!running) {
            running = true;
        }
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
