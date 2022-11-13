package class_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CarTest {
    public static <Cars> void main(String[] args) {
        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));

        System.out.println("\n==========Print for each==========\n");
        cars.forEach(System.out::println);

        System.out.println("\n==========Most expensive==========\n");

        Car mostExpensive = cars.get(0);
        for (Car car : cars) {
            if(car.price > mostExpensive.price) mostExpensive = car;
        }
        System.out.println(mostExpensive);

        System.out.println("\n==========Cheapest==========\n");
        Car cheapest = cars.get(0);
        for (Car car : cars) {
            if(car.price < cheapest.price) cheapest = car;
        }
        System.out.println(cheapest);

        System.out.println("\n==========How many black cars==========\n");
        int black = 0;
        for (Car car : cars) {
            if(car.color.equals("Black")) black++;
        }
        System.out.println(black);


        System.out.println("\n==========How many black cars with stream()==========\n");
        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count());


        /*
        count all the cars that are blue or beige or 2023 -> 3
        */

        /*
        remove all the cars that are tesla and print the size of the cars
        expected: 3
         */

        System.out.println("\n==========How many blue or beige or 2023 cars==========\n");
        int counter = 0;
        for (Car car : cars) {
            if(car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023) counter++;
        }
        System.out.println(counter);

        System.out.println("\n==========Remove all the Tesla cars==========\n");
        Iterator <Car>  teslaIterator =  cars.iterator();
        while(teslaIterator.hasNext()){
           // Car c = teslaIterator.next();
            if(teslaIterator.next().made.equals("Tesla"))teslaIterator.remove();
        }
        System.out.println(cars.size());

//        System.out.println("\n==========Remove all the Tesla cars with removeIf==========\n");
//        cars.removeIf(c -> c.made.equals("Tesla"));
//        System.out.println(cars.size());

    }
}
