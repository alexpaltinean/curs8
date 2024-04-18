package inheritance;

public class Citizen implements Person {
    @Override
    public double getMass() {
        return 80;
    }

    @Override
    public double getDensity() {
        return 0;
    }

    @Override
    public String getSound() {
        return null;
    }
}
