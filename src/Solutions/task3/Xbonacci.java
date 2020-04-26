package Solutions.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        List<Double> list = Arrays.stream(s).boxed()
                .collect(Collectors.toList());
        if (n==0) return new double[0];
        if (list.size()<3)
            return list.stream()
                    .limit(n)
                    .mapToDouble(x->x)
                    .toArray();
        else {
            recFillList(list,s,n);
            return list.stream()
                    .limit(n)
                    .mapToDouble(x->x)
                    .toArray();
        }
    }

    public double[] recFillList(List<Double> list, double[] s, int n){
        list.add(s[0]+s[1]+s[2]);
        double[] temp = new double[]{list.get(list.size()-3),
                list.get(list.size()-2),
                list.get(list.size()-1)};
        if (list.size()<n){
            return recFillList(list,temp,n);
        }
        else return temp;
    }
}
