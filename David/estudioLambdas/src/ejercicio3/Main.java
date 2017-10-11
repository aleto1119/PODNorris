package ejercicio3;

import ejercicio1.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by david.serrano on 10/3/2017.
 */
public class Main {

    public static void main(String[] args) {

        /*Make a static method called allMatches. It should take a List of Strings and a
        Predicate<String>, and return a new List of all the values that passed the test. Test it with several
        examples.*/
        List<String> finalList1;
        List<String> finalList2;
        List<String> finalList3;
        List<String> lista = new ArrayList<>();
        seteoLista(lista);

        //llamamos nuestro metodo allMatches
        finalList1 = ElementUtils.allMatches(lista, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.length() < 4) {
                    return true;
                }
                return false;
            }
        });

        finalList1 = ElementUtils.allMatches(lista, s -> s.length() < 4);
        System.out.println(Arrays.asList(finalList1));

        //
        /*finalList2 = ElementUtils.allMatches(lista, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.contains("b")) {
                    return true;
                }
                return false;
            }
        });*/

        finalList2 = ElementUtils.allMatches(lista, s -> s.contains("b"));
        System.out.println(Arrays.asList(finalList2));


        /*Redo allMatches so it works on any List and associated Predicate, not just on Strings. Verify that
        your examples from #1 still work.*/

        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);

        /*List<Integer> bigNums = ElementUtils.allMatchesGeneral(nums, n -> n > 500);
        System.out.println(Arrays.asList(bigNums));*/

        /*Predicate p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n > 500;
            }
        };*/

        //lo que me indica el tipo de dato es con el que fue definido el Predicate o el objeto de retorno.
        Predicate<Integer> a = n -> n > 500;

        List<Integer> intList = ElementUtils.allMatchesGeneral(nums, a);

        System.out.println(Arrays.asList(intList));

        /*Make a static method called transformedList. It should take a List of Strings and a
        Function<String,String> and return a new List that contains the results of applying the Function to
        each element of the original List.*/
        List<String> words = Arrays.asList("pepe", "papa", "popo", "vaca");

        /*
        Function<String, String> f = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s+"!";
            }
        };
        */

        List<String> excitingWords = ElementUtils.transformedList(words, s -> s + "!");
        System.out.println(Arrays.asList(excitingWords));

        /*
        Redo transformedList so it works with generic types. Verify that your examples from #3 still work.
        But now*/
        List<String> excitingWordsGeneric = ElementUtils.transformedListGeneric(words, s -> s + "!");
        System.out.println(Arrays.asList(excitingWordsGeneric));
        /*
        Function<String, Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        */
        List<Integer> wordLengths = ElementUtils.transformedListGeneric(words, String::length);
        System.out.println(Arrays.asList(wordLengths));


        //System.out.println(Arrays.asList(lista));



    }

    private static void seteoLista(List<String> lista){
        lista.add("abbbbbbbbbb");
        lista.add("baaaaaaaaaa");
        lista.add("voy");
    }

}
