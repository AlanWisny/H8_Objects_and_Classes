
//  P8.6 Implement a class Car with the following properties.
//  A car has a certain fuel efficiency (measured in miles/gallon) and a certain amount of fuel in the gas tank.
//  The efficciency is specified in the constructor, and the initial fuel lvl is 0.
//  Supply a methode drive that simulates driving the car for a certain distance, reducing the fuel lvl in the gas tank,
//  and methods getGaslvl, to return the current fuel, and addGass, to tank up.

import java.text.DecimalFormat;

public class Car {
    private double fuel = 0;
    private double efficiency = 0;
    DecimalFormat df = new DecimalFormat("##.##");

    public Car(double fuel, double efficiency) {
        this.fuel = fuel;
        this.efficiency = efficiency;
    }


    public void drive(double miles) {
        if (miles <= (fuel * efficiency)){
            fuel = fuel - (miles / efficiency);
            System.out.println("You drove for " + miles + " miles.");
            System.out.println("You used up " + df.format(miles / efficiency) + " gallons of fuel.");
            System.out.println("Your new fuel level is :" + df.format(fuel) + ". You can drive for " +(fuel * efficiency)+ "miles.");
        } else {
            System.out.println("You can't drive that far. You only have the fuel for " +(fuel * efficiency)+ "miles." );
        }

    }

    public void addGas(double gallons) {
        fuel = fuel + gallons;
        System.out.println("You have tanked. New fuel level is: " + df.format(fuel));
    }




    public double getFuel() {
        System.out.println("Your current fuel level is :" + df.format(fuel));
        return fuel;
    }
}
