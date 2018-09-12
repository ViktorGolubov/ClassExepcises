package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO");
        Car audi = new Car("Audi TT");

        ferrari.accelerate(100);
        ferrari.accelerate(50);
        ferrari.accelerate(150);
        ferrari.accelerate(99);
        ferrari.accelerate(50);

        ferrari.printStatus();

        audi.printStatus();


    }
}
