package tech.bts.exercises.classes.cars;

public class Car {

    // Fields/ properties
    String model;
    int speed;

    // Constructor
    public Car (String model, int speed) {
        this.model = model;
        this.speed = speed;



    }

    // Methods / functions

    public void printStatus() {
        System.out.println (this.model +" driving at " + this.speed + " km/h");


    }

}
