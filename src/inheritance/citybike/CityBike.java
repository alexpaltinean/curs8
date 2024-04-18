package inheritance.citybike;

import inheritance.Bike;

public class CityBike extends Bike {
    private boolean lightState;

    public CityBike() {
        super(50);
    }

    public CityBike(int speed) {
        super(speed);
    }

    public boolean isLightState() {
        return lightState;
    }

    public void setLightState(boolean lightState) {
        this.lightState = lightState;
    }


    public double getMass() {
        double fromParent = super.getMass();
        return fromParent - 1;
    }
}
