package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by david.serrano on 10/4/2017.
 */
public class ElementUtils {

    public static List<String> allMatches(List<String> lista, Predicate<String> predicate){
        List<String> newList = new ArrayList<>();

        for(String element: lista){
            if(predicate.test(element)){
                newList.add(element);
            }
        }

        return newList;

    }

    public static <T> List<T> allMatchesGeneral(List<T> lista, Predicate<T> predicate){
        List<T> newList = new ArrayList<>();

        for(T element: lista){
            if(predicate.test(element)){
                newList.add(element);
            }
        }

        return newList;

    }

    public static List<String> transformedList(List<String> lista, Function<String, String> funcion){

        List<String> finalList = new ArrayList<>();
        for(String elemento: lista){
            finalList.add(funcion.apply(elemento));
        }
        return finalList;
    }

    public static <S,T> List<T> transformedListGeneric(List<S> lista, Function<S, T> funcion){

        List<T> finalList = new ArrayList<>();
        for(S elemento: lista){
            finalList.add(funcion.apply(elemento));
        }
        return finalList;
    }
}
