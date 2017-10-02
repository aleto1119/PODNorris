package com.java.lessons.lambda.complex;

/**
 * Created by diego.joya on 9/28/2017.
 */
public class Exercise2GenericComplexLambdas {

    public static void main(String[] args) {

        String a = "Amarillo";
        String b = "Rojo";

        String result = betterElement(a, b, new TwoElementPredicate<String>() {
            @Override
            public boolean compare(String a, String b) {
                return a.length() > b.length();
            }
        });

        System.out.println("Better String with nice classic and pristine way: " + result);

        result = betterElement(a, b, (String d , String e) -> a.length() > b.length() );
        System.out.println("Better String with wtf lambda way: " + result);


        Car car1 = new Car();
        car1.gears = 5;
        car1.brand = "VW";

        Car car2 = new Car();
        car2.gears = 4;
        car2.brand = "BMW";


        Car car3 = betterElement(car1, car2, (Car d , Car e) -> car1.gears > car2.gears );
        System.out.println("Better Car with wtf lambda way: " + car3.brand);


        car3 = betterElement(car1, car2, new TwoElementPredicate<Car>() {
            @Override
            public boolean compare(Car a, Car b) {
                return car1.gears > car2.gears;
            }
        });
        System.out.println("Better Car with nice classic way: " + car3.brand);
    }

    static <T extends Object> T betterElement(T a, T b, TwoElementPredicate<T> predicate) {
        if(predicate.compare(a , b)) {
            return a;
        } else {
            return b;
        }
    }

    interface TwoElementPredicate<T> {
        boolean compare(T a, T b);
    }

}
