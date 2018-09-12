package tech.bts.exercises.classes.cars;

public class Car {

    // Fields/ properties
  private String model;
  private int speed;

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
    public void decelerate (int amount) {
        this.speed = this.speed - amount;
        if (this.speed < 0) {
            this.speed = 0;

        }

    }

    public int getSpeed() {

        int result = this.speed;
        return result;
    }

    public void printStatus() {
        System.out.println (this.model +" driving at " + this.speed + " km/h");


    }

}
