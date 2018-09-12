package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO", 300);
        Car audi = new Car("Audi TT", 250);

        ferrari.accelerate(500);
        audi.accelerate(500);

        System.out.println(ferrari);
        System.out.println(audi);

        int speed1 = ferrari.getSpeed();
        int speed2 = audi.getSpeed();

        int difference = speed1 - speed2;
        System.out.println("difference = " + difference);


    }
}
