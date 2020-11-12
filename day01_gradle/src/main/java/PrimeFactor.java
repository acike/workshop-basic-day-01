import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Integer[] of(int input) {
        List<Integer> results = new ArrayList<>();
        int primeNumber = 2;
        int r2 = input/primeNumber;
        results.add(primeNumber);
//        while(r2 > 1) {
        for(;r2 > 1; r2 = r2/primeNumber){
            results.add(primeNumber);
        }
        return results.toArray(new Integer[0]);
    }
}
