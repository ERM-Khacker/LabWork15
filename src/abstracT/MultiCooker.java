package abstracT;

public abstract class MultiCooker extends AbstractDevice {
    void powerOn() {
        System.out.println("MultiCooker is turn on");
    }

    void powerOff() {
        System.out.println("MultiCooker is turn off");
    }

    abstract void cook();
}
