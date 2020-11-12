import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class DemoLoop {
    public static void main(String... args) {
        DemoLoop demoLoop = new DemoLoop();
        demoLoop.demoList();
        demoLoop.demo01();
    }

    private void demoList() {
        List<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(2);
        for (Integer score : scores) {
            out.println(score);
        }
        int[] scores2 = new int[5];
        List out = Arrays.asList(scores2);
//        Collections.
    }

    private void demo01() {
        int[] scores2 = new int[]{1,2,3,4,5};
        int[] scores = new int[5];
        scores[0] = 1;
        scores[1] = 2;
        int len = scores.length;
        for (int i = 0; i < len; i++) {
            out.println(scores[i]);
        }

        for(int s: scores) {
            out.println(s);
        }
    }

}
