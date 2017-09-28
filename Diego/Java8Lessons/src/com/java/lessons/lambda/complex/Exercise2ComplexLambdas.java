package com.java.lessons.lambda.complex;

/**
 * Created by diego.joya on 9/28/2017.
 */
public class Exercise2ComplexLambdas {

    public static void main(String[] args) {

        String a = "Amarillo";
        String b = "Rojo";

        String result = betterString(a, b, new TwoStringPredicate() {
            @Override
            public boolean compare(String a, String b) {
                return a.length() > b.length();
            }
        });

        System.out.println("Better String with nice classic and pristine way: " + result);

        result = betterString(a, b, (String d , String e) -> a.length() > b.length() );
        System.out.println("Better String with wtf lambda way: " + result);

    }

    static String betterString(String a, String b, TwoStringPredicate predicate) {
        if(predicate.compare(a , b)) {
            return a;
        } else {
            return b;
        }


    }

    interface TwoStringPredicate {

        boolean compare(String a, String b);
    }
}
