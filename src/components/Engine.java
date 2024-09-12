package components;

/**
 * Класс "двигатель"
 */
public class Engine {
    private boolean isServiceability; //работоспособность

    public Engine() {
    }

    public Engine(boolean isServiceability) {
        this.isServiceability = isServiceability;
    }

    public boolean isServiceability() {
        return isServiceability;
    }

    public void setServiceability(boolean serviceability) {
        isServiceability = serviceability;
    }
}