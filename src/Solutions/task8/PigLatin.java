package Solutions.task8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !"));
    }

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(x->x.matches("\\w+") ? x.substring(1).concat(x.substring(0,1)).concat("ay").concat(" "):x)
                .collect(Collectors.joining())
                .trim();
    }
}
