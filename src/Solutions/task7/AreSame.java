package Solutions.task7;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        try {
            Arrays.sort(b);
            return Arrays.equals(b,Arrays.stream(a)
                        .map(x->x*x)
                        .sorted()
                        .toArray());
        } catch (Exception e) {
            return false;
        }
    }
}
