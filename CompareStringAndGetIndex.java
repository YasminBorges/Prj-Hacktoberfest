import java.util.function.BiFunction;
import java.util.*;
public class CompareStringAndGetIndex {
    public static final BiFunction<List<String>,List<String>, List<Integer>> fun = (arr, comp) -> {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<comp.size();i++){
           for(int j=0;j<arr.size();j++){
               if(arr.get(j).equalsIgnoreCase(comp.get(i))){
                   res.add(j);
               }
           }
        }
        return res;
    };
    public static void main(String args[]) {
        List<String> a1 = new ArrayList<>(Arrays.asList("Abc", "Nikhil", "Bacha", "Idarna", "Zinda"));
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList("nikhil", "Abc", "Zin", "zindA"));
        System.out.println(fun.apply(a1,a2));
    }
}
//OUTPUT IS
//[1, 0, 4]
