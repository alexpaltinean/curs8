package inheritance;

import inheritance.citybike.CityBike;

public class Main {
    public static void main(String[] args) {
        CityBike c = new CityBike();
        System.out.println(c.getMass());
        c.increaseSpeed();

        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike(34);
        bikes[1] = new CityBike(22);
        bikes[2] = new MountainBike(45);

        for (Bike b : bikes) {
            System.out.println(b.getMass());
        }

        Citizen citizen = new Citizen();
        Being a = citizen;
        MaterialObject b = citizen;

        a.getMass();
        b.getMass();
    }


}
