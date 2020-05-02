package Solutions.task9;

import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        List<Integer> list = text.toLowerCase().chars().boxed().collect(Collectors.toList());
        List<Integer> temp = text.toLowerCase().chars().boxed().distinct().collect(Collectors.toList());
        int count=0;
        int result=0;
        for(Integer x: temp){
            for(Integer y: list){
                if(x==y) {
                    count++;
                }
            }
            if(count>1){
                result++;
            }
            count=0;
        }
        return result;
    }
}
