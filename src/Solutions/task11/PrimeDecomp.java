package Solutions.task11;

import java.util.Map;
import java.util.TreeMap;

public class PrimeDecomp {

    public static String factors(int n) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=2;i<=n;i++){
            int count=0;
            if(n%i==0){
                while (n%i==0){
                    n=n/i;
                    count++;
                }
            }
            if(count!=0) map.put(i,count);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,Integer> x: map.entrySet()){
            if(x.getValue()!=1) sb.append("(").append(x.getKey()).append("**").append(x.getValue()).append(")");
            else sb.append("(").append(x.getKey()).append(")");
        }
        return sb.toString();// your code
    }
}
