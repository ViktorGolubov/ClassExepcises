package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO");
        Car audi = new Car("Audi TT");

        ferrari.speed = 200;

        ferrari.printStatus();

        audi.printStatus();


    }
}
