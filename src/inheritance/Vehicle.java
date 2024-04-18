package inheritance;

public abstract class Vehicle implements MaterialObject {

    private int speed;

    int getSpeed() {
        return this.speed;
    }

    double getImpactForce() {
        return getMass() * getSpeed();
    }
}
