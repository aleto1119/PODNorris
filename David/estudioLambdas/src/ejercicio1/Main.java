package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by david.serrano on 10/3/2017.
 */
public class Main {

    public static void main(String[] args) {

        //Create the String Array
        List<String> lista = new ArrayList<String>();
        seteoLista(lista);

        /*• length (i.e., shortest to longest)
        (Hint: this exact solution was shown in the lecture)*/
        shortestToLongest(lista);
        System.out.println(Arrays.asList(lista));

        /*• reverse length (i.e., longest to shortest)
        (Hint: minor variation of the first bullet)*/
        longestToShortest(lista);
        System.out.println(Arrays.asList(lista));

        /*• alphabetically by the first character only
        (Hint: charAt(0) returns the numeric code for the first character)*/
        alphabetically(lista);
        System.out.println(Arrays.asList(lista));

        /*• Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
        (Hint: remember that the body of a lambda is allowed to have curly braces and a return statement.
                See the first two lambda examples in the notes.)*/
        firstStringsWithE(lista);
        System.out.println(Arrays.asList(lista));

        /*• Redo the previous problem, but use a static helper method so that your lambda looks like this:
        Arrays.sort(words, (s1,s2) -> ejercicio1.Utils.yourMethod(s1,s2))*/
        firstStringsWithEStaticHelper(lista);
        System.out.println(Arrays.asList(lista));

        /*Test Method Reference*/
        firstStringsWithEStaticHelperMethodReference(lista);
        System.out.println(Arrays.asList(lista));



    }

    private static void seteoLista(List<String> lista){
        lista.add("abbbbbbbbbb");
        lista.add("baaaaaaaaaa");
        lista.add("voye");
    }

    private static void shortestToLongest(List<String> list){

        /*list.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                System.out.println("Object one: "+ o1+ ", Object two: "+ o2+ " result: " + result);
                return result;
            }
        });*/

       list.sort((o1, o2) -> o1.length() - o2.length());

    }

    private static void longestToShortest(List<String> list){

        /*list.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                return result;
            }

        }.reversed());*/

        Comparator<String> comparator = (o1, o2)-> o1.length() - o2.length();
        list.sort(comparator.reversed());
    }

    private static void alphabetically(List<String> list){

        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        list.sort((o1, o2) -> o1.compareTo(o2) );

    }

    private static void firstStringsWithE(List<String> list){

        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                final String e = "e";
                boolean one = o1.contains(e);
                boolean two = o2.contains(e);

                if (one && !two){
                    return -1;
                }else if(!one && two){
                    return 1;
                }else{
                    return 0;
                }

            }
        });*/

        list.sort((o1,o2) -> {final String e = "e";
            boolean one = o1.contains(e);
            boolean two = o2.contains(e);

            if (one && !two){
                return -1;
            }else if(!one && two){
                return 1;
            }else{
                return 0;
            }
        });
    }

    private static void firstStringsWithEStaticHelper(List<String> list){
        list.sort((o1,o2) -> Utils.eComparison(o1, o2));
    }

    private static void firstStringsWithEStaticHelperMethodReference(List<String> list){
        list.sort(Utils::eComparison);
    }
}
