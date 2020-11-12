import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Integer[] of(int input) {
        List<Integer> results = new ArrayList<>();
        int r1 = 2;
        int r2 = input/r1;
        results.add(r1);
        while(r2 > 1) {
            results.add(r1);
            r2 = r2/r1;
        }
        return results.toArray(new Integer[0]);
    }
}
