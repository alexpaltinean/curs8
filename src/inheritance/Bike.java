package inheritance;

public class Bike extends Vehicle {
    private int speed;

    public Bike(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(int amount) {
        if (this.speed + amount < 0) {
            System.out.println("Speed cannot be smaller than 0");
            return;
        }
        this.speed += amount;
    }

    public void increaseSpeed() {
        this.speed++;
    }

    public void increaseSpeed(double multiplier){
        this.speed *=multiplier;
    }


    public void stop() {
        this.speed = 0;
    }

    @Override
    public double getMass() {
        return 15;
    }

    @Override
    public double getDensity() {
        return 10;
    }

    public int getSpeed() {
        return this.speed;
    }
}
