package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO");
        Car audi = new Car("Audi TT");

        ferrari.accelerate(100);
        audi.accelerate(30);

        System.out.println(ferrari);
        System.out.println(audi);

        int speed1 = ferrari.getSpeed();
        int speed2 = audi.getSpeed();

        int difference = speed1 - speed2;
        System.out.println("difference = " + difference);


    }
}
