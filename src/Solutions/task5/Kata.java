package Solutions.task5;

import java.util.ArrayList;
import java.util.Collections;

public class Kata {
    public static int[] sortArray(int[] array) {
        if(array.length==0) return new int[0];
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1) odd.add(array[i]);
        }
        Collections.sort(odd);
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                array[i]=odd.get(0);
                odd.remove(0);
            }
        }
        return array;
    }
}
