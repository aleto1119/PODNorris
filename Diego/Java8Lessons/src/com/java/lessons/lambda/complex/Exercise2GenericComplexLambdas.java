package com.java.lessons.lambda.complex;

/**
 * Created by diego.joya on 9/28/2017.
 */
public class Exercise2GenericComplexLambdas {

    public static void main(String[] args) {

        String a = "Amarillo";
        String b = "Rojo";

        String result = betterEntry(a, b, new TwoElementPredicate<String>() {
            @Override
            public boolean compare(String a, String b) {
                return a.length() > b.length();
            }
        });

        System.out.println("Better String with nice classic and pristine way: " + result);

        result = betterEntry(a, b, (Object d , Object e) -> a.length() > b.length() );
        System.out.println("Better String with wtf lambda way: " + result);


        Car car1 = new Car();
        car1.gears = 5;

        Car car2 = new Car();
        car2.gears = 4;


        result = betterEntry(car1, car2, (Object d , Object e) -> car1 > car2 );
        System.out.println("Better Car with wtf lambda way: " + result);

    }

    static <T extends Object> T betterEntry(T a, T b, TwoElementPredicate predicate) {
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
