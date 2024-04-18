package inheritance;

public class MountainBike extends Bike{
    private int suspensionStrength;

    public MountainBike(int speed) {
        super(speed);
    }

    public int getSuspensionStrength() {
        return suspensionStrength;
    }

    public void setSuspensionStrength(int suspensionStrength) {
        this.suspensionStrength = suspensionStrength;
    }

    @Override
    public double getMass() {
        return 20;
    }
}
