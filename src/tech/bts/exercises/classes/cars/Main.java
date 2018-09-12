package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car();
        ferrari.model = "Ferrari GTO";
        ferrari.speed = 200;


        Car audi = new Car();
        audi.model = "TT";
        audi.speed = 220;



        System.out.println( ferrari.model +" driving at " + ferrari.speed + " km/h"  );
        System.out.println( "Audi" + audi.model +" driving at " + audi.speed + " km/h"  );
    }
}
