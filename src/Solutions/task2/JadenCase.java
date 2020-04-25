package Solutions.task2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if(phrase != null&& !phrase.equals("")){
            return Arrays.stream(phrase.split(" "))
                    .map(x->x.substring(0,1).toUpperCase()+x.substring(1)+" ")
                    .collect(Collectors.joining())
                    .trim();
        }
        return null;
    }

}