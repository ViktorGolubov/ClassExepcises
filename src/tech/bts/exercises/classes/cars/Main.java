package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO", 200);


        Car audi = new Car("Audi TT", 220);


        System.out.println( ferrari.model +" driving at " + ferrari.speed + " km/h"  );
        System.out.println( audi.model +" driving at " + audi.speed + " km/h"  );
    }
}
