package ejercicio1;

/**
 * Created by david.serrano on 10/3/2017.
 */
public class Utils {

    public static int eComparison(String o1, String o2){
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

}
