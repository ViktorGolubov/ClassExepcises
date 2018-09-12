package tech.bts.exercises.classes.cars;

public class Car {

    // Fields/ properties
    String model;
    int speed;

    // Constructor
    public Car (String model) {
        this.model = model;
        this.speed = 0;



    }

    // Methods / functions

    public void accelerate(int amount) {
        this.speed = this.speed + amount;
        if (this.speed > 300 ){
            this.speed = 300;
        }



    }

    public void printStatus() {
        System.out.println (this.model +" driving at " + this.speed + " km/h");


    }

}
